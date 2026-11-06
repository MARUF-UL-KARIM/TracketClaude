package com.google.common.primitives;

import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
final class Doubles$LexicographicalComparator implements Comparator<double[]> {
    public static final /* synthetic */ Doubles$LexicographicalComparator[] y = {new Doubles$LexicographicalComparator("INSTANCE", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    Doubles$LexicographicalComparator EF5;

    public static Doubles$LexicographicalComparator valueOf(String str) {
        return (Doubles$LexicographicalComparator) Enum.valueOf(Doubles$LexicographicalComparator.class, str);
    }

    public static Doubles$LexicographicalComparator[] values() {
        return (Doubles$LexicographicalComparator[]) y.clone();
    }

    @Override // java.util.Comparator
    public final int compare(double[] dArr, double[] dArr2) {
        double[] dArr3 = dArr;
        double[] dArr4 = dArr2;
        int iMin = Math.min(dArr3.length, dArr4.length);
        for (int i = 0; i < iMin; i++) {
            int iCompare = Double.compare(dArr3[i], dArr4[i]);
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return dArr3.length - dArr4.length;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "Doubles.lexicographicalComparator()";
    }
}
