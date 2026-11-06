package org.apache.commons.math3.dfp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class DfpField$RoundingMode {
    public static final /* synthetic */ DfpField$RoundingMode[] y = {new DfpField$RoundingMode("ROUND_DOWN", 0), new DfpField$RoundingMode("ROUND_UP", 1), new DfpField$RoundingMode("ROUND_HALF_UP", 2), new DfpField$RoundingMode("ROUND_HALF_DOWN", 3), new DfpField$RoundingMode("ROUND_HALF_EVEN", 4), new DfpField$RoundingMode("ROUND_HALF_ODD", 5), new DfpField$RoundingMode("ROUND_CEIL", 6), new DfpField$RoundingMode("ROUND_FLOOR", 7)};

    /* JADX INFO: Fake field, exist only in values array */
    DfpField$RoundingMode EF5;

    public static DfpField$RoundingMode valueOf(String str) {
        return (DfpField$RoundingMode) Enum.valueOf(DfpField$RoundingMode.class, str);
    }

    public static DfpField$RoundingMode[] values() {
        return (DfpField$RoundingMode[]) y.clone();
    }
}
