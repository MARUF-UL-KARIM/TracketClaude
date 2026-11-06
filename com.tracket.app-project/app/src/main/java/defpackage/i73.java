package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class i73 {
    public final List a;
    public final float b;

    public i73(float f, List list) {
        this.a = list;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i73)) {
            return false;
        }
        i73 i73Var = (i73) obj;
        return this.a.equals(i73Var.a) && Float.compare(this.b, i73Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ExpressTicketFeatureLayout(lines=" + this.a + ", scale=" + this.b + ")";
    }
}
