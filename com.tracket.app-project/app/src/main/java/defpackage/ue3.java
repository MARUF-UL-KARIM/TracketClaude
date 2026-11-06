package defpackage;

import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ue3 {
    public final SparseBooleanArray a;
    public boolean b;

    public ue3(int i) {
        switch (i) {
            case 1:
                this.a = new SparseBooleanArray();
                break;
            default:
                this.a = new SparseBooleanArray();
                break;
        }
    }

    public void a(int i) {
        iyd.p(!this.b);
        this.a.append(i, true);
    }

    public ve3 b() {
        iyd.p(!this.b);
        this.b = true;
        return new ve3(this.a);
    }

    public void c(int i) {
        oke.i(!this.b);
        this.a.append(i, true);
    }

    public dxe d() {
        oke.i(!this.b);
        this.b = true;
        return new dxe(this.a);
    }
}
