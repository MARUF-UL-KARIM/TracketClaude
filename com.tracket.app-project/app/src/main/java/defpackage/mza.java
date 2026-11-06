package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class mza {
    public static final String[] e = {"android:establish_vpn_service", "android:establish_vpn_manager"};
    public long a;
    public long b;
    public long c;
    public boolean d;

    public static mza a(Context context, Executor executor) {
        String[] strArr = e;
        mza mzaVar = new mza();
        mzaVar.a = 0L;
        mzaVar.b = 0L;
        mzaVar.c = -1L;
        mzaVar.d = false;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new lza(mzaVar, 0));
            } catch (IllegalArgumentException | NoSuchMethodError unused) {
            }
        }
        return mzaVar;
    }
}
