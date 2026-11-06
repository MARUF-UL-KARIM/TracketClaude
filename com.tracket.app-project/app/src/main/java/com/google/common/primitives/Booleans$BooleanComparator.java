package com.google.common.primitives;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
enum Booleans$BooleanComparator implements Comparator<Boolean> {
    /* JADX INFO: Fake field, exist only in values array */
    EF8("TRUE_FIRST", "Booleans.trueFirst()"),
    /* JADX INFO: Fake field, exist only in values array */
    EF18("FALSE_FIRST", "Booleans.falseFirst()");

    public final int y;
    public final String z;

    Booleans$BooleanComparator(String str, String str2) {
        this.y = i;
        this.z = str2;
    }

    @Override // java.util.Comparator
    public final int compare(Boolean bool, Boolean bool2) {
        Boolean bool3 = bool2;
        boolean zBooleanValue = bool.booleanValue();
        int i = this.y;
        return (bool3.booleanValue() ? i : 0) - (zBooleanValue ? i : 0);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.z;
    }
}
