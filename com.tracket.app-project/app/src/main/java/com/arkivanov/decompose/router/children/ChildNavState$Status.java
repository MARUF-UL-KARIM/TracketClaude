package com.arkivanov.decompose.router.children;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ChildNavState$Status {
    public static final /* synthetic */ ChildNavState$Status[] A;
    public static final ChildNavState$Status y;
    public static final ChildNavState$Status z;

    /* JADX INFO: Fake field, exist only in values array */
    ChildNavState$Status EF0;

    static {
        ChildNavState$Status childNavState$Status = new ChildNavState$Status("DESTROYED", 0);
        ChildNavState$Status childNavState$Status2 = new ChildNavState$Status("CREATED", 1);
        y = childNavState$Status2;
        ChildNavState$Status childNavState$Status3 = new ChildNavState$Status("STARTED", 2);
        ChildNavState$Status childNavState$Status4 = new ChildNavState$Status("RESUMED", 3);
        z = childNavState$Status4;
        A = new ChildNavState$Status[]{childNavState$Status, childNavState$Status2, childNavState$Status3, childNavState$Status4};
    }

    public static ChildNavState$Status valueOf(String str) {
        return (ChildNavState$Status) Enum.valueOf(ChildNavState$Status.class, str);
    }

    public static ChildNavState$Status[] values() {
        return (ChildNavState$Status[]) A.clone();
    }
}
