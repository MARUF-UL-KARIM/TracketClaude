package defpackage;

import android.app.PendingIntent;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class jt {
    public final int a;
    public final int b;
    public final PendingIntent c;
    public final PendingIntent d;
    public boolean e = false;

    public jt(int i, int i2, long j, long j2, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        this.a = i;
        this.b = i2;
        this.c = pendingIntent;
        this.d = pendingIntent2;
    }

    public final PendingIntent a(p2f p2fVar) {
        PendingIntent pendingIntent;
        int i = p2fVar.a;
        if (i == 0) {
            PendingIntent pendingIntent2 = this.d;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            return null;
        }
        if (i != 1 || (pendingIntent = this.c) == null) {
            return null;
        }
        return pendingIntent;
    }
}
