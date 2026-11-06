package org.opencv.core;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public class Algorithm {
    public final long a;

    public Algorithm(long j) {
        this.a = j;
    }

    private static native void clear_0(long j);

    private static native void delete(long j);

    private static native boolean empty_0(long j);

    private static native String getDefaultName_0(long j);

    private static native void save_0(long j, String str);

    public void finalize() {
        delete(this.a);
    }
}
