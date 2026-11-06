package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class rna implements mz2 {
    public final /* synthetic */ int a;
    public final HashMap b;
    public final HashMap c;

    public rna(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new HashMap();
                this.c = new HashMap();
                break;
            default:
                this.b = new HashMap();
                this.c = new HashMap();
                break;
        }
    }

    @Override // defpackage.mz2
    public final /* bridge */ /* synthetic */ mz2 a(Class cls, ql5 ql5Var) {
        int i = this.a;
        HashMap map = this.c;
        HashMap map2 = this.b;
        switch (i) {
            case 0:
                map2.put(cls, ql5Var);
                map.remove(cls);
                break;
            default:
                map2.put(cls, ql5Var);
                map.remove(cls);
                break;
        }
        return this;
    }
}
