package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class v88 {
    public final z15 a;
    public final float b;
    public final float c;
    public final boolean d;
    public final float e;

    public v88(z15 z15Var, float f, float f2, boolean z, float f3) {
        this.a = z15Var;
        this.b = f;
        this.c = f2;
        this.d = z;
        this.e = f3;
    }

    public static v88 a(v88 v88Var, z15 z15Var, int i) {
        return new v88(z15Var, (i & 2) != 0 ? v88Var.b : 0.0f, v88Var.c, v88Var.d, v88Var.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v88)) {
            return false;
        }
        v88 v88Var = (v88) obj;
        return this.a.equals(v88Var.a) && Float.compare(this.b, v88Var.b) == 0 && Float.compare(this.c, v88Var.c) == 0 && this.d == v88Var.d && Float.compare(this.e, v88Var.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + ot5.e(zd2.a(zd2.a(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StabilizationMotionFrame(sourceToNext=");
        sb.append(this.a);
        sb.append(", confidence=");
        sb.append(this.b);
        sb.append(", reprojectionErrorPx=");
        sb.append(this.c);
        sb.append(", isAmbiguous=");
        sb.append(this.d);
        sb.append(", spatialMotionDisagreementRatio=");
        return zd2.h(this.e, ")", sb);
    }
}
