package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class o88 {
    public final long a;
    public final float b;

    public o88(float f, long j) {
        this.a = j;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o88)) {
            return false;
        }
        o88 o88Var = (o88) obj;
        return this.a == o88Var.a && Float.compare(this.b, o88Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "StabilizationFrameDifference(positionInClipUs=" + this.a + ", meanAbsoluteDifference=" + this.b + ")";
    }
}
