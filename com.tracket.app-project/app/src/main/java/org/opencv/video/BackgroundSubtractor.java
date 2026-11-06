package org.opencv.video;

import org.opencv.core.Algorithm;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public class BackgroundSubtractor extends Algorithm {
    private static native void apply_0(long j, long j2, long j3, double d);

    private static native void apply_1(long j, long j2, long j3);

    private static native void delete(long j);

    private static native void getBackgroundImage_0(long j, long j2);

    @Override // org.opencv.core.Algorithm
    public void finalize() {
        delete(this.a);
    }
}
