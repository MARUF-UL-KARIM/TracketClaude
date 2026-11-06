package defpackage;

import com.tracket.editor.dto.TrackingRegionShape;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class mj7 implements pj7 {
    public final TrackingRegionShape a;
    public final a69 b;

    public mj7(TrackingRegionShape trackingRegionShape, a69 a69Var) {
        trackingRegionShape.getClass();
        this.a = trackingRegionShape;
        this.b = a69Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mj7)) {
            return false;
        }
        mj7 mj7Var = (mj7) obj;
        return this.a == mj7Var.a && this.b.equals(mj7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Area(shape=" + this.a + ", geometry=" + this.b + ")";
    }
}
