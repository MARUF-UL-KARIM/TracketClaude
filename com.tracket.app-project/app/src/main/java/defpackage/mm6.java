package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class mm6 {
    public final Class a;
    public final Class b;

    public mm6(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public static mm6 a(Class cls) {
        return new mm6(lm6.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mm6.class != obj.getClass()) {
            return false;
        }
        mm6 mm6Var = (mm6) obj;
        if (this.b.equals(mm6Var.b)) {
            return this.a.equals(mm6Var.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.b;
        Class cls2 = this.a;
        if (cls2 == lm6.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
