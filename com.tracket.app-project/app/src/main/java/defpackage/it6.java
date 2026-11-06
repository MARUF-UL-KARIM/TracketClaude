package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class it6 {
    public static final it6 c = new it6(0, false);
    public final int a;
    public final boolean b;

    public it6(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || it6.class != obj.getClass()) {
            return false;
        }
        it6 it6Var = (it6) obj;
        return this.a == it6Var.a && this.b == it6Var.b;
    }

    public final int hashCode() {
        return (this.a << 1) + (this.b ? 1 : 0);
    }
}
