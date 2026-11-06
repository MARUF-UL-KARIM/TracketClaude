package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class sia {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public sia(int i, byte[] bArr, int i2, int i3) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sia.class != obj.getClass()) {
            return false;
        }
        sia siaVar = (sia) obj;
        return this.a == siaVar.a && this.c == siaVar.c && this.d == siaVar.d && Arrays.equals(this.b, siaVar.b);
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c) * 31) + this.d;
    }
}
