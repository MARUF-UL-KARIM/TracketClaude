package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public abstract class q8d implements Iterator {
    public final CharSequence A;
    public final w7d B;
    public final boolean C;
    public String y;
    public int z = 2;
    public int D = 0;
    public int E = Integer.MAX_VALUE;

    public q8d(z3f z3fVar, CharSequence charSequence) {
        this.B = (w7d) z3fVar.A;
        this.C = z3fVar.z;
        this.A = charSequence;
    }

    public abstract int a(int i);

    public abstract int b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int iB;
        w7d w7dVar;
        oke.i(this.z != 4);
        int i = this.z;
        int i2 = i - 1;
        String string = null;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            return true;
        }
        if (i2 != 2) {
            this.z = 4;
            int i3 = this.D;
            while (true) {
                int i4 = this.D;
                if (i4 == -1) {
                    this.z = 3;
                    break;
                }
                int iA = a(i4);
                CharSequence charSequence = this.A;
                if (iA == -1) {
                    iA = charSequence.length();
                    this.D = -1;
                    iB = -1;
                } else {
                    iB = b(iA);
                    this.D = iB;
                }
                if (iB == i3) {
                    int i5 = iB + 1;
                    this.D = i5;
                    if (i5 > charSequence.length()) {
                        this.D = -1;
                    }
                } else {
                    while (true) {
                        w7dVar = this.B;
                        if (i3 >= iA || !w7dVar.a(charSequence.charAt(i3))) {
                            break;
                        }
                        i3++;
                    }
                    while (iA > i3) {
                        int i6 = iA - 1;
                        if (!w7dVar.a(charSequence.charAt(i6))) {
                            break;
                        }
                        iA = i6;
                    }
                    if (!this.C || i3 != iA) {
                        int i7 = this.E;
                        if (i7 == 1) {
                            iA = charSequence.length();
                            this.D = -1;
                            while (iA > i3) {
                                int i8 = iA - 1;
                                if (!w7dVar.a(charSequence.charAt(i8))) {
                                    break;
                                }
                                iA = i8;
                            }
                        } else {
                            this.E = i7 - 1;
                        }
                        string = charSequence.subSequence(i3, iA).toString();
                        break;
                    }
                    i3 = this.D;
                }
            }
            this.y = string;
            if (this.z != 3) {
                this.z = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            bd3.c();
            return null;
        }
        this.z = 2;
        String str = this.y;
        this.y = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
