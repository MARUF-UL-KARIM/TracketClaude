package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public abstract class vh1 {
    public static final st3 a = new st3("CommonUtils");

    public static String a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            String strConcat = "Exception thrown when trying to get app version ".concat(e.toString());
            st3 st3Var = a;
            if (!Log.isLoggable(st3Var.a, 6)) {
                return "";
            }
            String str = st3Var.b;
            if (str != null) {
                strConcat = str.concat(strConcat);
            }
            Log.e("CommonUtils", strConcat);
            return "";
        }
    }
}
