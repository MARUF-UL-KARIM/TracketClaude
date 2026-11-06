package org.apache.commons.math3.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
final class Combinations$IterationOrder {
    public static final /* synthetic */ Combinations$IterationOrder[] y = {new Combinations$IterationOrder("LEXICOGRAPHIC", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    Combinations$IterationOrder EF5;

    public static Combinations$IterationOrder valueOf(String str) {
        return (Combinations$IterationOrder) Enum.valueOf(Combinations$IterationOrder.class, str);
    }

    public static Combinations$IterationOrder[] values() {
        return (Combinations$IterationOrder[]) y.clone();
    }
}
