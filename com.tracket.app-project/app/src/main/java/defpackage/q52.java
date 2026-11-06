package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class q52 {
    public final long a;
    public final float[] b;

    public q52(long j, float[] fArr) {
        this.a = j;
        this.b = fArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q52)) {
            return false;
        }
        q52 q52Var = (q52) obj;
        return this.a == q52Var.a && Arrays.equals(this.b, q52Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "DecodedAudioChunkCommon(positionUs=" + this.a + ", samples=" + Arrays.toString(this.b) + ")";
    }
}
