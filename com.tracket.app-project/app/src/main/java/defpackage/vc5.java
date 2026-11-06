package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class vc5 {
    public final String a;
    public final boolean b;

    public vc5(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vc5)) {
            return false;
        }
        vc5 vc5Var = (vc5) obj;
        return this.a.equals(vc5Var.a) && this.b == vc5Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SegmentInput(text=" + this.a + ", highlighted=" + this.b + ")";
    }
}
