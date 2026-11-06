package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wf6 implements xp3 {
    public final /* synthetic */ String A;
    public final /* synthetic */ int y;
    public final /* synthetic */ long z;

    public /* synthetic */ wf6(long j, int i, String str) {
        this.y = i;
        this.z = j;
        this.A = str;
    }

    @Override // defpackage.xp3
    public final Object invoke(Object obj) throws Exception {
        int i = this.y;
        ud9 ud9Var = ud9.a;
        String str = this.A;
        long j = this.z;
        fb7 fb7Var = (fb7) obj;
        switch (i) {
            case 0:
                fb7Var.getClass();
                lb7 lb7VarK0 = fb7Var.k0("UPDATE projects SET duration_ms = ? WHERE id = ?");
                try {
                    lb7VarK0.g(1, j);
                    lb7VarK0.E(2, str);
                    lb7VarK0.f0();
                    return ud9Var;
                } finally {
                    lb7VarK0.close();
                }
            default:
                fb7Var.getClass();
                lb7 lb7VarK1 = fb7Var.k0("UPDATE projects SET edit_time = ? WHERE id = ?");
                try {
                    lb7VarK1.g(1, j);
                    lb7VarK1.E(2, str);
                    lb7VarK1.f0();
                    return ud9Var;
                } finally {
                    lb7VarK1.close();
                }
        }
    }
}
