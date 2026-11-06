package org.opencv.imgproc;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public class GeneralizedHoughBallard extends GeneralizedHough {
    private static native void delete(long j);

    private static native int getLevels_0(long j);

    private static native int getVotesThreshold_0(long j);

    private static native void setLevels_0(long j, int i);

    private static native void setVotesThreshold_0(long j, int i);

    @Override // org.opencv.imgproc.GeneralizedHough, org.opencv.core.Algorithm
    public final void finalize() {
        delete(this.a);
    }
}
