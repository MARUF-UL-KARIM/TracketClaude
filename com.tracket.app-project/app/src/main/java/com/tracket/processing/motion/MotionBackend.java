package com.tracket.processing.motion;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class MotionBackend {
    public static final /* synthetic */ MotionBackend[] A;
    public static final MotionBackend y;
    public static final MotionBackend z;

    static {
        MotionBackend motionBackend = new MotionBackend("OPENCV_CPU", 0);
        y = motionBackend;
        MotionBackend motionBackend2 = new MotionBackend("GLES_COMPUTE", 1);
        z = motionBackend2;
        A = new MotionBackend[]{motionBackend, motionBackend2, new MotionBackend("METAL_COMPUTE", 2)};
    }

    public static MotionBackend valueOf(String str) {
        return (MotionBackend) Enum.valueOf(MotionBackend.class, str);
    }

    public static MotionBackend[] values() {
        return (MotionBackend[]) A.clone();
    }
}
