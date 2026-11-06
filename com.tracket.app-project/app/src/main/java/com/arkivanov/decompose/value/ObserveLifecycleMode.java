package com.arkivanov.decompose.value;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ObserveLifecycleMode {
    public static final /* synthetic */ ObserveLifecycleMode[] y = {new ObserveLifecycleMode("CREATE_DESTROY", 0), new ObserveLifecycleMode("START_STOP", 1), new ObserveLifecycleMode("RESUME_PAUSE", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    ObserveLifecycleMode EF5;

    public static ObserveLifecycleMode valueOf(String str) {
        return (ObserveLifecycleMode) Enum.valueOf(ObserveLifecycleMode.class, str);
    }

    public static ObserveLifecycleMode[] values() {
        return (ObserveLifecycleMode[]) y.clone();
    }
}
