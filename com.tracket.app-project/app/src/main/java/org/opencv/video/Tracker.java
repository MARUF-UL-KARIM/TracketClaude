package org.opencv.video;

import defpackage.rp6;
import org.opencv.core.Mat;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public class Tracker {
    public final long a;

    public Tracker(long j) {
        this.a = j;
    }

    private static native void delete(long j);

    private static native void init_0(long j, long j2, int i, int i2, int i3, int i4);

    private static native boolean update_0(long j, long j2, double[] dArr);

    public final void a(Mat mat, rp6 rp6Var) {
        init_0(this.a, mat.a, rp6Var.a, rp6Var.b, rp6Var.c, rp6Var.d);
    }

    public final boolean b(Mat mat, rp6 rp6Var) {
        double[] dArr = new double[4];
        boolean zUpdate_0 = update_0(this.a, mat.a, dArr);
        rp6Var.a = (int) dArr[0];
        rp6Var.b = (int) dArr[1];
        rp6Var.c = (int) dArr[2];
        rp6Var.d = (int) dArr[3];
        return zUpdate_0;
    }

    public void finalize() {
        delete(this.a);
    }
}
