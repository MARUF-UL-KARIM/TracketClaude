package defpackage;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public abstract class om9 implements DisplayManager.DisplayListener {
    public final DisplayManager A;
    public volatile long B = -9223372036854775807L;
    public volatile long C = -9223372036854775807L;
    public final /* synthetic */ int y;
    public final Choreographer z;

    public /* synthetic */ om9(Choreographer choreographer, DisplayManager displayManager, int i) {
        this.y = i;
        this.z = choreographer;
        this.A = displayManager;
    }

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract void h();

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
        int i2 = this.y;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
        int i2 = this.y;
    }

    private final void a(int i) {
    }

    private final void b(int i) {
    }

    private final void c(int i) {
    }

    private final void d(int i) {
    }
}
