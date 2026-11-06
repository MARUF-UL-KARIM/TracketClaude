package defpackage;

import com.tracket.support.SupportProjectBundleMode;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class lm8 {
    public final SupportProjectBundleMode a;
    public final boolean b;

    public lm8(SupportProjectBundleMode supportProjectBundleMode, boolean z) {
        this.a = supportProjectBundleMode;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lm8)) {
            return false;
        }
        lm8 lm8Var = (lm8) obj;
        return this.a == lm8Var.a && this.b == lm8Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SupportProjectBundlePlan(mode=" + this.a + ", includesLastExport=" + this.b + ")";
    }
}
