package org.opencv.dnn;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public class TextDetectionModel_DB extends TextDetectionModel {
    private static native long TextDetectionModel_DB_0(long j);

    private static native long TextDetectionModel_DB_1(String str, String str2);

    private static native long TextDetectionModel_DB_2(String str);

    private static native void delete(long j);

    private static native float getBinaryThreshold_0(long j);

    private static native int getMaxCandidates_0(long j);

    private static native float getPolygonThreshold_0(long j);

    private static native double getUnclipRatio_0(long j);

    private static native long setBinaryThreshold_0(long j, float f);

    private static native long setMaxCandidates_0(long j, int i);

    private static native long setPolygonThreshold_0(long j, float f);

    private static native long setUnclipRatio_0(long j, double d);

    @Override // org.opencv.dnn.TextDetectionModel, org.opencv.dnn.Model
    public final void finalize() {
        delete(0L);
    }
}
