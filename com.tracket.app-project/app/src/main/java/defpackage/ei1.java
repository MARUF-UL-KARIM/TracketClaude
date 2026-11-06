package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ei1 extends gi1 {
    public static gi1 f(int i) {
        if (i < 0) {
            return gi1.b;
        }
        return i > 0 ? gi1.c : gi1.a;
    }

    @Override // defpackage.gi1
    public final gi1 a(int i, int i2) {
        return f(Integer.compare(i, i2));
    }

    @Override // defpackage.gi1
    public final gi1 b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // defpackage.gi1
    public final gi1 c(boolean z, boolean z2) {
        return f(Boolean.compare(z, z2));
    }

    @Override // defpackage.gi1
    public final gi1 d(boolean z, boolean z2) {
        return f(Boolean.compare(z2, z));
    }

    @Override // defpackage.gi1
    public final int e() {
        return 0;
    }
}
