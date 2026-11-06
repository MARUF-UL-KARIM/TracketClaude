package com.google.common.primitives;

import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
final class Ints$LexicographicalComparator implements Comparator<int[]> {
    public static final /* synthetic */ Ints$LexicographicalComparator[] y = {new Ints$LexicographicalComparator("INSTANCE", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    Ints$LexicographicalComparator EF5;

    public static Ints$LexicographicalComparator valueOf(String str) {
        return (Ints$LexicographicalComparator) Enum.valueOf(Ints$LexicographicalComparator.class, str);
    }

    public static Ints$LexicographicalComparator[] values() {
        return (Ints$LexicographicalComparator[]) y.clone();
    }

    @Override // java.util.Comparator
    public final int compare(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        int iMin = Math.min(iArr3.length, iArr4.length);
        for (int i = 0; i < iMin; i++) {
            int iCompare = Integer.compare(iArr3[i], iArr4[i]);
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return iArr3.length - iArr4.length;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "Ints.lexicographicalComparator()";
    }
}
