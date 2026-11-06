package org.apache.commons.math3.optim.nonlinear.scalar;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class GoalType {
    public static final /* synthetic */ GoalType[] y = {new GoalType("MAXIMIZE", 0), new GoalType("MINIMIZE", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    GoalType EF5;

    public static GoalType valueOf(String str) {
        return (GoalType) Enum.valueOf(GoalType.class, str);
    }

    public static GoalType[] values() {
        return (GoalType[]) y.clone();
    }
}
