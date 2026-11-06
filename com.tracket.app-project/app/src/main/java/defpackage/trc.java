package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class trc implements rrc {
    public final String a;

    public trc(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof trc) {
            return this.a.equals(((trc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
