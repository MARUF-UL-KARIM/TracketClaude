package org.opencv.video;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public class BackgroundSubtractorMOG2 extends BackgroundSubtractor {
    private static native void apply_0(long j, long j2, long j3, double d);

    private static native void apply_1(long j, long j2, long j3);

    private static native void delete(long j);

    private static native double getBackgroundRatio_0(long j);

    private static native double getComplexityReductionThreshold_0(long j);

    private static native boolean getDetectShadows_0(long j);

    private static native int getHistory_0(long j);

    private static native int getNMixtures_0(long j);

    private static native double getShadowThreshold_0(long j);

    private static native int getShadowValue_0(long j);

    private static native double getVarInit_0(long j);

    private static native double getVarMax_0(long j);

    private static native double getVarMin_0(long j);

    private static native double getVarThresholdGen_0(long j);

    private static native double getVarThreshold_0(long j);

    private static native void setBackgroundRatio_0(long j, double d);

    private static native void setComplexityReductionThreshold_0(long j, double d);

    private static native void setDetectShadows_0(long j, boolean z);

    private static native void setHistory_0(long j, int i);

    private static native void setNMixtures_0(long j, int i);

    private static native void setShadowThreshold_0(long j, double d);

    private static native void setShadowValue_0(long j, int i);

    private static native void setVarInit_0(long j, double d);

    private static native void setVarMax_0(long j, double d);

    private static native void setVarMin_0(long j, double d);

    private static native void setVarThresholdGen_0(long j, double d);

    private static native void setVarThreshold_0(long j, double d);

    @Override // org.opencv.video.BackgroundSubtractor, org.opencv.core.Algorithm
    public final void finalize() {
        delete(this.a);
    }
}
