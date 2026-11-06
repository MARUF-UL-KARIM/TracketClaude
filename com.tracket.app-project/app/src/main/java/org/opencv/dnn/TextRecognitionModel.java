package org.opencv.dnn;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public class TextRecognitionModel extends Model {
    private static native long TextRecognitionModel_0(long j);

    private static native long TextRecognitionModel_1(String str, String str2);

    private static native long TextRecognitionModel_2(String str);

    private static native void delete(long j);

    private static native String getDecodeType_0(long j);

    private static native List<String> getVocabulary_0(long j);

    private static native String recognize_0(long j, long j2);

    private static native void recognize_1(long j, long j2, long j3, List<String> list);

    private static native long setDecodeOptsCTCPrefixBeamSearch_0(long j, int i, int i2);

    private static native long setDecodeOptsCTCPrefixBeamSearch_1(long j, int i);

    private static native long setDecodeType_0(long j, String str);

    private static native long setVocabulary_0(long j, List<String> list);

    @Override // org.opencv.dnn.Model
    public final void finalize() {
        delete(0L);
    }
}
