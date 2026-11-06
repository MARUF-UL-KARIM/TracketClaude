package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class of6 {
    public boolean a;
    public final List b;

    public of6() {
        ArrayList arrayList = new ArrayList();
        this.a = false;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof of6)) {
            return false;
        }
        of6 of6Var = (of6) obj;
        return this.a == of6Var.a && this.b.equals(of6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "MaskRule(keepStillMask=" + this.a + ", videoRanges=" + this.b + ")";
    }
}
