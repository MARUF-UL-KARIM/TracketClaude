package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class coe {
    public final int a;
    public final long b;

    public coe(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof coe)) {
            return false;
        }
        coe coeVar = (coe) obj;
        return this.a == coeVar.a && this.b == coeVar.b;
    }

    public final int hashCode() {
        int i = this.a ^ 1000003;
        long j = this.b;
        return ((int) ((j >>> 32) ^ j)) ^ (i * 1000003);
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.a + ", eventTimestamp=" + this.b + "}";
    }
}
