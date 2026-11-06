package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class qa8 {
    public final long a;
    public final r07 b;
    public final List c;
    public final Map d;
    public final ip3 e;
    public final List f;
    public final int g;

    public qa8(long j, r07 r07Var, List list, Map map, ip3 ip3Var, List list2, int i) {
        list.getClass();
        list2.getClass();
        this.a = j;
        this.b = r07Var;
        this.c = list;
        this.d = map;
        this.e = ip3Var;
        this.f = list2;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa8)) {
            return false;
        }
        qa8 qa8Var = (qa8) obj;
        return this.a == qa8Var.a && this.b.equals(qa8Var.b) && ff4.h(this.c, qa8Var.c) && this.d.equals(qa8Var.d) && this.e.equals(qa8Var.e) && ff4.h(this.f, qa8Var.f) && this.g == qa8Var.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + ot5.d((this.e.hashCode() + ot5.h(this.d, ot5.d((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31, this.c), 31)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StabilizerAnalysisUpdate(positionInClipUs=");
        sb.append(this.a);
        sb.append(", frame=");
        sb.append(this.b);
        sb.append(", points=");
        sb.append(this.c);
        sb.append(", motions=");
        sb.append(this.d);
        sb.append(", stats=");
        sb.append(this.e);
        sb.append(", tiles=");
        sb.append(this.f);
        return pyd.e(sb, ", analyzedFrames=", this.g, ")");
    }
}
