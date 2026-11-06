package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class r98 {
    public final LinkedHashMap a;
    public final u88 b;

    public r98(LinkedHashMap linkedHashMap, u88 u88Var) {
        this.a = linkedHashMap;
        this.b = u88Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r98)) {
            return false;
        }
        r98 r98Var = (r98) obj;
        return this.a.equals(r98Var.a) && this.b.equals(r98Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StabilizationResolvedMotionStream(frames=" + this.a + ", metrics=" + this.b + ")";
    }
}
