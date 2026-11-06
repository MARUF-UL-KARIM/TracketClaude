package org.apache.commons.math3.stat.descriptive.moment;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class SemiVariance$Direction {
    public static final /* synthetic */ SemiVariance$Direction[] y = {new SemiVariance$Direction("UPSIDE", 0), new SemiVariance$Direction("DOWNSIDE", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    SemiVariance$Direction EF5;

    public static SemiVariance$Direction valueOf(String str) {
        return (SemiVariance$Direction) Enum.valueOf(SemiVariance$Direction.class, str);
    }

    public static SemiVariance$Direction[] values() {
        return (SemiVariance$Direction[]) y.clone();
    }
}
