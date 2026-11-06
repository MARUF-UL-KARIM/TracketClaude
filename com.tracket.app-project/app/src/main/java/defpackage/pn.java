package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class pn extends sn {
    public float a;
    public float b;

    public pn(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.sn
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.b;
    }

    @Override // defpackage.sn
    public final int b() {
        return 2;
    }

    @Override // defpackage.sn
    public final sn c() {
        return new pn(0.0f, 0.0f);
    }

    @Override // defpackage.sn
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
    }

    @Override // defpackage.sn
    public final void e(float f, int i) {
        if (i == 0) {
            this.a = f;
        } else {
            if (i != 1) {
                return;
            }
            this.b = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pn)) {
            return false;
        }
        pn pnVar = (pn) obj;
        return pnVar.a == this.a && pnVar.b == this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.a + ", v2 = " + this.b;
    }
}
