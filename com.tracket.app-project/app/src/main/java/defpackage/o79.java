package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class o79 {
    public final long a;
    public final long b;
    public final boolean c;

    public o79(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final o79 a(o79 o79Var) {
        return new o79(lm5.h(this.a, o79Var.a), Math.max(this.b, o79Var.b), this.c || o79Var.c);
    }
}
