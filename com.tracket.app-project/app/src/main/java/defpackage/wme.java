package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class wme {
    public static final wme b;
    public static final wme c;
    public final long a;

    static {
        wme wmeVar = new wme(0L);
        b = new wme(Long.MAX_VALUE);
        c = wmeVar;
    }

    public wme(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && wme.class == obj.getClass() && this.a == ((wme) obj).a;
    }

    public final int hashCode() {
        return ((int) this.a) * 31;
    }
}
