package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class m40 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof m40) {
            return this.a == ((m40) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "AutoClearFocusBehavior(value=" + this.a + ')';
    }
}
