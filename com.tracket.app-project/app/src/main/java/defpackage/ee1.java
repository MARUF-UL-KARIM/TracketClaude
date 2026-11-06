package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ee1 implements xp3 {
    public final /* synthetic */ int y;
    public final /* synthetic */ ArrayList z;

    public ee1(int i, ArrayList arrayList) {
        this.y = i;
        switch (i) {
            case 1:
                this.z = arrayList;
                break;
            default:
                be1 be1Var = be1.z;
                this.z = arrayList;
                break;
        }
    }

    @Override // defpackage.xp3
    public final Object invoke(Object obj) {
        int i = this.y;
        ArrayList arrayList = this.z;
        switch (i) {
            case 0:
                return be1.z.get(arrayList.get(((Number) obj).intValue()));
            default:
                arrayList.get(((Number) obj).intValue());
                return null;
        }
    }
}
