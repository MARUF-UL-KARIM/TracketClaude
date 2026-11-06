package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class f2f {
    public int a;
    public final int b;
    public f2f c;
    public final HashMap d = new HashMap(0);

    public f2f(int i, int i2) {
        if (i > i2) {
            pv6.c();
            throw null;
        }
        this.a = i;
        this.b = i2;
        this.c = null;
    }

    public final String toString() {
        int iIdentityHashCode = System.identityHashCode(this);
        return zd2.q(new StringBuilder(String.valueOf(iIdentityHashCode).length() + 4), "Node", iIdentityHashCode);
    }
}
