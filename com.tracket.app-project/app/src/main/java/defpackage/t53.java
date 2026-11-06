package defpackage;

import android.content.ContentResolver;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t53 implements xp3 {
    public final /* synthetic */ int y;
    public final /* synthetic */ ContentResolver z;

    public /* synthetic */ t53(ContentResolver contentResolver, int i) {
        this.y = i;
        this.z = contentResolver;
    }

    @Override // defpackage.xp3
    public final Object invoke(Object obj) {
        int iDelete;
        int i = this.y;
        ContentResolver contentResolver = this.z;
        Uri uri = (Uri) obj;
        switch (i) {
            case 0:
                uri.getClass();
                iDelete = contentResolver.delete(uri, null, null);
                break;
            case 1:
                uri.getClass();
                iDelete = contentResolver.delete(uri, null, null);
                break;
            default:
                uri.getClass();
                iDelete = contentResolver.delete(uri, null, null);
                break;
        }
        return Integer.valueOf(iDelete);
    }
}
