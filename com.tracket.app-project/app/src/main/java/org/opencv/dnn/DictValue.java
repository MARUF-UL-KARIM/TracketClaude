package org.opencv.dnn;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public class DictValue {
    private static native long DictValue_0(int i);

    private static native long DictValue_1(double d);

    private static native long DictValue_2(String str);

    private static native void delete(long j);

    private static native int getIntValue_0(long j, int i);

    private static native int getIntValue_1(long j);

    private static native double getRealValue_0(long j, int i);

    private static native double getRealValue_1(long j);

    private static native String getStringValue_0(long j, int i);

    private static native String getStringValue_1(long j);

    private static native boolean isInt_0(long j);

    private static native boolean isReal_0(long j);

    private static native boolean isString_0(long j);

    public final void finalize() {
        delete(0L);
    }
}
