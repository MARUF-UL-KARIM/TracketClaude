package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class t9a {
    public final String a;

    public t9a(String str) {
        hba hbaVar = hba.b;
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t9a)) {
            return false;
        }
        hba hbaVar = hba.b;
        return this.a.equals(((t9a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ hba.b.hashCode();
    }
}
