package org.opencv.features2d;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public class BRISK extends Feature2D {
    private static native long create_0(int i, int i2, float f);

    private static native long create_1(int i, int i2);

    private static native long create_10(int i, int i2, long j, long j2, float f);

    private static native long create_11(int i, int i2, long j, long j2);

    private static native long create_2(int i);

    private static native long create_3();

    private static native long create_4(long j, long j2, float f, float f2, long j3);

    private static native long create_5(long j, long j2, float f, float f2);

    private static native long create_6(long j, long j2, float f);

    private static native long create_7(long j, long j2);

    private static native long create_8(int i, int i2, long j, long j2, float f, float f2, long j3);

    private static native long create_9(int i, int i2, long j, long j2, float f, float f2);

    private static native void delete(long j);

    private static native String getDefaultName_0(long j);

    private static native int getOctaves_0(long j);

    private static native float getPatternScale_0(long j);

    private static native int getThreshold_0(long j);

    private static native void setOctaves_0(long j, int i);

    private static native void setPatternScale_0(long j, float f);

    private static native void setThreshold_0(long j, int i);

    @Override // org.opencv.features2d.Feature2D, org.opencv.core.Algorithm
    public final void finalize() {
        delete(this.a);
    }
}
