package org.opencv.features2d;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public class SimpleBlobDetector extends Feature2D {
    private static native long create_0(long j);

    private static native long create_1();

    private static native void delete(long j);

    private static native long getBlobContours_0(long j);

    private static native String getDefaultName_0(long j);

    private static native long getParams_0(long j);

    private static native void setParams_0(long j, long j2);

    @Override // org.opencv.features2d.Feature2D, org.opencv.core.Algorithm
    public final void finalize() {
        delete(this.a);
    }
}
