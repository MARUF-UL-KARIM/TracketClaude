package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class lp3 {
    public final boolean a;
    public final boolean b;

    public lp3(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lp3)) {
            return false;
        }
        lp3 lp3Var = (lp3) obj;
        return this.a == lp3Var.a && this.b == lp3Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "FullFrameSnap(snapX=" + this.a + ", snapY=" + this.b + ")";
    }
}
