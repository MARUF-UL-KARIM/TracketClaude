package com.tracket.paywall;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ExpressDisclosureType {
    public static final ExpressDisclosureType A;
    public static final ExpressDisclosureType B;
    public static final ExpressDisclosureType C;
    public static final ExpressDisclosureType D;
    public static final ExpressDisclosureType E;
    public static final /* synthetic */ ExpressDisclosureType[] F;
    public static final ExpressDisclosureType y;
    public static final ExpressDisclosureType z;

    static {
        ExpressDisclosureType expressDisclosureType = new ExpressDisclosureType("WEEKLY_TRIAL", 0);
        y = expressDisclosureType;
        ExpressDisclosureType expressDisclosureType2 = new ExpressDisclosureType("WEEKLY_STANDARD", 1);
        z = expressDisclosureType2;
        ExpressDisclosureType expressDisclosureType3 = new ExpressDisclosureType("MONTHLY_TRIAL", 2);
        A = expressDisclosureType3;
        ExpressDisclosureType expressDisclosureType4 = new ExpressDisclosureType("MONTHLY_STANDARD", 3);
        B = expressDisclosureType4;
        ExpressDisclosureType expressDisclosureType5 = new ExpressDisclosureType("YEARLY_TRIAL", 4);
        C = expressDisclosureType5;
        ExpressDisclosureType expressDisclosureType6 = new ExpressDisclosureType("YEARLY_STANDARD", 5);
        D = expressDisclosureType6;
        ExpressDisclosureType expressDisclosureType7 = new ExpressDisclosureType("LIFETIME", 6);
        E = expressDisclosureType7;
        F = new ExpressDisclosureType[]{expressDisclosureType, expressDisclosureType2, expressDisclosureType3, expressDisclosureType4, expressDisclosureType5, expressDisclosureType6, expressDisclosureType7};
    }

    public static ExpressDisclosureType valueOf(String str) {
        return (ExpressDisclosureType) Enum.valueOf(ExpressDisclosureType.class, str);
    }

    public static ExpressDisclosureType[] values() {
        return (ExpressDisclosureType[]) F.clone();
    }
}
