package com.arkivanov.decompose.router.items;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class Items$ActiveLifecycleState {
    public static final /* synthetic */ Items$ActiveLifecycleState[] y = {new Items$ActiveLifecycleState("CREATED", 0), new Items$ActiveLifecycleState("STARTED", 1), new Items$ActiveLifecycleState("RESUMED", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    Items$ActiveLifecycleState EF5;

    public static Items$ActiveLifecycleState valueOf(String str) {
        return (Items$ActiveLifecycleState) Enum.valueOf(Items$ActiveLifecycleState.class, str);
    }

    public static Items$ActiveLifecycleState[] values() {
        return (Items$ActiveLifecycleState[]) y.clone();
    }
}
