package com.google.android.gms.internal.consent_sdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class zzcg {
    public static final zzcg y;
    public static final /* synthetic */ zzcg[] z;

    /* JADX INFO: Fake field, exist only in values array */
    zzcg EF0;

    static {
        zzcg zzcgVar = new zzcg("DEBUG_PARAM_UNKNOWN", 0);
        zzcg zzcgVar2 = new zzcg("ALWAYS_SHOW", 1);
        zzcg zzcgVar3 = new zzcg("GEO_OVERRIDE_EEA", 2);
        zzcg zzcgVar4 = new zzcg("GEO_OVERRIDE_REGULATED_US_STATE", 3);
        zzcg zzcgVar5 = new zzcg("GEO_OVERRIDE_OTHER", 4);
        zzcg zzcgVar6 = new zzcg("GEO_OVERRIDE_NON_EEA", 5);
        zzcg zzcgVar7 = new zzcg("PREVIEWING_DEBUG_MESSAGES", 6);
        y = zzcgVar7;
        z = new zzcg[]{zzcgVar, zzcgVar2, zzcgVar3, zzcgVar4, zzcgVar5, zzcgVar6, zzcgVar7, new zzcg("GEO_OVERRIDE_USFL", 7)};
    }

    public static zzcg[] values() {
        return (zzcg[]) z.clone();
    }
}
