package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class c71 extends uc6 {
    public char[] a;
    public int b;

    @Override // defpackage.uc6
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.uc6
    public final void b(int i) {
        char[] cArr = this.a;
        if (cArr.length < i) {
            int length = cArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(cArr, i);
        }
    }

    @Override // defpackage.uc6
    public final int d() {
        return this.b;
    }
}
