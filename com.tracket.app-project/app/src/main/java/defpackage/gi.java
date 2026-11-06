package defpackage;

import android.graphics.PathMeasure;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class gi {
    public final PathMeasure a;

    public gi(PathMeasure pathMeasure) {
        this.a = pathMeasure;
    }

    public final void a(float f, float f2, ei eiVar) {
        this.a.getSegment(f, f2, eiVar.a, true);
    }
}
