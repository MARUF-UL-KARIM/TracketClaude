package org.opencv.dnn;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public class DetectionModel extends Model {
    private static native long DetectionModel_0(String str, String str2);

    private static native long DetectionModel_1(String str);

    private static native long DetectionModel_2(long j);

    private static native void delete(long j);

    private static native void detect_0(long j, long j2, long j3, long j4, long j5, float f, float f2);

    private static native void detect_1(long j, long j2, long j3, long j4, long j5, float f);

    private static native void detect_2(long j, long j2, long j3, long j4, long j5);

    private static native boolean getNmsAcrossClasses_0(long j);

    private static native long setNmsAcrossClasses_0(long j, boolean z);

    @Override // org.opencv.dnn.Model
    public final void finalize() {
        delete(0L);
    }
}
