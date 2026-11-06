package defpackage;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class kh {
    public static volatile kh b;
    public boolean a;

    public static kh d() {
        if (b == null) {
            synchronized (kh.class) {
                if (b == null) {
                    kh khVar = new kh();
                    khVar.a = false;
                    synchronized (rw4.class) {
                        if (rw4.y == null) {
                            rw4.y = new rw4();
                        }
                    }
                    b = khVar;
                }
            }
        }
        return b;
    }

    public final void a(String str) {
        if (this.a) {
            Log.d("FirebasePerformance", str);
        }
    }

    public final void b(String str, Object... objArr) {
        if (this.a) {
            Log.d("FirebasePerformance", String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public final void c(String str, Object... objArr) {
        if (this.a) {
            Log.e("FirebasePerformance", String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public final void e(String str, Object... objArr) {
        if (this.a) {
            Log.i("FirebasePerformance", String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public final void f(String str) {
        if (this.a) {
            Log.w("FirebasePerformance", str);
        }
    }

    public final void g(String str, Object... objArr) {
        if (this.a) {
            Log.w("FirebasePerformance", String.format(Locale.ENGLISH, str, objArr));
        }
    }
}
