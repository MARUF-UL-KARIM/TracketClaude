package defpackage;

import com.tracket.editor.tracking.ui.TrackingEditComponent$State$MoveMode;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class m49 {
    public final TrackingEditComponent$State$MoveMode a;
    public final boolean b;

    public m49(TrackingEditComponent$State$MoveMode trackingEditComponent$State$MoveMode, boolean z) {
        trackingEditComponent$State$MoveMode.getClass();
        this.a = trackingEditComponent$State$MoveMode;
        this.b = z;
    }

    public static m49 a(m49 m49Var, TrackingEditComponent$State$MoveMode trackingEditComponent$State$MoveMode, boolean z, int i) {
        if ((i & 1) != 0) {
            trackingEditComponent$State$MoveMode = m49Var.a;
        }
        if ((i & 2) != 0) {
            z = m49Var.b;
        }
        trackingEditComponent$State$MoveMode.getClass();
        return new m49(trackingEditComponent$State$MoveMode, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m49)) {
            return false;
        }
        m49 m49Var = (m49) obj;
        return this.a == m49Var.a && this.b == m49Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "State(moveMode=" + this.a + ", canReset=" + this.b + ")";
    }
}
