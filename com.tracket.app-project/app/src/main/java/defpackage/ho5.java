package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ho5 {
    public static final int d = e46.d;
    public final long a;
    public final e46 b;
    public final boolean c;

    public ho5(long j, e46 e46Var, boolean z) {
        this.a = j;
        this.b = e46Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho5)) {
            return false;
        }
        ho5 ho5Var = (ho5) obj;
        return this.a == ho5Var.a && this.b.equals(ho5Var.b) && this.c == ho5Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "OnPositionChanged(positionInClipUs=" + this.a + ", playbackState=" + this.b + ", withAnimation=" + this.c + ")";
    }
}
