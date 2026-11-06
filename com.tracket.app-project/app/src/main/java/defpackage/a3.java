package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class a3 {
    public int a;
    public int b;
    public int c;

    public a3() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public static a3 a(wue wueVar) {
        if (wueVar.B) {
            return new a3(3, 0, 0);
        }
        if (wueVar.G) {
            return new a3(2, 0, 0);
        }
        return wueVar.F ? new a3(0, 0, 0) : new a3(1, wueVar.D, wueVar.A);
    }

    public boolean b() {
        return this.a == 3;
    }

    public a3(int i, int i2, int i3) {
        this.a = i;
        this.c = i2;
        this.b = i3;
    }

    public /* synthetic */ a3(int i, int i2, int i3, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
