package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class mp8 {
    public final int a;
    public final int b;
    public final int c;
    public final xp3 d;

    public mp8(int i, int i2, int i3, xp3 xp3Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = xp3Var;
    }

    public final int a(boolean z) {
        if (this.c == 0) {
            return 0;
        }
        return z ? this.b : this.a;
    }
}
