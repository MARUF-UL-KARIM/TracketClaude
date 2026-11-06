package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class v19 {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public v19(int i, byte[] bArr, int i2, int i3) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v19.class != obj.getClass()) {
            return false;
        }
        v19 v19Var = (v19) obj;
        return this.a == v19Var.a && this.c == v19Var.c && this.d == v19Var.d && Arrays.equals(this.b, v19Var.b);
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c) * 31) + this.d;
    }
}
