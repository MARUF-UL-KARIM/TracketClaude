package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class y06 {
    public final String a;
    public final String b;
    public final byte[] c;

    public y06(byte[] bArr, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y06)) {
            return false;
        }
        y06 y06Var = (y06) obj;
        return this.a.equals(y06Var.a) && ff4.h(this.b, y06Var.b) && this.c.equals(y06Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Arrays.hashCode(this.c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return wd0.o(ot5.v("PickedStickerFile(fileName=", this.a, ", mimeType=", this.b, ", bytes="), Arrays.toString(this.c), ")");
    }
}
