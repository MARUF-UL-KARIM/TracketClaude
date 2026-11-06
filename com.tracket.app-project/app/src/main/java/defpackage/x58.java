package defpackage;

import com.tracket.editor.dto.StabilizationAnalysisQuality;
import com.tracket.editor.dto.StabilizationAnalysisResolution;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class x58 {
    public final StabilizationAnalysisResolution a;
    public final StabilizationAnalysisQuality b;

    public x58(StabilizationAnalysisResolution stabilizationAnalysisResolution, StabilizationAnalysisQuality stabilizationAnalysisQuality) {
        stabilizationAnalysisQuality.getClass();
        this.a = stabilizationAnalysisResolution;
        this.b = stabilizationAnalysisQuality;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x58)) {
            return false;
        }
        x58 x58Var = (x58) obj;
        return this.a == x58Var.a && this.b == x58Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StabilizationAnalysisSettings(resolution=" + this.a + ", quality=" + this.b + ")";
    }
}
