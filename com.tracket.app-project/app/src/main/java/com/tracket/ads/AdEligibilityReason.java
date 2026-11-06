package com.tracket.ads;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public enum AdEligibilityReason {
    ELIGIBLE("eligible"),
    DISABLED("disabled"),
    PRO("pro"),
    CONSENT("consent"),
    ENTITLEMENT_PENDING("entitlement_pending"),
    BACKGROUND("background"),
    SCREEN("screen"),
    SHORT_SESSION("short_session"),
    NO_MEANINGFUL_EDIT("no_meaningful_edit"),
    REWARDED_USED("rewarded_used"),
    COOLDOWN("cooldown"),
    DAILY_CAP("daily_cap"),
    SUPPRESSED_RETURN("suppressed_return"),
    COLD_START("cold_start"),
    SHORT_BACKGROUND("short_background"),
    FULLSCREEN_ACTIVE("fullscreen_active"),
    NOT_READY("not_ready"),
    INTERACTION("interaction");

    public final String y;

    AdEligibilityReason(String str) {
        this.y = str;
    }
}
