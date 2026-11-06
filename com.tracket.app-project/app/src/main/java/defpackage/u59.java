package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class u59 {
    public final float a;
    public final float b;

    public u59(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u59)) {
            return false;
        }
        u59 u59Var = (u59) obj;
        return Float.compare(this.a, u59Var.a) == 0 && Float.compare(this.b, u59Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return iu1.i("TrackingPoint(x=", this.a, ", y=", this.b, ")");
    }
}
