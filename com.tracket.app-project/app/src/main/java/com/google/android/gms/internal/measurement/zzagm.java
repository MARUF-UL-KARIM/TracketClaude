package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
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
public final class zzagm {
    public static final zzagm A;
    public static final zzagm B;
    public static final zzagm C;
    public static final /* synthetic */ zzagm[] D;
    public final zzagn y;
    public final int z;

    /* JADX INFO: Fake field, exist only in values array */
    zzagm EF1;

    /* JADX INFO: Fake field, exist only in values array */
    zzagm EF2;

    /* JADX INFO: Fake field, exist only in values array */
    zzagm EF0;

    static {
        zzagm zzagmVar = new zzagm("DOUBLE", 0, zzagn.B, 1);
        zzagm zzagmVar2 = new zzagm("FLOAT", 1, zzagn.A, 5);
        zzagn zzagnVar = zzagn.z;
        zzagm zzagmVar3 = new zzagm("INT64", 2, zzagnVar, 0);
        zzagm zzagmVar4 = new zzagm("UINT64", 3, zzagnVar, 0);
        zzagn zzagnVar2 = zzagn.y;
        zzagm zzagmVar5 = new zzagm("INT32", 4, zzagnVar2, 0);
        zzagm zzagmVar6 = new zzagm("FIXED64", 5, zzagnVar, 1);
        zzagm zzagmVar7 = new zzagm("FIXED32", 6, zzagnVar2, 5);
        zzagm zzagmVar8 = new zzagm("BOOL", 7, zzagn.C, 0);
        zzagm zzagmVar9 = new zzagm("STRING", 8, zzagn.D, 2);
        A = zzagmVar9;
        zzagn zzagnVar3 = zzagn.G;
        zzagm zzagmVar10 = new zzagm("GROUP", 9, zzagnVar3, 3);
        B = zzagmVar10;
        zzagm zzagmVar11 = new zzagm("MESSAGE", 10, zzagnVar3, 2);
        C = zzagmVar11;
        D = new zzagm[]{zzagmVar, zzagmVar2, zzagmVar3, zzagmVar4, zzagmVar5, zzagmVar6, zzagmVar7, zzagmVar8, zzagmVar9, zzagmVar10, zzagmVar11, new zzagm("BYTES", 11, zzagn.E, 2), new zzagm("UINT32", 12, zzagnVar2, 0), new zzagm("ENUM", 13, zzagn.F, 0), new zzagm("SFIXED32", 14, zzagnVar2, 5), new zzagm("SFIXED64", 15, zzagnVar, 1), new zzagm("SINT32", 16, zzagnVar2, 0), new zzagm("SINT64", 17, zzagnVar, 0)};
    }

    public zzagm(String str, int i, zzagn zzagnVar, int i2) {
        super(str, i);
        this.y = zzagnVar;
        this.z = i2;
    }

    public static zzagm[] values() {
        return (zzagm[]) D.clone();
    }
}
