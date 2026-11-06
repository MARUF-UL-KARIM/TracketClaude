package com.google.mediapipe.framework;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public class Packet {
    private long nativePacketHandle;

    private Packet(long j) {
        this.nativePacketHandle = j;
    }

    public static Packet create(long j) {
        return new Packet(j);
    }

    private native long nativeCopyPacket(long j);

    private native long nativeGetTimestamp(long j);

    private native boolean nativeIsEmpty(long j);

    private native void nativeReleasePacket(long j);

    public Packet copy() {
        return new Packet(nativeCopyPacket(this.nativePacketHandle));
    }

    public long getNativeHandle() {
        return this.nativePacketHandle;
    }

    public long getTimestamp() {
        return nativeGetTimestamp(this.nativePacketHandle);
    }

    public boolean isEmpty() {
        return nativeIsEmpty(this.nativePacketHandle);
    }

    public void release() {
        long j = this.nativePacketHandle;
        if (j != 0) {
            nativeReleasePacket(j);
            this.nativePacketHandle = 0L;
        }
    }
}
