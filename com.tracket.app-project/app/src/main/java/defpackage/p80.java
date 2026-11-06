package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class p80 extends oc3 {
    public final String a;
    public final String b;

    public p80(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oc3)) {
            return false;
        }
        p80 p80Var = (p80) ((oc3) obj);
        return this.a.equals(p80Var.a) && this.b.equals(p80Var.b);
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003)) * 1000003) ^ 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ModelInfo{name=");
        sb.append(this.a);
        sb.append(", hash=");
        return wd0.o(sb, this.b, ", modelType=1}");
    }
}
