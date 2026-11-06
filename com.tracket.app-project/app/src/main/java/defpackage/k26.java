package defpackage;

import com.tracket.editor.sheets.transform.PlanarWarpEdge;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class k26 implements m26 {
    public final PlanarWarpEdge a;

    public k26(PlanarWarpEdge planarWarpEdge) {
        planarWarpEdge.getClass();
        this.a = planarWarpEdge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k26) && this.a == ((k26) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Edge(edge=" + this.a + ")";
    }
}
