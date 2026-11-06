package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ec5 {
    public final float a;
    public final boolean b;

    public ec5(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec5)) {
            return false;
        }
        ec5 ec5Var = (ec5) obj;
        return Float.compare(this.a, ec5Var.a) == 0 && this.b == ec5Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "MotionSupport(reprojectionErrorPx=" + this.a + ", isSceneConsistent=" + this.b + ")";
    }
}
