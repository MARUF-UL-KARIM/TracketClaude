package org.opencv.features2d;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public class MSER extends Feature2D {
    private static native long create_0(int i, int i2, int i3, double d, double d2, int i4, double d3, double d4, int i5);

    private static native long create_1(int i, int i2, int i3, double d, double d2, int i4, double d3, double d4);

    private static native long create_2(int i, int i2, int i3, double d, double d2, int i4, double d3);

    private static native long create_3(int i, int i2, int i3, double d, double d2, int i4);

    private static native long create_4(int i, int i2, int i3, double d, double d2);

    private static native long create_5(int i, int i2, int i3, double d);

    private static native long create_6(int i, int i2, int i3);

    private static native long create_7(int i, int i2);

    private static native long create_8(int i);

    private static native long create_9();

    private static native void delete(long j);

    private static native void detectRegions_0(long j, long j2, long j3, long j4);

    private static native double getAreaThreshold_0(long j);

    private static native String getDefaultName_0(long j);

    private static native int getDelta_0(long j);

    private static native int getEdgeBlurSize_0(long j);

    private static native int getMaxArea_0(long j);

    private static native int getMaxEvolution_0(long j);

    private static native double getMaxVariation_0(long j);

    private static native int getMinArea_0(long j);

    private static native double getMinDiversity_0(long j);

    private static native double getMinMargin_0(long j);

    private static native boolean getPass2Only_0(long j);

    private static native void setAreaThreshold_0(long j, double d);

    private static native void setDelta_0(long j, int i);

    private static native void setEdgeBlurSize_0(long j, int i);

    private static native void setMaxArea_0(long j, int i);

    private static native void setMaxEvolution_0(long j, int i);

    private static native void setMaxVariation_0(long j, double d);

    private static native void setMinArea_0(long j, int i);

    private static native void setMinDiversity_0(long j, double d);

    private static native void setMinMargin_0(long j, double d);

    private static native void setPass2Only_0(long j, boolean z);

    @Override // org.opencv.features2d.Feature2D, org.opencv.core.Algorithm
    public final void finalize() {
        delete(this.a);
    }
}
