package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class fx extends ContentObserver {
    public final /* synthetic */ int a;
    public final ContentResolver b;
    public final Uri c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fx(Object obj, Handler handler, ContentResolver contentResolver, Uri uri, int i) {
        super(handler);
        this.a = i;
        this.d = obj;
        this.b = contentResolver;
        this.c = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                ((yhb) obj).q();
                break;
            default:
                ((yhb) obj).E();
                break;
        }
    }
}
