package defpackage;

import android.media.MediaCodecInfo;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class i35 {
    public final int a;
    public MediaCodecInfo[] b;

    public i35(int i, boolean z, boolean z2, boolean z3) {
        switch (i) {
            case 1:
                int i2 = 1;
                if (!z && !z2 && !z3) {
                    i2 = 0;
                }
                this.a = i2;
                break;
            default:
                this.a = (z || z2 || z3) ? 1 : 0;
                break;
        }
    }
}
