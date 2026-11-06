package defpackage;

import androidx.media3.exoplayer.source.b;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bf6 implements Runnable {
    public final /* synthetic */ int y;
    public final /* synthetic */ b z;

    public /* synthetic */ bf6(b bVar, int i) {
        this.y = i;
        this.z = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.y;
        b bVar = this.z;
        switch (i) {
            case 0:
                bVar.i0 = true;
                break;
            case 1:
                bVar.s();
                break;
            default:
                if (!bVar.o0) {
                    o45 o45Var = bVar.P;
                    o45Var.getClass();
                    o45Var.i(bVar);
                }
                break;
        }
    }
}
