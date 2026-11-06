package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class to0 {
    public final float a;
    public final float b;
    public final float c;
    public final int d;
    public final long e;

    public to0(uh5 uh5Var) {
        uh5Var.getClass();
        float f = uh5Var.c;
        float f2 = uh5Var.d;
        float f3 = uh5Var.b;
        int i = uh5Var.a;
        long j = uh5Var.e;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
        this.e = j;
    }

    public final String toString() {
        return "BackEventCompat(touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + ", frameTimeMillis=" + this.e + ')';
    }
}
