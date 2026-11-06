package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class c13 implements g13 {
    public final yx2 a;

    public c13(yx2 yx2Var) {
        this.a = yx2Var;
    }

    @Override // defpackage.g13
    public final float a() {
        return this.a.a;
    }

    @Override // defpackage.g13
    public final float b() {
        return this.a.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c13) && this.a.equals(((c13) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Ellipse(params=" + this.a + ")";
    }
}
