package com.tracket.paywall;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class PaywallComponent$State$PaywallOfferContent {
    public static final PaywallComponent$State$PaywallOfferContent A;
    public static final /* synthetic */ PaywallComponent$State$PaywallOfferContent[] B;
    public static final PaywallComponent$State$PaywallOfferContent y;
    public static final PaywallComponent$State$PaywallOfferContent z;

    static {
        PaywallComponent$State$PaywallOfferContent paywallComponent$State$PaywallOfferContent = new PaywallComponent$State$PaywallOfferContent("LOADING", 0);
        y = paywallComponent$State$PaywallOfferContent;
        PaywallComponent$State$PaywallOfferContent paywallComponent$State$PaywallOfferContent2 = new PaywallComponent$State$PaywallOfferContent("SELECTOR", 1);
        z = paywallComponent$State$PaywallOfferContent2;
        PaywallComponent$State$PaywallOfferContent paywallComponent$State$PaywallOfferContent3 = new PaywallComponent$State$PaywallOfferContent("ERROR", 2);
        A = paywallComponent$State$PaywallOfferContent3;
        B = new PaywallComponent$State$PaywallOfferContent[]{paywallComponent$State$PaywallOfferContent, paywallComponent$State$PaywallOfferContent2, paywallComponent$State$PaywallOfferContent3};
    }

    public static PaywallComponent$State$PaywallOfferContent valueOf(String str) {
        return (PaywallComponent$State$PaywallOfferContent) Enum.valueOf(PaywallComponent$State$PaywallOfferContent.class, str);
    }

    public static PaywallComponent$State$PaywallOfferContent[] values() {
        return (PaywallComponent$State$PaywallOfferContent[]) B.clone();
    }
}
