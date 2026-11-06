package com.arkivanov.decompose.router.children;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
final class ChildController$ActiveLifecycleState {
    public static final /* synthetic */ ChildController$ActiveLifecycleState[] y = {new ChildController$ActiveLifecycleState("CREATED", 0), new ChildController$ActiveLifecycleState("STARTED", 1), new ChildController$ActiveLifecycleState("RESUMED", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    ChildController$ActiveLifecycleState EF5;

    public static ChildController$ActiveLifecycleState valueOf(String str) {
        return (ChildController$ActiveLifecycleState) Enum.valueOf(ChildController$ActiveLifecycleState.class, str);
    }

    public static ChildController$ActiveLifecycleState[] values() {
        return (ChildController$ActiveLifecycleState[]) y.clone();
    }
}
