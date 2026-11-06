package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class g2b {
    public final long a;
    public final String b;
    public final int c;

    public g2b(long j, int i, String str) {
        this.a = j;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g2b)) {
            return false;
        }
        g2b g2bVar = (g2b) obj;
        return g2bVar.a == this.a && g2bVar.c == this.c;
    }

    public final int hashCode() {
        return (int) this.a;
    }
}
