package defpackage;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class pob implements DialogInterface.OnClickListener {
    public final /* synthetic */ int y;
    public final /* synthetic */ JsResult z;

    public /* synthetic */ pob(JsResult jsResult, int i) {
        this.y = i;
        this.z = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.y) {
            case 0:
                this.z.cancel();
                break;
            default:
                this.z.confirm();
                break;
        }
    }
}
