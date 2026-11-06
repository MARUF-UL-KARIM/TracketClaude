package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ul3 implements Runnable {
    public final /* synthetic */ int y;
    public final /* synthetic */ vl3 z;

    public /* synthetic */ ul3(vl3 vl3Var, int i) {
        this.y = i;
        this.z = vl3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.y;
        vl3 vl3Var = this.z;
        switch (i) {
            case 0:
                ViewParent parent = vl3Var.B.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                vl3Var.a();
                View view = vl3Var.B;
                if (view.isEnabled() && !view.isLongClickable() && vl3Var.e()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    vl3Var.E = true;
                    break;
                }
                break;
        }
    }
}
