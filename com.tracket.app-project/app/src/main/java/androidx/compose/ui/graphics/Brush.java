package androidx.compose.ui.graphics;

import defpackage.dt5;
import defpackage.l82;
import defpackage.qz0;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public abstract class Brush {
    public static final int $stable = 0;
    public static final qz0 Companion = new qz0();
    private final long intrinsicSize;

    private Brush() {
        this.intrinsicSize = 9205357640488583168L;
    }

    /* JADX INFO: renamed from: applyTo-Pq9zytI, reason: not valid java name */
    public abstract void mo0applyToPq9zytI(long j, dt5 dt5Var, float f);

    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc, reason: not valid java name */
    public long mo1getIntrinsicSizeNHjbRc() {
        return this.intrinsicSize;
    }

    public /* synthetic */ Brush(l82 l82Var) {
        this();
    }
}
