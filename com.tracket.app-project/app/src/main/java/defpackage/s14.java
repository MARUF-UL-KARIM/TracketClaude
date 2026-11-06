package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s14 implements xp3 {
    public final /* synthetic */ xp3 A;
    public final /* synthetic */ int y;
    public final /* synthetic */ xp3 z;

    public /* synthetic */ s14(xp3 xp3Var, xp3 xp3Var2, int i) {
        this.y = i;
        this.z = xp3Var;
        this.A = xp3Var2;
    }

    @Override // defpackage.xp3
    public final Object invoke(Object obj) {
        int i = this.y;
        ud9 ud9Var = ud9.a;
        xp3 xp3Var = this.A;
        xp3 xp3Var2 = this.z;
        switch (i) {
            case 0:
                obj.getClass();
                if (xp3Var2 != null) {
                    xp3Var2.invoke(obj);
                }
                xp3Var.invoke(obj);
                break;
            case 1:
                xp3Var2.invoke(obj);
                xp3Var.invoke(obj);
                break;
            default:
                xp3Var2.invoke(obj);
                xp3Var.invoke(obj);
                break;
        }
        return ud9Var;
    }
}
