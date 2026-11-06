package defpackage;

import com.tracket.processing.VideoEncoderInputPixelFormat;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class gk9 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final VideoEncoderInputPixelFormat f;

    public gk9(int i, int i2, int i3, int i4, float f, VideoEncoderInputPixelFormat videoEncoderInputPixelFormat) {
        videoEncoderInputPixelFormat.getClass();
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = f;
        this.f = videoEncoderInputPixelFormat;
    }

    public static gk9 a(gk9 gk9Var, int i, int i2, int i3, int i4, float f, int i5) {
        if ((i5 & 1) != 0) {
            i = gk9Var.a;
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            i2 = gk9Var.b;
        }
        int i7 = i2;
        if ((i5 & 4) != 0) {
            i3 = gk9Var.c;
        }
        int i8 = i3;
        if ((i5 & 8) != 0) {
            i4 = gk9Var.d;
        }
        int i9 = i4;
        if ((i5 & 16) != 0) {
            f = gk9Var.e;
        }
        VideoEncoderInputPixelFormat videoEncoderInputPixelFormat = gk9Var.f;
        videoEncoderInputPixelFormat.getClass();
        return new gk9(i6, i7, i8, i9, f, videoEncoderInputPixelFormat);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gk9)) {
            return false;
        }
        gk9 gk9Var = (gk9) obj;
        return this.a == gk9Var.a && this.b == gk9Var.b && this.c == gk9Var.c && this.d == gk9Var.d && Float.compare(this.e, gk9Var.e) == 0 && this.f == gk9Var.f;
    }

    public final int hashCode() {
        return (this.f.hashCode() + zd2.a(zd2.b(this.d, zd2.b(this.c, zd2.b(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), this.e, 31)) * 31;
    }

    public final String toString() {
        StringBuilder sbS = zd2.s(this.a, this.b, "VideoEncoderRequest(width=", ", height=", ", bitrate=");
        zd2.y(sbS, this.c, ", frameRate=", this.d, ", iFrameInterval=");
        sbS.append(this.e);
        sbS.append(", inputPixelFormat=");
        sbS.append(this.f);
        sbS.append(", outputColorInfo=null)");
        return sbS.toString();
    }
}
