package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class th1 {
    public final int a;
    public final ArrayList b;

    public th1(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof th1)) {
            return false;
        }
        th1 th1Var = (th1) obj;
        return this.a == th1Var.a && this.b.equals(th1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "CommonPlayerVisualDebugSnapshot(producerCount=" + this.a + ", producers=" + this.b + ")";
    }
}
