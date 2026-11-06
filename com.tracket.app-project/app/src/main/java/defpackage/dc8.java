package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class dc8 {
    public final int a;

    public dc8(int i) {
        this.a = i;
        if (i > 0) {
            return;
        }
        x94.a("grid with no rows/columns");
    }

    public final int[] a(int i, int i2) {
        int i3;
        int i4 = this.a;
        int i5 = i - ((i4 - 1) * i2);
        int i6 = i5 / i4;
        int i7 = i5 % i4;
        int[] iArr = new int[i4];
        int i8 = 0;
        while (i8 < i4) {
            if (i6 < 0) {
                i3 = 0;
            } else {
                i3 = (i8 < i7 ? 1 : 0) + i6;
            }
            iArr[i8] = i3;
            i8++;
        }
        return iArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dc8) {
            return this.a == ((dc8) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return -this.a;
    }
}
