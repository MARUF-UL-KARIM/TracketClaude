package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class z98 {
    public final List a;
    public final List b;

    public z98(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z98)) {
            return false;
        }
        z98 z98Var = (z98) obj;
        return this.a.equals(z98Var.a) && this.b.equals(z98Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StabilizationSolvedPath(relativeFrames=" + this.a + ", corrections=" + this.b + ")";
    }
}
