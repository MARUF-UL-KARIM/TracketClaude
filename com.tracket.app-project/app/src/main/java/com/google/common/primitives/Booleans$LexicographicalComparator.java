package com.google.common.primitives;

import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
final class Booleans$LexicographicalComparator implements Comparator<boolean[]> {
    public static final /* synthetic */ Booleans$LexicographicalComparator[] y = {new Booleans$LexicographicalComparator("INSTANCE", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    Booleans$LexicographicalComparator EF5;

    public static Booleans$LexicographicalComparator valueOf(String str) {
        return (Booleans$LexicographicalComparator) Enum.valueOf(Booleans$LexicographicalComparator.class, str);
    }

    public static Booleans$LexicographicalComparator[] values() {
        return (Booleans$LexicographicalComparator[]) y.clone();
    }

    @Override // java.util.Comparator
    public final int compare(boolean[] zArr, boolean[] zArr2) {
        boolean[] zArr3 = zArr;
        boolean[] zArr4 = zArr2;
        int iMin = Math.min(zArr3.length, zArr4.length);
        for (int i = 0; i < iMin; i++) {
            int iCompare = Boolean.compare(zArr3[i], zArr4[i]);
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return zArr3.length - zArr4.length;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "Booleans.lexicographicalComparator()";
    }
}
