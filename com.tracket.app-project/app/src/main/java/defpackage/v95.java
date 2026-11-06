package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class v95 extends j54 {
    public final int b;
    public final int c;
    public final int d;
    public final int[] e;
    public final int[] f;

    public v95(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = iArr;
        this.f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v95.class != obj.getClass()) {
            return false;
        }
        v95 v95Var = (v95) obj;
        return this.b == v95Var.b && this.c == v95Var.c && this.d == v95Var.d && Arrays.equals(this.e, v95Var.e) && Arrays.equals(this.f, v95Var.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((((((527 + this.b) * 31) + this.c) * 31) + this.d) * 31)) * 31);
    }
}
