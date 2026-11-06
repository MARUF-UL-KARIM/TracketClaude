package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class Priority {
    public static final Priority A;
    public static final /* synthetic */ Priority[] B;
    public static final Priority y;
    public static final Priority z;

    static {
        Priority priority = new Priority("DEFAULT", 0);
        y = priority;
        Priority priority2 = new Priority("VERY_LOW", 1);
        z = priority2;
        Priority priority3 = new Priority("HIGHEST", 2);
        A = priority3;
        B = new Priority[]{priority, priority2, priority3};
    }

    public static Priority valueOf(String str) {
        return (Priority) Enum.valueOf(Priority.class, str);
    }

    public static Priority[] values() {
        return (Priority[]) B.clone();
    }
}
