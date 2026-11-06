package org.opencv.video;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public class DISOpticalFlow extends DenseOpticalFlow {
    private static native long create_0(int i);

    private static native long create_1();

    private static native void delete(long j);

    private static native int getFinestScale_0(long j);

    private static native int getGradientDescentIterations_0(long j);

    private static native int getPatchSize_0(long j);

    private static native int getPatchStride_0(long j);

    private static native boolean getUseMeanNormalization_0(long j);

    private static native boolean getUseSpatialPropagation_0(long j);

    private static native float getVariationalRefinementAlpha_0(long j);

    private static native float getVariationalRefinementDelta_0(long j);

    private static native float getVariationalRefinementEpsilon_0(long j);

    private static native float getVariationalRefinementGamma_0(long j);

    private static native int getVariationalRefinementIterations_0(long j);

    private static native void setFinestScale_0(long j, int i);

    private static native void setGradientDescentIterations_0(long j, int i);

    private static native void setPatchSize_0(long j, int i);

    private static native void setPatchStride_0(long j, int i);

    private static native void setUseMeanNormalization_0(long j, boolean z);

    private static native void setUseSpatialPropagation_0(long j, boolean z);

    private static native void setVariationalRefinementAlpha_0(long j, float f);

    private static native void setVariationalRefinementDelta_0(long j, float f);

    private static native void setVariationalRefinementEpsilon_0(long j, float f);

    private static native void setVariationalRefinementGamma_0(long j, float f);

    private static native void setVariationalRefinementIterations_0(long j, int i);

    @Override // org.opencv.video.DenseOpticalFlow, org.opencv.core.Algorithm
    public final void finalize() {
        delete(this.a);
    }
}
