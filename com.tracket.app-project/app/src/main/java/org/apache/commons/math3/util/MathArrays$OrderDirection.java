package org.apache.commons.math3.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class MathArrays$OrderDirection {
    public static final /* synthetic */ MathArrays$OrderDirection[] y = {new MathArrays$OrderDirection("INCREASING", 0), new MathArrays$OrderDirection("DECREASING", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    MathArrays$OrderDirection EF5;

    public static MathArrays$OrderDirection valueOf(String str) {
        return (MathArrays$OrderDirection) Enum.valueOf(MathArrays$OrderDirection.class, str);
    }

    public static MathArrays$OrderDirection[] values() {
        return (MathArrays$OrderDirection[]) y.clone();
    }
}
