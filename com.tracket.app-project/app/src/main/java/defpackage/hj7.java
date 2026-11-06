package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class hj7 {
    public final int a;
    public final int b;

    public hj7(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hj7)) {
            return false;
        }
        hj7 hj7Var = (hj7) obj;
        return this.a == hj7Var.a && this.b == hj7Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return zd2.j(this.a, this.b, "SemanticPointKey(entityId=", ", pointId=", ")");
    }
}
