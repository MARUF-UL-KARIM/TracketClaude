package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class yh3 {
    public final ArrayList a;
    public final ih3 b;

    public yh3(ArrayList arrayList, ih3 ih3Var) {
        this.a = arrayList;
        this.b = ih3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yh3)) {
            return false;
        }
        yh3 yh3Var = (yh3) obj;
        return this.a.equals(yh3Var.a) && this.b.equals(yh3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FlowTrackingResult(results=" + this.a + ", diagnostics=" + this.b + ")";
    }
}
