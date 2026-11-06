package org.opencv.dnn;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public class TextDetectionModel_EAST extends TextDetectionModel {
    private static native long TextDetectionModel_EAST_0(long j);

    private static native long TextDetectionModel_EAST_1(String str, String str2);

    private static native long TextDetectionModel_EAST_2(String str);

    private static native void delete(long j);

    private static native float getConfidenceThreshold_0(long j);

    private static native float getNMSThreshold_0(long j);

    private static native long setConfidenceThreshold_0(long j, float f);

    private static native long setNMSThreshold_0(long j, float f);

    @Override // org.opencv.dnn.TextDetectionModel, org.opencv.dnn.Model
    public final void finalize() {
        delete(0L);
    }
}
