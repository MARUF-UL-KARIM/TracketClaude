package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ps1 implements Function0 {
    public final /* synthetic */ Function0 A;
    public final /* synthetic */ int y;
    public final /* synthetic */ boolean z;

    public /* synthetic */ ps1(int i, Function0 function0, boolean z) {
        this.y = i;
        this.z = z;
        this.A = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.y;
        ud9 ud9Var = ud9.a;
        Function0 function0 = this.A;
        boolean z = this.z;
        switch (i) {
            case 0:
                if (z) {
                    function0.invoke();
                }
                break;
            case 1:
                if (!z) {
                    function0.invoke();
                }
                break;
            case 2:
                if (z) {
                    function0.invoke();
                }
                break;
            default:
                if (z) {
                    function0.invoke();
                }
                break;
        }
        return ud9Var;
    }
}
