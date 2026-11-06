package com.google.android.datatransport.cct.internal;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ComplianceData$ProductIdOrigin {
    public static final ComplianceData$ProductIdOrigin y;
    public static final /* synthetic */ ComplianceData$ProductIdOrigin[] z;

    /* JADX INFO: Fake field, exist only in values array */
    ComplianceData$ProductIdOrigin EF0;

    static {
        ComplianceData$ProductIdOrigin complianceData$ProductIdOrigin = new ComplianceData$ProductIdOrigin("NOT_SET", 0);
        ComplianceData$ProductIdOrigin complianceData$ProductIdOrigin2 = new ComplianceData$ProductIdOrigin("EVENT_OVERRIDE", 1);
        y = complianceData$ProductIdOrigin2;
        z = new ComplianceData$ProductIdOrigin[]{complianceData$ProductIdOrigin, complianceData$ProductIdOrigin2};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, complianceData$ProductIdOrigin);
        sparseArray.put(5, complianceData$ProductIdOrigin2);
    }

    public static ComplianceData$ProductIdOrigin valueOf(String str) {
        return (ComplianceData$ProductIdOrigin) Enum.valueOf(ComplianceData$ProductIdOrigin.class, str);
    }

    public static ComplianceData$ProductIdOrigin[] values() {
        return (ComplianceData$ProductIdOrigin[]) z.clone();
    }
}
