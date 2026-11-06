package androidx.sqlite.driver.bundled;

import dalvik.annotation.optimization.FastNative;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class BundledSQLiteStatementKt {
    @FastNative
    private static final native void nativeBindBlob(long j, int i, byte[] bArr);

    @FastNative
    private static final native void nativeBindDouble(long j, int i, double d);

    @FastNative
    private static final native void nativeBindLong(long j, int i, long j2);

    @FastNative
    private static final native void nativeBindNull(long j, int i);

    @FastNative
    private static final native void nativeBindText(long j, int i, String str);

    @FastNative
    private static final native void nativeClearBindings(long j);

    @FastNative
    private static final native void nativeClose(long j);

    @FastNative
    private static final native byte[] nativeGetBlob(long j, int i);

    @FastNative
    private static final native int nativeGetColumnCount(long j);

    @FastNative
    private static final native String nativeGetColumnName(long j, int i);

    @FastNative
    private static final native int nativeGetColumnType(long j, int i);

    @FastNative
    private static final native double nativeGetDouble(long j, int i);

    @FastNative
    private static final native long nativeGetLong(long j, int i);

    @FastNative
    private static final native String nativeGetText(long j, int i);

    private static final native void nativeReset(long j);

    private static final native boolean nativeStep(long j);
}
