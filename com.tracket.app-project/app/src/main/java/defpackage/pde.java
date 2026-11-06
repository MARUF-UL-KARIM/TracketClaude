package defpackage;

import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pde implements Function {
    public static final /* synthetic */ pde b = new pde(0);
    public static final /* synthetic */ pde c = new pde(1);
    public static final /* synthetic */ pde d = new pde(2);
    public final /* synthetic */ int a;

    public /* synthetic */ pde(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return Long.valueOf(((uoe) obj).z);
            case 1:
                return new Integer(Integer.bitCount(((Integer) obj).intValue()));
            default:
                return new Integer(Integer.bitCount(((Integer) obj).intValue()));
        }
    }
}
