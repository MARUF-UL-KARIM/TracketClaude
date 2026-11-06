package defpackage;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class l4 implements Runnable {
    public final /* synthetic */ int y;
    public final /* synthetic */ ActionBarOverlayLayout z;

    public /* synthetic */ l4(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.y = i;
        this.z = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.y;
        ActionBarOverlayLayout actionBarOverlayLayout = this.z;
        switch (i) {
            case 0:
                actionBarOverlayLayout.c();
                actionBarOverlayLayout.U = actionBarOverlayLayout.B.animate().translationY(0.0f).setListener(actionBarOverlayLayout.V);
                break;
            default:
                actionBarOverlayLayout.c();
                actionBarOverlayLayout.U = actionBarOverlayLayout.B.animate().translationY(-actionBarOverlayLayout.B.getHeight()).setListener(actionBarOverlayLayout.V);
                break;
        }
    }
}
