package org.opencv.dnn;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public class Model {
    private static native long Model_0(String str, String str2);

    private static native long Model_1(String str);

    private static native long Model_2(long j);

    private static native void delete(long j);

    private static native long enableWinograd_0(long j, boolean z);

    private static native void predict_0(long j, long j2, long j3);

    private static native long setInputCrop_0(long j, boolean z);

    private static native long setInputMean_0(long j, double d, double d2, double d3, double d4);

    private static native void setInputParams_0(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2);

    private static native void setInputParams_1(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z);

    private static native void setInputParams_2(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7);

    private static native void setInputParams_3(long j, double d, double d2, double d3);

    private static native void setInputParams_4(long j, double d);

    private static native void setInputParams_5(long j);

    private static native long setInputScale_0(long j, double d, double d2, double d3, double d4);

    private static native long setInputSize_0(long j, double d, double d2);

    private static native long setInputSize_1(long j, int i, int i2);

    private static native long setInputSwapRB_0(long j, boolean z);

    private static native long setOutputNames_0(long j, List<String> list);

    private static native long setPreferableBackend_0(long j, int i);

    private static native long setPreferableTarget_0(long j, int i);

    public void finalize() {
        delete(0L);
    }
}
