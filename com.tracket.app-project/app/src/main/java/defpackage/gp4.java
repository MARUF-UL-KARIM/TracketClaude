package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gp4 implements Function0 {
    public final /* synthetic */ int y;
    public final /* synthetic */ hp4 z;

    public /* synthetic */ gp4(hp4 hp4Var, int i) {
        this.y = i;
        this.z = hp4Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.y;
        hp4 hp4Var = this.z;
        switch (i) {
            case 0:
                return Float.valueOf(hp4Var.N.b());
            case 1:
                return Float.valueOf(hp4Var.N.d());
            default:
                return Float.valueOf(hp4Var.N.a() - hp4Var.N.c());
        }
    }
}
