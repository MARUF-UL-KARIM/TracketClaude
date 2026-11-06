package com.tracket.processing.motion;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class MotionReferenceJni {
    public static final MotionReferenceJni a = new MotionReferenceJni();

    static {
        System.loadLibrary("tracket_stabilizer");
    }

    public final native long create(int i, int i2, int i3, int i4);

    public final native boolean prepare(long j, ByteBuffer byteBuffer, int i);

    public final native boolean prepareBgra(long j, ByteBuffer byteBuffer, int i);

    public final native void release(long j);

    public final native int seed(ByteBuffer byteBuffer, int i, int i2, int i3, float f, float f2, float[] fArr);

    public final native int seedPrepared(long j, int i, float f, float f2, float[] fArr);

    public final native boolean track(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, float[] fArr, int i3, int i4, int i5, float f, float f2, float f3, float[] fArr2, byte[] bArr, float[] fArr3, float[] fArr4);

    public final native boolean trackPrepared(long j, float[] fArr, int i, float f, float f2, float f3, float[] fArr2, byte[] bArr, float[] fArr3, float[] fArr4);
}
