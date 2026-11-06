package com.google.android.gms.internal.play_billing;

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
/* JADX INFO: loaded from: classes3.dex */
public final class zzfz {
    public static final zzfz A;
    public static final zzfz[] B;
    public static final /* synthetic */ zzfz[] C;
    public static final zzfz z;
    public final int y;

    /* JADX INFO: Fake field, exist only in values array */
    zzfz EF0;

    static {
        zzgt zzgtVar = zzgt.D;
        zzfz zzfzVar = new zzfz("DOUBLE", 0, 0, 1, zzgtVar);
        zzgt zzgtVar2 = zzgt.C;
        zzfz zzfzVar2 = new zzfz("FLOAT", 1, 1, 1, zzgtVar2);
        zzgt zzgtVar3 = zzgt.B;
        zzfz zzfzVar3 = new zzfz("INT64", 2, 2, 1, zzgtVar3);
        zzfz zzfzVar4 = new zzfz("UINT64", 3, 3, 1, zzgtVar3);
        zzgt zzgtVar4 = zzgt.A;
        zzfz zzfzVar5 = new zzfz("INT32", 4, 4, 1, zzgtVar4);
        zzfz zzfzVar6 = new zzfz("FIXED64", 5, 5, 1, zzgtVar3);
        zzfz zzfzVar7 = new zzfz("FIXED32", 6, 6, 1, zzgtVar4);
        zzgt zzgtVar5 = zzgt.E;
        zzfz zzfzVar8 = new zzfz("BOOL", 7, 7, 1, zzgtVar5);
        zzgt zzgtVar6 = zzgt.F;
        zzfz zzfzVar9 = new zzfz("STRING", 8, 8, 1, zzgtVar6);
        zzgt zzgtVar7 = zzgt.I;
        zzfz zzfzVar10 = new zzfz("MESSAGE", 9, 9, 1, zzgtVar7);
        zzgt zzgtVar8 = zzgt.G;
        zzfz zzfzVar11 = new zzfz("BYTES", 10, 10, 1, zzgtVar8);
        zzfz zzfzVar12 = new zzfz("UINT32", 11, 11, 1, zzgtVar4);
        zzgt zzgtVar9 = zzgt.H;
        zzfz zzfzVar13 = new zzfz("ENUM", 12, 12, 1, zzgtVar9);
        zzfz zzfzVar14 = new zzfz("SFIXED32", 13, 13, 1, zzgtVar4);
        zzfz zzfzVar15 = new zzfz("SFIXED64", 14, 14, 1, zzgtVar3);
        zzfz zzfzVar16 = new zzfz("SINT32", 15, 15, 1, zzgtVar4);
        zzfz zzfzVar17 = new zzfz("SINT64", 16, 16, 1, zzgtVar3);
        zzfz zzfzVar18 = new zzfz("GROUP", 17, 17, 1, zzgtVar7);
        zzfz zzfzVar19 = new zzfz("DOUBLE_LIST", 18, 18, 2, zzgtVar);
        zzfz zzfzVar20 = new zzfz("FLOAT_LIST", 19, 19, 2, zzgtVar2);
        zzfz zzfzVar21 = new zzfz("INT64_LIST", 20, 20, 2, zzgtVar3);
        zzfz zzfzVar22 = new zzfz("UINT64_LIST", 21, 21, 2, zzgtVar3);
        zzfz zzfzVar23 = new zzfz("INT32_LIST", 22, 22, 2, zzgtVar4);
        zzfz zzfzVar24 = new zzfz("FIXED64_LIST", 23, 23, 2, zzgtVar3);
        zzfz zzfzVar25 = new zzfz("FIXED32_LIST", 24, 24, 2, zzgtVar4);
        zzfz zzfzVar26 = new zzfz("BOOL_LIST", 25, 25, 2, zzgtVar5);
        zzfz zzfzVar27 = new zzfz("STRING_LIST", 26, 26, 2, zzgtVar6);
        zzfz zzfzVar28 = new zzfz("MESSAGE_LIST", 27, 27, 2, zzgtVar7);
        zzfz zzfzVar29 = new zzfz("BYTES_LIST", 28, 28, 2, zzgtVar8);
        zzfz zzfzVar30 = new zzfz("UINT32_LIST", 29, 29, 2, zzgtVar4);
        zzfz zzfzVar31 = new zzfz("ENUM_LIST", 30, 30, 2, zzgtVar9);
        zzfz zzfzVar32 = new zzfz("SFIXED32_LIST", 31, 31, 2, zzgtVar4);
        zzfz zzfzVar33 = new zzfz("SFIXED64_LIST", 32, 32, 2, zzgtVar3);
        zzfz zzfzVar34 = new zzfz("SINT32_LIST", 33, 33, 2, zzgtVar4);
        zzfz zzfzVar35 = new zzfz("SINT64_LIST", 34, 34, 2, zzgtVar3);
        zzfz zzfzVar36 = new zzfz("DOUBLE_LIST_PACKED", 35, 35, 3, zzgtVar);
        z = zzfzVar36;
        zzfz zzfzVar37 = new zzfz("FLOAT_LIST_PACKED", 36, 36, 3, zzgtVar2);
        zzfz zzfzVar38 = new zzfz("INT64_LIST_PACKED", 37, 37, 3, zzgtVar3);
        zzfz zzfzVar39 = new zzfz("UINT64_LIST_PACKED", 38, 38, 3, zzgtVar3);
        zzfz zzfzVar40 = new zzfz("INT32_LIST_PACKED", 39, 39, 3, zzgtVar4);
        zzfz zzfzVar41 = new zzfz("FIXED64_LIST_PACKED", 40, 40, 3, zzgtVar3);
        zzfz zzfzVar42 = new zzfz("FIXED32_LIST_PACKED", 41, 41, 3, zzgtVar4);
        zzfz zzfzVar43 = new zzfz("BOOL_LIST_PACKED", 42, 42, 3, zzgtVar5);
        zzfz zzfzVar44 = new zzfz("UINT32_LIST_PACKED", 43, 43, 3, zzgtVar4);
        zzfz zzfzVar45 = new zzfz("ENUM_LIST_PACKED", 44, 44, 3, zzgtVar9);
        zzfz zzfzVar46 = new zzfz("SFIXED32_LIST_PACKED", 45, 45, 3, zzgtVar4);
        zzfz zzfzVar47 = new zzfz("SFIXED64_LIST_PACKED", 46, 46, 3, zzgtVar3);
        zzfz zzfzVar48 = new zzfz("SINT32_LIST_PACKED", 47, 47, 3, zzgtVar4);
        zzfz zzfzVar49 = new zzfz("SINT64_LIST_PACKED", 48, 48, 3, zzgtVar3);
        A = zzfzVar49;
        C = new zzfz[]{zzfzVar, zzfzVar2, zzfzVar3, zzfzVar4, zzfzVar5, zzfzVar6, zzfzVar7, zzfzVar8, zzfzVar9, zzfzVar10, zzfzVar11, zzfzVar12, zzfzVar13, zzfzVar14, zzfzVar15, zzfzVar16, zzfzVar17, zzfzVar18, zzfzVar19, zzfzVar20, zzfzVar21, zzfzVar22, zzfzVar23, zzfzVar24, zzfzVar25, zzfzVar26, zzfzVar27, zzfzVar28, zzfzVar29, zzfzVar30, zzfzVar31, zzfzVar32, zzfzVar33, zzfzVar34, zzfzVar35, zzfzVar36, zzfzVar37, zzfzVar38, zzfzVar39, zzfzVar40, zzfzVar41, zzfzVar42, zzfzVar43, zzfzVar44, zzfzVar45, zzfzVar46, zzfzVar47, zzfzVar48, zzfzVar49, new zzfz("GROUP_LIST", 49, 49, 2, zzgtVar7), new zzfz("MAP", 50, 50, 4, zzgt.z)};
        zzfz[] zzfzVarArrValues = values();
        B = new zzfz[zzfzVarArrValues.length];
        for (zzfz zzfzVar50 : zzfzVarArrValues) {
            B[zzfzVar50.y] = zzfzVar50;
        }
    }

    public zzfz(String str, int i, int i2, int i3, zzgt zzgtVar) {
        super(str, i);
        this.y = i2;
        int i4 = i3 - 1;
        if (i4 == 1 || i4 == 3) {
            Class cls = zzgtVar.y;
        }
        if (i3 == 1) {
            zzgt zzgtVar2 = zzgt.z;
            zzgtVar.ordinal();
        }
    }

    public static zzfz[] values() {
        return (zzfz[]) C.clone();
    }
}
