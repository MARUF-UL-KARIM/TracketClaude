package org.opencv.features2d;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public class BFMatcher extends DescriptorMatcher {
    private static native long BFMatcher_0(int i, boolean z);

    private static native long BFMatcher_1(int i);

    private static native long BFMatcher_2();

    private static native long create_0(int i, boolean z);

    private static native long create_1(int i);

    private static native long create_2();

    private static native void delete(long j);

    @Override // org.opencv.features2d.DescriptorMatcher, org.opencv.core.Algorithm
    public final void finalize() {
        delete(this.a);
    }
}
