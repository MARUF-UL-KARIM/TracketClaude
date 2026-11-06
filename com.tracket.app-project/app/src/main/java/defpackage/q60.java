package defpackage;

import com.google.android.datatransport.cct.internal.ComplianceData$ProductIdOrigin;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class q60 extends ni1 {
    public final j80 a;

    public q60(j80 j80Var) {
        ComplianceData$ProductIdOrigin complianceData$ProductIdOrigin = ComplianceData$ProductIdOrigin.y;
        this.a = j80Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ni1)) {
            return false;
        }
        if (!this.a.equals(((q60) ((ni1) obj)).a)) {
            return false;
        }
        Object obj2 = ComplianceData$ProductIdOrigin.y;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ ComplianceData$ProductIdOrigin.y.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.a + ", productIdOrigin=" + ComplianceData$ProductIdOrigin.y + "}";
    }
}
