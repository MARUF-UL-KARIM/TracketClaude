package com.google.common.primitives;

import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
final class UnsignedLongs$LexicographicalComparator implements Comparator<long[]> {
    public static final /* synthetic */ UnsignedLongs$LexicographicalComparator[] y = {new UnsignedLongs$LexicographicalComparator("INSTANCE", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    UnsignedLongs$LexicographicalComparator EF5;

    public static UnsignedLongs$LexicographicalComparator valueOf(String str) {
        return (UnsignedLongs$LexicographicalComparator) Enum.valueOf(UnsignedLongs$LexicographicalComparator.class, str);
    }

    public static UnsignedLongs$LexicographicalComparator[] values() {
        return (UnsignedLongs$LexicographicalComparator[]) y.clone();
    }

    @Override // java.util.Comparator
    public final int compare(long[] jArr, long[] jArr2) {
        long[] jArr3 = jArr;
        long[] jArr4 = jArr2;
        int iMin = Math.min(jArr3.length, jArr4.length);
        for (int i = 0; i < iMin; i++) {
            long j = jArr3[i];
            long j2 = jArr4[i];
            if (j != j2) {
                return Long.compare(j ^ Long.MIN_VALUE, Long.MIN_VALUE ^ j2);
            }
        }
        return jArr3.length - jArr4.length;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "UnsignedLongs.lexicographicalComparator()";
    }
}
