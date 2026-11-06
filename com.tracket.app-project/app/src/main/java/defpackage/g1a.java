package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public class g1a extends g4c {
    public final WindowInsetsController e;
    public final Window f;

    public g1a(Window window) {
        this.e = window.getInsetsController();
        this.f = window;
    }

    @Override // defpackage.g4c
    public void f(boolean z) {
        j(16, 16, z);
    }

    @Override // defpackage.g4c
    public void g(boolean z) {
        j(8192, 8, z);
    }

    public final void j(int i, int i2, boolean z) {
        Window window = this.f;
        if (window == null) {
            WindowInsetsController windowInsetsController = this.e;
            if (z) {
                windowInsetsController.setSystemBarsAppearance(i2, i2);
                return;
            } else {
                windowInsetsController.setSystemBarsAppearance(0, i2);
                return;
            }
        }
        if (z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        } else {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility((~i) & decorView2.getSystemUiVisibility());
        }
    }
}
