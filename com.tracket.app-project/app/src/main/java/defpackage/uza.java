package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.DragEvent;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class uza {
    public static final Object b = new Object();
    public final /* synthetic */ int a;

    public static final long a(qya qyaVar) {
        DragEvent dragEvent = (DragEvent) qyaVar.y;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
    }

    public static final Rect b(fc4 fc4Var) {
        return new Rect(fc4Var.a, fc4Var.b, fc4Var.c, fc4Var.d);
    }

    public static final RectF c(sp6 sp6Var) {
        return new RectF(sp6Var.a, sp6Var.b, sp6Var.c, sp6Var.d);
    }

    public static final sp6 d(RectF rectF) {
        return new sp6(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final long e() {
        switch (this.a) {
            case 0:
                return SystemClock.elapsedRealtimeNanos();
            default:
                return SystemClock.elapsedRealtime() * 1000000;
        }
    }
}
