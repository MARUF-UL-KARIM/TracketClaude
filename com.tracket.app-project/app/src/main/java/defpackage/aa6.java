package defpackage;

import android.media.MediaCodec;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class aa6 {
    public MediaCodec.BufferInfo a;
    public int b;
    public int c;
    public int d;
    public int e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa6)) {
            return false;
        }
        aa6 aa6Var = (aa6) obj;
        return ff4.h(this.a, aa6Var.a) && this.b == aa6Var.b && this.c == aa6Var.c && this.d == aa6Var.d && this.e == aa6Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + zd2.b(this.d, zd2.b(this.c, zd2.b(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        MediaCodec.BufferInfo bufferInfo = this.a;
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        int i4 = this.e;
        StringBuilder sb = new StringBuilder("PreparedBuffer(bufferInfo=");
        sb.append(bufferInfo);
        sb.append(", bufferIndex=");
        sb.append(i);
        sb.append(", sampleRate=");
        zd2.y(sb, i2, ", channels=", i3, ", pcmEncoding=");
        return zd2.o(sb, i4, ")");
    }
}
