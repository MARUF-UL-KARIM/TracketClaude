package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class mu4 extends nu4 {
    public final d42 a;

    public mu4(d42 d42Var) {
        this.a = d42Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mu4.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((mu4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (mu4.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }
}
