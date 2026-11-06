package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public class u85 {
    public final String a;
    public final Class b;
    public final boolean c;
    public final long d;

    public u85(String str, Class cls, boolean z) {
        if (str.isEmpty()) {
            cp2.m("identifier must not be empty");
            throw null;
        }
        char cCharAt = str.charAt(0);
        if (('a' > cCharAt || cCharAt > 'z') && ('A' > cCharAt || cCharAt > 'Z')) {
            cp2.m("identifier must start with an ASCII letter: ".concat(str));
            throw null;
        }
        for (int i = 1; i < str.length(); i++) {
            char cCharAt2 = str.charAt(i);
            if (('a' > cCharAt2 || cCharAt2 > 'z') && (('A' > cCharAt2 || cCharAt2 > 'Z') && ((cCharAt2 < '0' || cCharAt2 > '9') && cCharAt2 != '_'))) {
                cp2.m("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
                throw null;
            }
        }
        this.a = str;
        this.b = cls;
        this.c = z;
        int iIdentityHashCode = System.identityHashCode(this);
        long j = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            j |= 1 << (iIdentityHashCode & 63);
            iIdentityHashCode >>>= 6;
        }
        this.d = j;
    }

    public void a(Object obj, qj4 qj4Var) {
        qj4Var.a(obj, this.a);
    }

    public void b(Iterator it, qj4 qj4Var) {
        if (!this.c) {
            cp2.n("non repeating key");
        } else {
            while (it.hasNext()) {
                a(it.next(), qj4Var);
            }
        }
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final String toString() {
        return getClass().getName() + "/" + this.a + "[" + this.b.getName() + "]";
    }
}
