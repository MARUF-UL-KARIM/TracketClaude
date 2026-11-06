package org.opencv.video;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public class BackgroundSubtractorKNN extends BackgroundSubtractor {
    private static native void delete(long j);

    private static native boolean getDetectShadows_0(long j);

    private static native double getDist2Threshold_0(long j);

    private static native int getHistory_0(long j);

    private static native int getNSamples_0(long j);

    private static native double getShadowThreshold_0(long j);

    private static native int getShadowValue_0(long j);

    private static native int getkNNSamples_0(long j);

    private static native void setDetectShadows_0(long j, boolean z);

    private static native void setDist2Threshold_0(long j, double d);

    private static native void setHistory_0(long j, int i);

    private static native void setNSamples_0(long j, int i);

    private static native void setShadowThreshold_0(long j, double d);

    private static native void setShadowValue_0(long j, int i);

    private static native void setkNNSamples_0(long j, int i);

    @Override // org.opencv.video.BackgroundSubtractor, org.opencv.core.Algorithm
    public final void finalize() {
        delete(this.a);
    }
}
