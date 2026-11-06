package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class qi1 {
    public final String a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final jj1 f;
    public final Set g;

    public qi1(String str, Set set, Set set2, int i, int i2, jj1 jj1Var, Set set3) {
        this.a = str;
        this.b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = jj1Var;
        this.g = Collections.unmodifiableSet(set3);
    }

    public static pi1 a(mm6 mm6Var) {
        return new pi1(mm6Var, new mm6[0]);
    }

    public static pi1 b(Class cls) {
        return new pi1(cls, new Class[0]);
    }

    public static qi1 c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(mm6.a(cls));
        for (Class cls2 : clsArr) {
            kzd.a(cls2, "Null interface");
            hashSet.add(mm6.a(cls2));
        }
        return new qi1(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new oi1(obj, 1), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
