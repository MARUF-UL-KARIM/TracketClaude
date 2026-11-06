package defpackage;

import android.media.MediaCodec;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class gy1 {
    public byte[] a;
    public byte[] b;
    public int c;
    public int[] d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    public final MediaCodec.CryptoInfo i;
    public final Object j;

    public gy1(int i) {
        switch (i) {
            case 1:
                MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
                this.i = cryptoInfo;
                this.j = new soa(cryptoInfo);
                break;
            default:
                MediaCodec.CryptoInfo cryptoInfo2 = new MediaCodec.CryptoInfo();
                this.i = cryptoInfo2;
                this.j = new ha4(cryptoInfo2);
                break;
        }
    }

    public void a(int i) {
        if (i == 0) {
            return;
        }
        int[] iArr = this.d;
        if (iArr == null) {
            iArr = new int[1];
            this.d = iArr;
            this.i.numBytesOfClearData = iArr;
        }
        iArr[0] = iArr[0] + i;
    }
}
