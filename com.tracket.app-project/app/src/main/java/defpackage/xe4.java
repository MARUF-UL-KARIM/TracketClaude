package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class xe4 {
    public final int a;
    public final int b;
    public final co4 c;

    public xe4(int i, int i2, co4 co4Var) {
        this.a = i;
        this.b = i2;
        this.c = co4Var;
        if (i < 0) {
            x94.a("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        x94.a("size should be > 0");
    }
}
