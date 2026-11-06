package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class nr3 implements pl1 {
    public final ml1 y;

    public nr3(ml1 ml1Var) {
        this.y = ml1Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nr3) {
            return this.y.equals(((nr3) obj).y);
        }
        return false;
    }

    public final int hashCode() {
        return this.y.hashCode() * 31;
    }
}
