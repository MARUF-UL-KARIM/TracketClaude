package defpackage;

import android.content.Context;
import android.view.TextureView;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public abstract class jmb extends TextureView {
    public final j52 y;
    public final wmb z;

    public jmb(Context context) {
        super(context);
        this.y = new j52();
        this.z = new wmb(context, this);
    }

    public void A(String str, String[] strArr, Integer num) {
        f(str);
    }

    public abstract String d();

    public abstract void e(mmb mmbVar);

    public abstract void f(String str);

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public abstract int o();

    public abstract int p();

    public abstract void q(int i);

    public abstract void r(float f, float f2);

    public abstract int s();

    public abstract int t();

    public abstract long u();

    public abstract long v();

    public abstract long w();

    public abstract int x();

    public abstract void y();

    public Integer z() {
        return null;
    }

    public void B(int i) {
    }

    public void C(int i) {
    }

    public void a(int i) {
    }

    public void b(int i) {
    }

    public void c(int i) {
    }
}
