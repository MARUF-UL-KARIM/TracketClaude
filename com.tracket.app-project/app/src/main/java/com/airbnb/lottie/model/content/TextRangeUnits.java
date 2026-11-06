package com.airbnb.lottie.model.content;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class TextRangeUnits {
    public static final /* synthetic */ TextRangeUnits[] A;
    public static final TextRangeUnits y;
    public static final TextRangeUnits z;

    static {
        TextRangeUnits textRangeUnits = new TextRangeUnits("PERCENT", 0);
        y = textRangeUnits;
        TextRangeUnits textRangeUnits2 = new TextRangeUnits("INDEX", 1);
        z = textRangeUnits2;
        A = new TextRangeUnits[]{textRangeUnits, textRangeUnits2};
    }

    public static TextRangeUnits valueOf(String str) {
        return (TextRangeUnits) Enum.valueOf(TextRangeUnits.class, str);
    }

    public static TextRangeUnits[] values() {
        return (TextRangeUnits[]) A.clone();
    }
}
