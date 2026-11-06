package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ed4 implements xp3 {
    public final /* synthetic */ int y;
    public final /* synthetic */ cd4 z;

    public /* synthetic */ ed4(cd4 cd4Var, int i) {
        this.y = i;
        this.z = cd4Var;
    }

    @Override // defpackage.xp3
    public final Object invoke(Object obj) {
        float fB;
        int i = this.y;
        cd4 cd4Var = this.z;
        float fFloatValue = ((Float) obj).floatValue();
        switch (i) {
            case 0:
                fB = cd4Var.b(fFloatValue);
                break;
            default:
                fB = cd4Var.b(fFloatValue);
                break;
        }
        return Float.valueOf(fB);
    }
}
