package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class on extends sn {
    public float a;

    public on(float f) {
        this.a = f;
    }

    @Override // defpackage.sn
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        return 0.0f;
    }

    @Override // defpackage.sn
    public final int b() {
        return 1;
    }

    @Override // defpackage.sn
    public final sn c() {
        return new on(0.0f);
    }

    @Override // defpackage.sn
    public final void d() {
        this.a = 0.0f;
    }

    @Override // defpackage.sn
    public final void e(float f, int i) {
        if (i == 0) {
            this.a = f;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof on) && ((on) obj).a == this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}
