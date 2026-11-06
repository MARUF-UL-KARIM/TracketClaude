package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public class cja {
    public final String a;
    public final Class b;
    public final boolean c;
    public final boolean d;
    public final long e;

    public cja(String str, Class cls, boolean z, boolean z2) {
        if (str.isEmpty()) {
            cp2.m("identifier must not be empty");
            throw null;
        }
        char cCharAt = str.charAt(0);
        if ((cCharAt < 'a' || cCharAt > 'z') && (cCharAt < 'A' || cCharAt > 'Z')) {
            cp2.m("identifier must start with an ASCII letter: ".concat(str));
            throw null;
        }
        for (int i = 1; i < str.length(); i++) {
            char cCharAt2 = str.charAt(i);
            if ((cCharAt2 < 'a' || cCharAt2 > 'z') && ((cCharAt2 < 'A' || cCharAt2 > 'Z') && ((cCharAt2 < '0' || cCharAt2 > '9') && cCharAt2 != '_'))) {
                cp2.m("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
                throw null;
            }
        }
        this.a = str;
        this.b = cls;
        this.c = z;
        this.d = z2;
        int iIdentityHashCode = System.identityHashCode(this);
        long j = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            j |= 1 << (iIdentityHashCode & 63);
            iIdentityHashCode >>>= 6;
        }
        this.e = j;
    }

    public void a(Iterator it, uxa uxaVar) {
        while (it.hasNext()) {
            b(it.next(), uxaVar);
        }
    }

    public void b(Object obj, uxa uxaVar) {
        uxaVar.a(obj, this.a);
    }

    public final String toString() {
        String name = getClass().getName();
        String name2 = this.b.getName();
        StringBuilder sb = new StringBuilder(name);
        sb.append("/");
        return zd2.r(sb, this.a, "[", name2, "]");
    }
}
