package defpackage;

import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class qg3 implements rf3 {
    public final /* synthetic */ int y;
    public final /* synthetic */ gq6 z;

    public /* synthetic */ qg3(gq6 gq6Var, int i) {
        this.y = i;
        this.z = gq6Var;
    }

    @Override // defpackage.rf3
    public final Object emit(Object obj, vs1 vs1Var) {
        int i = this.y;
        gq6 gq6Var = this.z;
        switch (i) {
            case 0:
                gq6Var.y = obj;
                throw new AbortFlowException(this);
            default:
                gq6Var.y = obj;
                throw new AbortFlowException(this);
        }
    }
}
