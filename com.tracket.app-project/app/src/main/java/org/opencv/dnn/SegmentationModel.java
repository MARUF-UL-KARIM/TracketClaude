package org.opencv.dnn;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public class SegmentationModel extends Model {
    private static native long SegmentationModel_0(String str, String str2);

    private static native long SegmentationModel_1(String str);

    private static native long SegmentationModel_2(long j);

    private static native void delete(long j);

    private static native void segment_0(long j, long j2, long j3);

    @Override // org.opencv.dnn.Model
    public final void finalize() {
        delete(0L);
    }
}
