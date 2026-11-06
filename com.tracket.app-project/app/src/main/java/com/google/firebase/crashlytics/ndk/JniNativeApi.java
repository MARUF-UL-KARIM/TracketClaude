package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import defpackage.bd3;
import defpackage.bh5;
import defpackage.wd0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
class JniNativeApi implements bh5 {
    public static final boolean b;
    public static final c c = new c();
    public final Context a;

    static {
        boolean z;
        try {
            System.loadLibrary("crashlytics");
            z = true;
        } catch (UnsatisfiedLinkError e) {
            Log.e("FirebaseCrashlytics", "libcrashlytics could not be loaded. This APK may not have been compiled for this device's architecture. NDK crashes will not be reported to Crashlytics:\n" + e.getLocalizedMessage(), null);
            z = false;
        }
        b = z;
    }

    public JniNativeApi(Context context) {
        this.a = context;
    }

    public static void a(ArrayList arrayList, PackageInfo packageInfo) {
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null) {
            Collections.addAll(arrayList, strArr);
        }
        File file = new File(applicationInfo.dataDir, wd0.k("files/splitcompat/", Long.toString(packageInfo.getLongVersionCode()), "/verified-splits"));
        if (!file.exists()) {
            String str = "No dynamic features found at " + file.getAbsolutePath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
                return;
            }
            return;
        }
        File[] fileArrListFiles = file.listFiles(c);
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        String str2 = "Found " + fileArrListFiles.length + " APKs in " + file.getAbsolutePath();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str2, null);
        }
        for (File file2 : fileArrListFiles) {
            String str3 = "Adding " + file2.getName() + " to classpath.";
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str3, null);
            }
            arrayList.add(file2.getAbsolutePath());
        }
    }

    private native boolean nativeInit(String[] strArr, Object obj);

    public final boolean b(AssetManager assetManager, String str) {
        String str2 = Build.CPU_ABI;
        Context context = this.a;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 9216);
            ArrayList arrayList = new ArrayList(10);
            arrayList.add(packageInfo.applicationInfo.sourceDir);
            a(arrayList, packageInfo);
            String[] strArr = packageInfo.applicationInfo.sharedLibraryFiles;
            if (strArr != null) {
                Collections.addAll(arrayList, strArr);
            }
            ArrayList arrayList2 = new ArrayList(10);
            File parentFile = new File(packageInfo.applicationInfo.nativeLibraryDir).getParentFile();
            if (parentFile != null) {
                arrayList2.add(new File(parentFile, str2).getPath());
                if (str2.startsWith("arm64")) {
                    arrayList2.add(new File(parentFile, "arm64").getPath());
                } else if (str2.startsWith("arm")) {
                    arrayList2.add(new File(parentFile, "arm").getPath());
                }
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                String str3 = (String) obj;
                if (str3.endsWith(".apk")) {
                    arrayList2.add(str3 + "!/lib/" + str2);
                }
            }
            arrayList2.add(System.getProperty("java.library.path"));
            arrayList2.add(packageInfo.applicationInfo.nativeLibraryDir);
            String str4 = File.pathSeparator;
            String[] strArr2 = {TextUtils.join(str4, arrayList), TextUtils.join(str4, arrayList2)};
            return b && nativeInit(new String[]{strArr2[0], strArr2[1], str}, assetManager);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("FirebaseCrashlytics", "Unable to compose package paths", e);
            bd3.s(e);
            return false;
        }
    }
}
