package com.google.android.gms.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class AgeRestrictedTreatment {
    public static final /* synthetic */ AgeRestrictedTreatment[] y = {new AgeRestrictedTreatment("UNSPECIFIED", 0), new AgeRestrictedTreatment("CHILD", 1), new AgeRestrictedTreatment("TEEN", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    AgeRestrictedTreatment EF5;

    public static AgeRestrictedTreatment valueOf(String str) {
        return (AgeRestrictedTreatment) Enum.valueOf(AgeRestrictedTreatment.class, str);
    }

    public static AgeRestrictedTreatment[] values() {
        return (AgeRestrictedTreatment[]) y.clone();
    }
}
