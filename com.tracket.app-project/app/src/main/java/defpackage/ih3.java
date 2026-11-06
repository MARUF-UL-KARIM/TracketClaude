package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ih3 {
    public final int a;
    public final long b;
    public final ph3 c;
    public final List d;
    public final List e;
    public final long f;
    public final long g;
    public final vh3 h;
    public final Map i;
    public final Map j;

    public ih3(int i, long j, ph3 ph3Var, List list, List list2, long j2, long j3, vh3 vh3Var, Map map, Map map2) {
        map.getClass();
        map2.getClass();
        this.a = i;
        this.b = j;
        this.c = ph3Var;
        this.d = list;
        this.e = list2;
        this.f = j2;
        this.g = j3;
        this.h = vh3Var;
        this.i = map;
        this.j = map2;
    }

    public static ih3 a(ih3 ih3Var, ph3 ph3Var, ArrayList arrayList, ArrayList arrayList2, Map map, Map map2, int i) {
        int i2 = ih3Var.a;
        long j = ih3Var.b;
        ph3 ph3Var2 = (i & 4) != 0 ? ih3Var.c : ph3Var;
        List list = (i & 8) != 0 ? ih3Var.d : arrayList;
        List list2 = (i & 16) != 0 ? ih3Var.e : arrayList2;
        long j2 = ih3Var.f;
        long j3 = ih3Var.g;
        vh3 vh3Var = ih3Var.h;
        Map map3 = (i & 256) != 0 ? ih3Var.i : map;
        Map map4 = (i & 512) != 0 ? ih3Var.j : map2;
        ih3Var.getClass();
        map3.getClass();
        map4.getClass();
        return new ih3(i2, j, ph3Var2, list, list2, j2, j3, vh3Var, map3, map4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ih3)) {
            return false;
        }
        ih3 ih3Var = (ih3) obj;
        return this.a == ih3Var.a && this.b == ih3Var.b && this.c.equals(ih3Var.c) && this.d.equals(ih3Var.d) && this.e.equals(ih3Var.e) && this.f == ih3Var.f && this.g == ih3Var.g && this.h.equals(ih3Var.h) && ff4.h(this.i, ih3Var.i) && ff4.h(this.j, ih3Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + ot5.h(this.i, (this.h.hashCode() + ot5.c(ot5.c(ot5.d(ot5.d((this.c.hashCode() + ot5.c(Integer.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlowTrackerBatchResult(flags=");
        sb.append(this.a);
        sb.append(", sessionFrameIndex=");
        sb.append(this.b);
        sb.append(", globalResult=");
        sb.append(this.c);
        sb.append(", targets=");
        sb.append(this.d);
        sb.append(", pointDiagnostics=");
        sb.append(this.e);
        sb.append(", processingTimeUs=");
        sb.append(this.f);
        iu1.y(sb, ", adapterProcessingTimeUs=", this.g, ", stageTimings=");
        sb.append(this.h);
        sb.append(", nanoDiagnostics=");
        sb.append(this.i);
        sb.append(", geometries=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }
}
