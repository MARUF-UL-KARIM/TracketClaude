package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ata {
    public static final boolean c = bta.a;
    public final ArrayList a = new ArrayList();
    public boolean b = false;

    public final synchronized void a(long j, String str) {
        if (this.b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.a.add(new zsa(str, j, SystemClock.elapsedRealtime()));
    }

    public final synchronized void b(String str) {
        long j;
        this.b = true;
        ArrayList arrayList = this.a;
        int i = 0;
        if (arrayList.size() == 0) {
            j = 0;
        } else {
            j = ((zsa) arrayList.get(arrayList.size() - 1)).c - ((zsa) arrayList.get(0)).c;
        }
        if (j > 0) {
            long j2 = ((zsa) arrayList.get(0)).c;
            bta.b("(%-4d ms) %s", Long.valueOf(j), str);
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                zsa zsaVar = (zsa) obj;
                long j3 = zsaVar.c;
                bta.b("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(zsaVar.b), zsaVar.a);
                j2 = j3;
            }
        }
    }

    public final void finalize() {
        if (this.b) {
            return;
        }
        b("Request on the loose");
        bta.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}
