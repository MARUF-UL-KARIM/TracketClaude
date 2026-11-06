package defpackage;

import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class sp8 {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public sp8(Handler handler) {
        this.a = handler;
    }

    public static rp8 c() {
        rp8 rp8Var;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                rp8Var = arrayList.isEmpty() ? new rp8() : (rp8) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return rp8Var;
    }

    public final rp8 a(int i) {
        rp8 rp8VarC = c();
        rp8VarC.a = this.a.obtainMessage(i);
        return rp8VarC;
    }

    public final rp8 b(int i, Object obj) {
        rp8 rp8VarC = c();
        rp8VarC.a = this.a.obtainMessage(i, obj);
        return rp8VarC;
    }

    public final void d(Runnable runnable) {
        this.a.post(runnable);
    }

    public final void e(int i) {
        iyd.g(i != 0);
        this.a.removeMessages(i);
    }

    public final void f(int i) {
        this.a.sendEmptyMessage(i);
    }
}
