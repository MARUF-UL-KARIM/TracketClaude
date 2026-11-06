package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class pe8 {
    public final ArrayList a;
    public final qe8 b;

    public pe8(ArrayList arrayList, qe8 qe8Var) {
        this.a = arrayList;
        this.b = qe8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pe8)) {
            return false;
        }
        pe8 pe8Var = (pe8) obj;
        return this.a.equals(pe8Var.a) && this.b.equals(pe8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StickerOverlayPreview(frames=" + this.a + ", key=" + this.b + ")";
    }
}
