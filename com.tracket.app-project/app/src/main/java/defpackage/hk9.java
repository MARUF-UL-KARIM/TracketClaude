package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class hk9 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public hk9(int i, float f, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk9)) {
            return false;
        }
        hk9 hk9Var = (hk9) obj;
        return this.a == hk9Var.a && this.b == hk9Var.b && this.c == hk9Var.c && this.d == hk9Var.d && Float.compare(this.e, hk9Var.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + zd2.b(this.d, zd2.b(this.c, zd2.b(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbS = zd2.s(this.a, this.b, "VideoEncoderResolvedConfig(width=", ", height=", ", bitrate=");
        zd2.y(sbS, this.c, ", frameRate=", this.d, ", iFrameInterval=");
        return zd2.h(this.e, ")", sbS);
    }
}
