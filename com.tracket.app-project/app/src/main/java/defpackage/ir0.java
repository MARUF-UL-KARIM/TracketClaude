package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ir0 implements hr0 {
    public final List y;
    public wj4 A = null;
    public float B = -1.0f;
    public wj4 z = a(0.0f);

    public ir0(List list) {
        this.y = list;
    }

    public final wj4 a(float f) {
        List list = this.y;
        wj4 wj4Var = (wj4) list.get(list.size() - 1);
        if (f >= wj4Var.b()) {
            return wj4Var;
        }
        for (int size = list.size() - 2; size >= 1; size--) {
            wj4 wj4Var2 = (wj4) list.get(size);
            if (this.z != wj4Var2 && f >= wj4Var2.b() && f < wj4Var2.a()) {
                return wj4Var2;
            }
        }
        return (wj4) list.get(0);
    }

    @Override // defpackage.hr0
    public final boolean e(float f) {
        wj4 wj4Var = this.A;
        wj4 wj4Var2 = this.z;
        if (wj4Var == wj4Var2 && this.B == f) {
            return true;
        }
        this.A = wj4Var2;
        this.B = f;
        return false;
    }

    @Override // defpackage.hr0
    public final wj4 g() {
        return this.z;
    }

    @Override // defpackage.hr0
    public final boolean i(float f) {
        wj4 wj4Var = this.z;
        if (f >= wj4Var.b() && f < wj4Var.a()) {
            return !this.z.c();
        }
        this.z = a(f);
        return true;
    }

    @Override // defpackage.hr0
    public final boolean isEmpty() {
        return false;
    }

    @Override // defpackage.hr0
    public final float l() {
        List list = this.y;
        return ((wj4) list.get(list.size() - 1)).a();
    }

    @Override // defpackage.hr0
    public final float m() {
        return ((wj4) this.y.get(0)).b();
    }
}
