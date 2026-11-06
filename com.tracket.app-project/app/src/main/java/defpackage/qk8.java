package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class qk8 {
    public static final qk8 c;
    public boolean a;
    public long b;

    static {
        qk8 qk8Var = new qk8();
        qk8Var.b = -9223372036854775807L;
        qk8Var.a = false;
        c = qk8Var;
    }

    public long a() {
        if (this.a) {
            return Long.MAX_VALUE;
        }
        return Math.max(0L, this.b - System.nanoTime());
    }

    public Long b() {
        if (this.a) {
            return null;
        }
        long j = this.b + 1;
        this.b = j;
        return Long.valueOf(j);
    }
}
