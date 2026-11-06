package com.google.android.gms.ads.initialization;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class AdapterStatus$State {
    public static final /* synthetic */ AdapterStatus$State[] y = {new AdapterStatus$State("NOT_READY", 0), new AdapterStatus$State("READY", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    AdapterStatus$State EF5;

    public static AdapterStatus$State valueOf(String str) {
        return (AdapterStatus$State) Enum.valueOf(AdapterStatus$State.class, str);
    }

    public static AdapterStatus$State[] values() {
        return (AdapterStatus$State[]) y.clone();
    }
}
