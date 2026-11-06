package org.jetbrains.skia;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class ArrayDecoder {
    private final long disposePtr;
    private final long ptr;

    public ArrayDecoder(long j, long j2) {
        this.ptr = j;
        this.disposePtr = j2;
    }

    public final void dispose() {
        StdVectorDecoderKt.StdVectorDecoder_nDisposeArray(this.ptr, this.disposePtr);
    }

    public final int getSize() {
        return StdVectorDecoderKt.StdVectorDecoder_nGetArraySize(this.ptr);
    }

    public final long release(int i) {
        return StdVectorDecoderKt.StdVectorDecoder_nReleaseElement(this.ptr, i);
    }
}
