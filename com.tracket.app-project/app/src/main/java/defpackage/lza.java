package defpackage;

import android.app.AppOpsManager$OnOpActiveChangedListener;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class lza implements AppOpsManager$OnOpActiveChangedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lza(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        switch (this.a) {
            case 0:
                mza mzaVar = (mza) this.b;
                if (z) {
                    mzaVar.a = System.currentTimeMillis();
                    mzaVar.d = true;
                    return;
                }
                long j = mzaVar.b;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (j > 0) {
                    long j2 = mzaVar.b;
                    if (jCurrentTimeMillis >= j2) {
                        mzaVar.c = jCurrentTimeMillis - j2;
                    }
                }
                mzaVar.d = false;
                return;
            default:
                u6d u6dVar = (u6d) this.b;
                synchronized (u6dVar) {
                    try {
                        if (z) {
                            u6dVar.c = System.currentTimeMillis();
                            u6dVar.f = true;
                        } else {
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            long j3 = u6dVar.d;
                            if (j3 > 0 && jCurrentTimeMillis2 >= j3) {
                                u6dVar.e = jCurrentTimeMillis2 - j3;
                            }
                            u6dVar.f = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }
}
