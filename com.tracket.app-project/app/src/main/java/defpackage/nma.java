package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class nma implements Comparable {
    public final long A;
    public final long y;
    public final long z;

    public /* synthetic */ nma(long j, long j2, long j3) {
        this.y = j;
        this.z = j2;
        this.A = j3;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.y, ((nma) obj).y);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nma)) {
            return false;
        }
        nma nmaVar = (nma) obj;
        return this.y == nmaVar.y && this.z == nmaVar.z && this.A == nmaVar.A;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.y), Long.valueOf(this.z), Long.valueOf(this.A));
    }
}
