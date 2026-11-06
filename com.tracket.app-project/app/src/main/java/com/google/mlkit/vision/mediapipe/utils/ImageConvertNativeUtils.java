package com.google.mlkit.vision.mediapipe.utils;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public class ImageConvertNativeUtils {
    private static native byte[] byteArrayToRgb(byte[] bArr, int i, int i2, int i3, int i4);

    private static native byte[] yuvPlanesToRgb(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5, int i6);
}
