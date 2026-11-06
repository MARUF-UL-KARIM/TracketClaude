package org.opencv.features2d;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public class GFTTDetector extends Feature2D {
    private static native long create_0(int i, double d, double d2, int i2, boolean z, double d3);

    private static native long create_1(int i, double d, double d2, int i2, boolean z);

    private static native long create_2(int i, double d, double d2, int i2);

    private static native long create_3(int i, double d, double d2);

    private static native long create_4(int i, double d);

    private static native long create_5(int i);

    private static native long create_6();

    private static native long create_7(int i, double d, double d2, int i2, int i3, boolean z, double d3);

    private static native long create_8(int i, double d, double d2, int i2, int i3, boolean z);

    private static native long create_9(int i, double d, double d2, int i2, int i3);

    private static native void delete(long j);

    private static native int getBlockSize_0(long j);

    private static native String getDefaultName_0(long j);

    private static native int getGradientSize_0(long j);

    private static native boolean getHarrisDetector_0(long j);

    private static native double getK_0(long j);

    private static native int getMaxFeatures_0(long j);

    private static native double getMinDistance_0(long j);

    private static native double getQualityLevel_0(long j);

    private static native void setBlockSize_0(long j, int i);

    private static native void setGradientSize_0(long j, int i);

    private static native void setHarrisDetector_0(long j, boolean z);

    private static native void setK_0(long j, double d);

    private static native void setMaxFeatures_0(long j, int i);

    private static native void setMinDistance_0(long j, double d);

    private static native void setQualityLevel_0(long j, double d);

    @Override // org.opencv.features2d.Feature2D, org.opencv.core.Algorithm
    public final void finalize() {
        delete(this.a);
    }
}
