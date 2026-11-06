package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;
import defpackage.n64;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public interface ImageOutput {
    public static final n64 a = new n64();

    void onImageAvailable(long j, Bitmap bitmap);
}
