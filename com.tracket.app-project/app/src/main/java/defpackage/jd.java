package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jd implements Runnable {
    public final /* synthetic */ int y;
    public final /* synthetic */ Function0 z;

    public /* synthetic */ jd(int i, Function0 function0) {
        this.y = i;
        this.z = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.y;
        Function0 function0 = this.z;
        switch (i) {
            case 0:
                function0.invoke();
                break;
            case 1:
                function0.invoke();
                break;
            case 2:
                function0.invoke();
                break;
            case 3:
                function0.invoke();
                break;
            case 4:
                function0.invoke();
                break;
            case 5:
                function0.invoke();
                break;
            case 6:
                function0.invoke();
                break;
            case 7:
                function0.invoke();
                break;
            default:
                function0.invoke();
                break;
        }
    }
}
