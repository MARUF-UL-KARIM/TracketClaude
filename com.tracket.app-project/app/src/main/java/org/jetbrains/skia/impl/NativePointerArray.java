package org.jetbrains.skia.impl;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class NativePointerArray {
    private final long[] backing;

    public NativePointerArray(int i, long[] jArr) {
        jArr.getClass();
        this.backing = jArr;
    }

    public final long get(int i) {
        return this.backing[i];
    }

    public final long[] getBacking$skiko_release() {
        return this.backing;
    }

    public final int getSize() {
        return this.backing.length;
    }

    public final void set(int i, long j) {
        this.backing[i] = j;
    }

    public NativePointerArray(int i) {
        this(i, new long[i]);
    }
}
