package androidx.sqlite.driver.bundled;

import dalvik.annotation.optimization.FastNative;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class BundledSQLiteConnectionKt {
    @FastNative
    private static final native void nativeClose(long j);

    @FastNative
    private static final native boolean nativeInTransaction(long j);

    private static final native void nativeLoadExtension(long j, String str, String str2);

    private static final native long nativePrepare(long j, String str);
}
