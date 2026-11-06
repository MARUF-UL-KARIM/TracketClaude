package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class q4a extends jn6 implements Serializable {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int z;

    @Override // defpackage.jn6
    public final int a(int i) {
        return (c() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // defpackage.jn6
    public final int c() {
        int i = this.z;
        int i2 = i ^ (i >>> 2);
        this.z = this.A;
        this.A = this.B;
        this.B = this.C;
        int i3 = this.D;
        this.C = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.D = i4;
        int i5 = this.E + 362437;
        this.E = i5;
        return i4 + i5;
    }
}
