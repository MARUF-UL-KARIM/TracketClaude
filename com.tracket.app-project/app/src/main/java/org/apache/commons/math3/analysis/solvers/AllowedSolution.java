package org.apache.commons.math3.analysis.solvers;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class AllowedSolution {
    public static final /* synthetic */ AllowedSolution[] y = {new AllowedSolution("ANY_SIDE", 0), new AllowedSolution("LEFT_SIDE", 1), new AllowedSolution("RIGHT_SIDE", 2), new AllowedSolution("BELOW_SIDE", 3), new AllowedSolution("ABOVE_SIDE", 4)};

    /* JADX INFO: Fake field, exist only in values array */
    AllowedSolution EF5;

    public static AllowedSolution valueOf(String str) {
        return (AllowedSolution) Enum.valueOf(AllowedSolution.class, str);
    }

    public static AllowedSolution[] values() {
        return (AllowedSolution[]) y.clone();
    }
}
