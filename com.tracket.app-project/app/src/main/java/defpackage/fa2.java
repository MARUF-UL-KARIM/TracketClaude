package defpackage;

import android.util.Base64;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fa2 implements yk8 {
    public final /* synthetic */ int y;

    @Override // defpackage.yk8
    public final Object get() {
        switch (this.y) {
            case 0:
                byte[] bArr = new byte[12];
                ha2.i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            case 1:
                return new w92();
            case 2:
                try {
                    return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                } catch (Exception e) {
                    ce9.n(e);
                    return null;
                }
            default:
                throw new IllegalStateException();
        }
    }
}
