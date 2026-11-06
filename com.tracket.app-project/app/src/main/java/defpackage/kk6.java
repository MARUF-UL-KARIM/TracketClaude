package defpackage;

import com.tracket.editor.timeline.data.ProxyCacheChangeReason;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class kk6 {
    public final long a;
    public final ProxyCacheChangeReason b;

    public kk6(long j, ProxyCacheChangeReason proxyCacheChangeReason) {
        this.a = j;
        this.b = proxyCacheChangeReason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kk6)) {
            return false;
        }
        kk6 kk6Var = (kk6) obj;
        return this.a == kk6Var.a && this.b == kk6Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ProxyCacheChange(revision=" + this.a + ", reason=" + this.b + ")";
    }
}
