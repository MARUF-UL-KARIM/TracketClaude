package defpackage;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ik9 {
    public final hk9 a;
    public final MediaCodec b;
    public final SurfaceTexture c;
    public final Surface d;

    public ik9(hk9 hk9Var, MediaCodec mediaCodec, SurfaceTexture surfaceTexture, Surface surface) {
        this.a = hk9Var;
        this.b = mediaCodec;
        this.c = surfaceTexture;
        this.d = surface;
    }

    public final void a() {
        try {
            this.d.release();
        } catch (Throwable unused) {
        }
        try {
            SurfaceTexture surfaceTexture = this.c;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
        } catch (Throwable unused2) {
        }
    }
}
