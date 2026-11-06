package defpackage;

import com.tracket.ads.AdEligibilityReason;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class e6 {
    public final AdEligibilityReason a;

    public e6(AdEligibilityReason adEligibilityReason) {
        adEligibilityReason.getClass();
        this.a = adEligibilityReason;
    }

    public final boolean a() {
        return this.a == AdEligibilityReason.ELIGIBLE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e6) && this.a == ((e6) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AdEligibility(reason=" + this.a + ")";
    }
}
