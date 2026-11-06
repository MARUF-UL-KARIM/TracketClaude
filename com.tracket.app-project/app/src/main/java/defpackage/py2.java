package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class py2 implements oy2 {
    public final int y;
    public int z = -1;
    public int A = -1;

    public py2(int i) {
        this.y = i;
    }

    @Override // defpackage.oy2
    public final boolean d(CharSequence charSequence, int i, int i2, wb9 wb9Var) {
        int i3 = this.y;
        if (i > i3 || i3 >= i2) {
            return i2 <= i3;
        }
        this.z = i;
        this.A = i2;
        return false;
    }

    @Override // defpackage.oy2
    public final Object a() {
        return this;
    }
}
