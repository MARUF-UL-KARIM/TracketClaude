package org.apache.commons.math3.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class MathArrays$Position {
    public static final /* synthetic */ MathArrays$Position[] y = {new MathArrays$Position("HEAD", 0), new MathArrays$Position("TAIL", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    MathArrays$Position EF5;

    public static MathArrays$Position valueOf(String str) {
        return (MathArrays$Position) Enum.valueOf(MathArrays$Position.class, str);
    }

    public static MathArrays$Position[] values() {
        return (MathArrays$Position[]) y.clone();
    }
}
