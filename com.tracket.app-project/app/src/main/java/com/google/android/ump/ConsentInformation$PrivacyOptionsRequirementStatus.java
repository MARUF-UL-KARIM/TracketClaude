package com.google.android.ump;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ConsentInformation$PrivacyOptionsRequirementStatus {
    public static final ConsentInformation$PrivacyOptionsRequirementStatus A;
    public static final /* synthetic */ ConsentInformation$PrivacyOptionsRequirementStatus[] B;
    public static final ConsentInformation$PrivacyOptionsRequirementStatus y;
    public static final ConsentInformation$PrivacyOptionsRequirementStatus z;

    static {
        ConsentInformation$PrivacyOptionsRequirementStatus consentInformation$PrivacyOptionsRequirementStatus = new ConsentInformation$PrivacyOptionsRequirementStatus("UNKNOWN", 0);
        y = consentInformation$PrivacyOptionsRequirementStatus;
        ConsentInformation$PrivacyOptionsRequirementStatus consentInformation$PrivacyOptionsRequirementStatus2 = new ConsentInformation$PrivacyOptionsRequirementStatus("NOT_REQUIRED", 1);
        z = consentInformation$PrivacyOptionsRequirementStatus2;
        ConsentInformation$PrivacyOptionsRequirementStatus consentInformation$PrivacyOptionsRequirementStatus3 = new ConsentInformation$PrivacyOptionsRequirementStatus("REQUIRED", 2);
        A = consentInformation$PrivacyOptionsRequirementStatus3;
        B = new ConsentInformation$PrivacyOptionsRequirementStatus[]{consentInformation$PrivacyOptionsRequirementStatus, consentInformation$PrivacyOptionsRequirementStatus2, consentInformation$PrivacyOptionsRequirementStatus3};
    }

    public static ConsentInformation$PrivacyOptionsRequirementStatus valueOf(String str) {
        return (ConsentInformation$PrivacyOptionsRequirementStatus) Enum.valueOf(ConsentInformation$PrivacyOptionsRequirementStatus.class, str);
    }

    public static ConsentInformation$PrivacyOptionsRequirementStatus[] values() {
        return (ConsentInformation$PrivacyOptionsRequirementStatus[]) B.clone();
    }
}
