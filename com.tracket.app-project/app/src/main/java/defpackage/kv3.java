package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class kv3 {
    public final int a;

    public kv3(int i) {
        this.a = i;
        if (i > 0) {
            return;
        }
        x94.a("Provided count should be larger than zero");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kv3) {
            return this.a == ((kv3) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return -this.a;
    }
}
