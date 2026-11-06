package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class xr4 implements nr4 {
    public final /* synthetic */ Function0 A;
    public final /* synthetic */ Function0 B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ Function0 D;
    public final /* synthetic */ Function0 y;
    public final /* synthetic */ Function0 z;

    public xr4(Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, Function0 function5) {
        this.y = function0;
        this.z = function1;
        this.A = function2;
        this.B = function3;
        this.C = function4;
        this.D = function5;
    }

    @Override // defpackage.nr4
    public final void a() {
        this.C.invoke();
    }

    @Override // defpackage.nr4
    public final void b() {
        this.z.invoke();
    }

    @Override // defpackage.nr4
    public final void onCreate() {
        Function0 function0 = this.y;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // defpackage.nr4
    public final void onDestroy() {
        this.D.invoke();
    }

    @Override // defpackage.nr4
    public final void onPause() {
        Function0 function0 = this.B;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // defpackage.nr4
    public final void onResume() {
        Function0 function0 = this.A;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
