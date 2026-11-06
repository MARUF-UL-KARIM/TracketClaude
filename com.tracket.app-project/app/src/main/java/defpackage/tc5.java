package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class tc5 {
    public final yc5 a;
    public final ArrayList b;

    public tc5(yc5 yc5Var, ArrayList arrayList) {
        this.a = yc5Var;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tc5)) {
            return false;
        }
        tc5 tc5Var = (tc5) obj;
        return this.a.equals(tc5Var.a) && this.b.equals(tc5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MeasuredLayout(layout=" + this.a + ", segments=" + this.b + ")";
    }
}
