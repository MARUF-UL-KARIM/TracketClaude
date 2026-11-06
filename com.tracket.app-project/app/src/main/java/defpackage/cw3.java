package defpackage;

import androidx.datastore.core.MulticastFileObserver;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cw3 implements nk2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ cw3(int i, Object obj, Object obj2) {
        this.y = i;
        this.z = obj;
        this.A = obj2;
    }

    @Override // defpackage.nk2
    public final void dispose() {
        int i = this.y;
        Object obj = this.A;
        Object obj2 = this.z;
        switch (i) {
            case 0:
                ((dw3) obj2).A.removeCallbacks((Runnable) obj);
                break;
            default:
                MulticastFileObserver.Companion.observe$lambda$1((String) obj2, (xp3) obj);
                break;
        }
    }
}
