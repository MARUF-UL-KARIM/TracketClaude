package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qd4 implements Function0 {
    public final /* synthetic */ Function0 A;
    public final /* synthetic */ int y;
    public final /* synthetic */ vf5 z;

    public /* synthetic */ qd4(vf5 vf5Var, Function0 function0, int i) {
        this.y = i;
        this.z = vf5Var;
        this.A = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.y;
        ud9 ud9Var = ud9.a;
        vf5 vf5Var = this.z;
        Function0 function0 = this.A;
        switch (i) {
            case 0:
                if (vf5Var.getValue() != null) {
                    function0.invoke();
                }
                vf5Var.setValue(null);
                break;
            case 1:
                if (vf5Var.getValue() != null) {
                    function0.invoke();
                }
                vf5Var.setValue(null);
                break;
            case 2:
                vf5Var.setValue(Boolean.FALSE);
                function0.invoke();
                break;
            case 3:
                if (((Integer) vf5Var.getValue()) != null) {
                    function0.invoke();
                }
                vf5Var.setValue(null);
                break;
            default:
                if (((Integer) vf5Var.getValue()) != null) {
                    function0.invoke();
                }
                vf5Var.setValue(null);
                break;
        }
        return ud9Var;
    }

    public /* synthetic */ qd4(Function0 function0, vf5 vf5Var, int i) {
        this.y = i;
        this.A = function0;
        this.z = vf5Var;
    }
}
