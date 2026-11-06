package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xie implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uw7 b;

    public /* synthetic */ xie(uw7 uw7Var, int i) {
        this.a = i;
        this.b = uw7Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.b.a();
    }
}
