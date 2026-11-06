package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class bx4 extends uc6 {
    public long[] a;
    public int b;

    @Override // defpackage.uc6
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.uc6
    public final void b(int i) {
        long[] jArr = this.a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(jArr, i);
        }
    }

    @Override // defpackage.uc6
    public final int d() {
        return this.b;
    }
}
