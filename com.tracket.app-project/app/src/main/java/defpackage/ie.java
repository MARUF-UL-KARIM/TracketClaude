package defpackage;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ie implements ViewTranslationCallback {
    public static final ie a = new ie();

    public final boolean onClearTranslation(View view) {
        view.getClass();
        ((zd) view).getContentCaptureManager$ui().h();
        return true;
    }

    public final boolean onHideTranslation(View view) {
        view.getClass();
        ((zd) view).getContentCaptureManager$ui().i();
        return true;
    }

    public final boolean onShowTranslation(View view) {
        view.getClass();
        ((zd) view).getContentCaptureManager$ui().j();
        return true;
    }
}
