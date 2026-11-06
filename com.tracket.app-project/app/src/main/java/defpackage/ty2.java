package defpackage;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ty2 extends by2 implements Runnable {
    public final WeakReference y;

    public ty2(EditText editText) {
        this.y = new WeakReference(editText);
    }

    @Override // defpackage.by2
    public final void b() {
        Handler handler;
        EditText editText = (EditText) this.y.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        uy2.a((EditText) this.y.get(), 1);
    }
}
