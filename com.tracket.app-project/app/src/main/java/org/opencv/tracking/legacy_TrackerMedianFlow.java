package org.opencv.tracking;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public class legacy_TrackerMedianFlow extends legacy_Tracker {
    private static native long create_0();

    private static native void delete(long j);

    @Override // org.opencv.tracking.legacy_Tracker, org.opencv.core.Algorithm
    public final void finalize() {
        delete(this.a);
    }
}
