package defpackage;

import com.google.android.datatransport.Priority;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class h90 {
    public final dc1 a;
    public final HashMap b;

    public h90(dc1 dc1Var, HashMap map) {
        this.a = dc1Var;
        this.b = map;
    }

    public final long a(Priority priority, long j, int i) {
        long jB = j - this.a.b();
        i90 i90Var = (i90) this.b.get(priority);
        long j2 = i90Var.a;
        int i2 = i - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i2) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * ((long) i2)))), jB), i90Var.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h90)) {
            return false;
        }
        h90 h90Var = (h90) obj;
        return this.a.equals(h90Var.a) && this.b.equals(h90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
