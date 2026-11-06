package defpackage;

import com.google.android.gms.measurement.internal.b;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class zbe implements Runnable {
    public final /* synthetic */ long A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ b C;
    public final /* synthetic */ int y;
    public final /* synthetic */ j6e z;

    public /* synthetic */ zbe(b bVar, j6e j6eVar, long j, boolean z, int i) {
        this.y = i;
        this.z = j6eVar;
        this.A = j;
        this.B = z;
        this.C = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.y;
        long j = this.A;
        boolean z = this.B;
        j6e j6eVar = this.z;
        b bVar = this.C;
        switch (i) {
            case 0:
                bVar.Q0(j6eVar);
                bVar.G0(j6eVar, j, z);
                break;
            default:
                bVar.Q0(j6eVar);
                bVar.G0(j6eVar, j, z);
                break;
        }
    }
}
