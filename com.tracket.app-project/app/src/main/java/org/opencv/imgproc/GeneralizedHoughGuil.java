package org.opencv.imgproc;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public class GeneralizedHoughGuil extends GeneralizedHough {
    private static native void delete(long j);

    private static native double getAngleEpsilon_0(long j);

    private static native double getAngleStep_0(long j);

    private static native int getAngleThresh_0(long j);

    private static native int getLevels_0(long j);

    private static native double getMaxAngle_0(long j);

    private static native double getMaxScale_0(long j);

    private static native double getMinAngle_0(long j);

    private static native double getMinScale_0(long j);

    private static native int getPosThresh_0(long j);

    private static native double getScaleStep_0(long j);

    private static native int getScaleThresh_0(long j);

    private static native double getXi_0(long j);

    private static native void setAngleEpsilon_0(long j, double d);

    private static native void setAngleStep_0(long j, double d);

    private static native void setAngleThresh_0(long j, int i);

    private static native void setLevels_0(long j, int i);

    private static native void setMaxAngle_0(long j, double d);

    private static native void setMaxScale_0(long j, double d);

    private static native void setMinAngle_0(long j, double d);

    private static native void setMinScale_0(long j, double d);

    private static native void setPosThresh_0(long j, int i);

    private static native void setScaleStep_0(long j, double d);

    private static native void setScaleThresh_0(long j, int i);

    private static native void setXi_0(long j, double d);

    @Override // org.opencv.imgproc.GeneralizedHough, org.opencv.core.Algorithm
    public final void finalize() {
        delete(this.a);
    }
}
