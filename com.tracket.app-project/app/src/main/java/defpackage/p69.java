package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class p69 {
    public final long a;
    public final List b;

    public p69(long j, List list) {
        this.a = j;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p69)) {
            return false;
        }
        p69 p69Var = (p69) obj;
        return this.a == p69Var.a && this.b.equals(p69Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TrackingSelectorSnapshot(generation=" + this.a + ", selectors=" + this.b + ")";
    }
}
