package org.koin.core.option;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class KoinOption {
    public static final /* synthetic */ KoinOption[] y = {new KoinOption("VIEWMODEL_SCOPE_FACTORY", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    KoinOption EF5;

    public static KoinOption valueOf(String str) {
        return (KoinOption) Enum.valueOf(KoinOption.class, str);
    }

    public static KoinOption[] values() {
        return (KoinOption[]) y.clone();
    }
}
