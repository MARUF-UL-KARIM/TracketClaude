package defpackage;

import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class moc {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public moc(Handler handler) {
        this.a = handler;
    }

    public static /* synthetic */ void f(hoc hocVar) {
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                if (arrayList.size() < 50) {
                    arrayList.add(hocVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static hoc g() {
        hoc hocVar;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                hocVar = arrayList.isEmpty() ? new hoc() : (hoc) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return hocVar;
    }

    public final boolean a() {
        return this.a.hasMessages(37);
    }

    public final hoc b(int i, Object obj) {
        hoc hocVarG = g();
        hocVarG.a = this.a.obtainMessage(i, obj);
        return hocVarG;
    }

    public final void c(int i) {
        this.a.sendEmptyMessage(i);
    }

    public final void d(int i) {
        this.a.removeMessages(i);
    }

    public final void e(Runnable runnable) {
        this.a.post(runnable);
    }
}
