package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class rk4 implements Comparable {
    public static final rk4 z = new rk4();
    public final int y = 132096;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        rk4 rk4Var = (rk4) obj;
        rk4Var.getClass();
        return this.y - rk4Var.y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        rk4 rk4Var = obj instanceof rk4 ? (rk4) obj : null;
        return rk4Var != null && this.y == rk4Var.y;
    }

    public final int hashCode() {
        return this.y;
    }

    public final String toString() {
        return "2.4.0";
    }
}
