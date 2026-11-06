package com.tracket.editor.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class GuardTarget {
    public static final /* synthetic */ GuardTarget[] A;
    public static final GuardTarget y;
    public static final GuardTarget z;

    static {
        GuardTarget guardTarget = new GuardTarget("MAIN", 0);
        y = guardTarget;
        GuardTarget guardTarget2 = new GuardTarget("OVERLAY", 1);
        z = guardTarget2;
        A = new GuardTarget[]{guardTarget, guardTarget2};
    }

    public static GuardTarget valueOf(String str) {
        return (GuardTarget) Enum.valueOf(GuardTarget.class, str);
    }

    public static GuardTarget[] values() {
        return (GuardTarget[]) A.clone();
    }
}
