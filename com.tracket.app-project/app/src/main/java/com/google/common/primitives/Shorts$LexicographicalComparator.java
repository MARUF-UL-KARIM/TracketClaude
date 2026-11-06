package com.google.common.primitives;

import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
final class Shorts$LexicographicalComparator implements Comparator<short[]> {
    public static final /* synthetic */ Shorts$LexicographicalComparator[] y = {new Shorts$LexicographicalComparator("INSTANCE", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    Shorts$LexicographicalComparator EF5;

    public static Shorts$LexicographicalComparator valueOf(String str) {
        return (Shorts$LexicographicalComparator) Enum.valueOf(Shorts$LexicographicalComparator.class, str);
    }

    public static Shorts$LexicographicalComparator[] values() {
        return (Shorts$LexicographicalComparator[]) y.clone();
    }

    @Override // java.util.Comparator
    public final int compare(short[] sArr, short[] sArr2) {
        short[] sArr3 = sArr;
        short[] sArr4 = sArr2;
        int iMin = Math.min(sArr3.length, sArr4.length);
        for (int i = 0; i < iMin; i++) {
            int iCompare = Short.compare(sArr3[i], sArr4[i]);
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return sArr3.length - sArr4.length;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "Shorts.lexicographicalComparator()";
    }
}
