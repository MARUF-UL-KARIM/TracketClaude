package com.google.common.primitives;

import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
final class SignedBytes$LexicographicalComparator implements Comparator<byte[]> {
    public static final /* synthetic */ SignedBytes$LexicographicalComparator[] y = {new SignedBytes$LexicographicalComparator("INSTANCE", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    SignedBytes$LexicographicalComparator EF5;

    public static SignedBytes$LexicographicalComparator valueOf(String str) {
        return (SignedBytes$LexicographicalComparator) Enum.valueOf(SignedBytes$LexicographicalComparator.class, str);
    }

    public static SignedBytes$LexicographicalComparator[] values() {
        return (SignedBytes$LexicographicalComparator[]) y.clone();
    }

    @Override // java.util.Comparator
    public final int compare(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        int iMin = Math.min(bArr3.length, bArr4.length);
        for (int i = 0; i < iMin; i++) {
            int iCompare = Byte.compare(bArr3[i], bArr4[i]);
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return bArr3.length - bArr4.length;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "SignedBytes.lexicographicalComparator()";
    }
}
