package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class rd6 {
    public final int a;

    public rd6(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rd6) {
            return this.a == ((rd6) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}
