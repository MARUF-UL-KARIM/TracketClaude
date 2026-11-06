package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class o80 extends pc3 {
    public final p80 a;

    public o80(p80 p80Var) {
        this.a = p80Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pc3)) {
            return false;
        }
        return this.a.equals(((o80) ((pc3) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ModelOptions{modelInfo=" + this.a + "}";
    }
}
