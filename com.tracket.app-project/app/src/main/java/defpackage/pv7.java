package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class pv7 {
    public final tv7 a;
    public final float b;

    public pv7(tv7 tv7Var, float f) {
        this.a = tv7Var;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pv7)) {
            return false;
        }
        pv7 pv7Var = (pv7) obj;
        return this.a.equals(pv7Var.a) && Float.compare(this.b, pv7Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PolygonFit(center=" + this.a + ", scale=" + this.b + ")";
    }
}
