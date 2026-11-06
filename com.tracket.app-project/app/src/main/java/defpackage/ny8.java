package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ny8 {
    public static final my8 Companion = new my8();
    public final long a;
    public final long b;
    public final long c;

    public /* synthetic */ ny8(long j, int i, long j2, long j3) {
        if (1 != (i & 1)) {
            ksd.c(i, 1, ly8.a.d());
            throw null;
        }
        this.a = j;
        this.b = (i & 2) == 0 ? j * 1000 : j2;
        if ((i & 4) == 0) {
            this.c = j / 1000;
        } else {
            this.c = j3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ny8) && this.a == ((ny8) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "Time(ms=" + this.a + ')';
    }

    public ny8(long j) {
        this.a = j;
        this.b = j * 1000;
        this.c = j / 1000;
    }
}
