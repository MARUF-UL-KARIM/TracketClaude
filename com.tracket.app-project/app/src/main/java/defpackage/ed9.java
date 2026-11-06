package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ed9 extends uc6 {
    public short[] a;
    public int b;

    @Override // defpackage.uc6
    public final Object a() {
        return new dd9(Arrays.copyOf(this.a, this.b));
    }

    @Override // defpackage.uc6
    public final void b(int i) {
        short[] sArr = this.a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(sArr, i);
        }
    }

    @Override // defpackage.uc6
    public final int d() {
        return this.b;
    }
}
