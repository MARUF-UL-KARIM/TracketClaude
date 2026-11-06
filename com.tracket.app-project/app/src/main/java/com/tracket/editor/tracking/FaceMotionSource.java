package com.tracket.editor.tracking;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
final class FaceMotionSource {
    public static final FaceMotionSource A;
    public static final /* synthetic */ FaceMotionSource[] B;
    public static final FaceMotionSource y;
    public static final FaceMotionSource z;

    static {
        FaceMotionSource faceMotionSource = new FaceMotionSource("LANDMARK", 0);
        y = faceMotionSource;
        FaceMotionSource faceMotionSource2 = new FaceMotionSource("BOUNDS", 1);
        z = faceMotionSource2;
        FaceMotionSource faceMotionSource3 = new FaceMotionSource("HOLD", 2);
        A = faceMotionSource3;
        B = new FaceMotionSource[]{faceMotionSource, faceMotionSource2, faceMotionSource3};
    }

    public static FaceMotionSource valueOf(String str) {
        return (FaceMotionSource) Enum.valueOf(FaceMotionSource.class, str);
    }

    public static FaceMotionSource[] values() {
        return (FaceMotionSource[]) B.clone();
    }
}
