package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ug7 {
    public final xg7 a;
    public final xg7 b;

    public ug7(xg7 xg7Var, xg7 xg7Var2) {
        this.a = xg7Var;
        this.b = xg7Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ug7.class != obj.getClass()) {
            return false;
        }
        ug7 ug7Var = (ug7) obj;
        return this.a.equals(ug7Var.a) && this.b.equals(ug7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        xg7 xg7Var = this.a;
        sb.append(xg7Var);
        xg7 xg7Var2 = this.b;
        if (xg7Var.equals(xg7Var2)) {
            str = "";
        } else {
            str = ", " + xg7Var2;
        }
        return wd0.o(sb, str, "]");
    }
}
