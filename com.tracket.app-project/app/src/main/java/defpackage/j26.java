package defpackage;

import com.tracket.editor.sheets.transform.PlanarWarpCorner;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class j26 implements m26 {
    public final PlanarWarpCorner a;

    public j26(PlanarWarpCorner planarWarpCorner) {
        planarWarpCorner.getClass();
        this.a = planarWarpCorner;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j26) && this.a == ((j26) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Corner(corner=" + this.a + ")";
    }
}
