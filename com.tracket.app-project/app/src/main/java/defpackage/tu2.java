package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tu2 implements Function0 {
    public final /* synthetic */ Function0 A;
    public final /* synthetic */ Function0 B;
    public final /* synthetic */ int y;
    public final /* synthetic */ boolean z;

    public /* synthetic */ tu2(boolean z, Function0 function0, Function0 function1, int i) {
        this.y = i;
        this.z = z;
        this.A = function0;
        this.B = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.y;
        ud9 ud9Var = ud9.a;
        Function0 function0 = this.B;
        Function0 function1 = this.A;
        boolean z = this.z;
        switch (i) {
            case 0:
                if (z) {
                    function1.invoke();
                } else if (function0 != null) {
                    function0.invoke();
                }
                break;
            default:
                if (z) {
                    function1.invoke();
                } else if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
        return ud9Var;
    }
}
