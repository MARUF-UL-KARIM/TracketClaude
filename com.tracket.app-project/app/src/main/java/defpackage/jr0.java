package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class jr0 implements hr0 {
    public float y;
    public Object z;

    @Override // defpackage.hr0
    public boolean e(float f) {
        if (this.y == f) {
            return true;
        }
        this.y = f;
        return false;
    }

    @Override // defpackage.hr0
    public wj4 g() {
        return (wj4) this.z;
    }

    @Override // defpackage.hr0
    public boolean i(float f) {
        return !((wj4) this.z).c();
    }

    @Override // defpackage.hr0
    public boolean isEmpty() {
        return false;
    }

    @Override // defpackage.hr0
    public float l() {
        return ((wj4) this.z).a();
    }

    @Override // defpackage.hr0
    public float m() {
        return ((wj4) this.z).b();
    }
}
