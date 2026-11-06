package com.google.android.gms.internal.consent_sdk;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class zzsz {
    public static final zzsz A;
    public static final zzsz B;
    public static final zzsz C;
    public static final /* synthetic */ zzsz[] D;
    public final zzta y;
    public final int z;

    /* JADX INFO: Fake field, exist only in values array */
    zzsz EF1;

    /* JADX INFO: Fake field, exist only in values array */
    zzsz EF2;

    static {
        zzsz zzszVar = new zzsz("DOUBLE", 0, zzta.B, 1);
        zzsz zzszVar2 = new zzsz("FLOAT", 1, zzta.A, 5);
        zzta zztaVar = zzta.z;
        zzsz zzszVar3 = new zzsz("INT64", 2, zztaVar, 0);
        A = zzszVar3;
        zzsz zzszVar4 = new zzsz("UINT64", 3, zztaVar, 0);
        zzta zztaVar2 = zzta.y;
        zzsz zzszVar5 = new zzsz("INT32", 4, zztaVar2, 0);
        zzsz zzszVar6 = new zzsz("FIXED64", 5, zztaVar, 1);
        zzsz zzszVar7 = new zzsz("FIXED32", 6, zztaVar2, 5);
        zzsz zzszVar8 = new zzsz("BOOL", 7, zzta.C, 0);
        zzsz zzszVar9 = new zzsz("STRING", 8, zzta.D, 2);
        B = zzszVar9;
        zzta zztaVar3 = zzta.G;
        zzsz zzszVar10 = new zzsz("GROUP", 9, zztaVar3, 3);
        C = zzszVar10;
        D = new zzsz[]{zzszVar, zzszVar2, zzszVar3, zzszVar4, zzszVar5, zzszVar6, zzszVar7, zzszVar8, zzszVar9, zzszVar10, new zzsz("MESSAGE", 10, zztaVar3, 2), new zzsz("BYTES", 11, zzta.E, 2), new zzsz("UINT32", 12, zztaVar2, 0), new zzsz("ENUM", 13, zzta.F, 0), new zzsz("SFIXED32", 14, zztaVar2, 5), new zzsz("SFIXED64", 15, zztaVar, 1), new zzsz("SINT32", 16, zztaVar2, 0), new zzsz("SINT64", 17, zztaVar, 0)};
    }

    public zzsz(String str, int i, zzta zztaVar, int i2) {
        super(str, i);
        this.y = zztaVar;
        this.z = i2;
    }

    public static zzsz[] values() {
        return (zzsz[]) D.clone();
    }
}
