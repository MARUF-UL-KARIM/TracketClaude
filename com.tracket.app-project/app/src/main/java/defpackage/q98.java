package defpackage;

import com.tracket.editor.dto.StabilizationMotionModel;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class q98 {
    public final v88 a;
    public final StabilizationMotionModel b;

    public q98(v88 v88Var, StabilizationMotionModel stabilizationMotionModel) {
        this.a = v88Var;
        this.b = stabilizationMotionModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q98)) {
            return false;
        }
        q98 q98Var = (q98) obj;
        return this.a.equals(q98Var.a) && this.b == q98Var.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        StabilizationMotionModel stabilizationMotionModel = this.b;
        return iHashCode + (stabilizationMotionModel == null ? 0 : stabilizationMotionModel.hashCode());
    }

    public final String toString() {
        return "StabilizationResolvedMotionFrame(frame=" + this.a + ", sourceModel=" + this.b + ")";
    }
}
