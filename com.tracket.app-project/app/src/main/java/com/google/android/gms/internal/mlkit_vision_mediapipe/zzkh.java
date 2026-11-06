package com.google.android.gms.internal.mlkit_vision_mediapipe;

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
public final class zzkh {
    public static final zzkh A;
    public static final zzkh[] B;
    public static final /* synthetic */ zzkh[] C;
    public static final zzkh z;
    public final int y;

    /* JADX INFO: Fake field, exist only in values array */
    zzkh EF0;

    static {
        zzlc zzlcVar = zzlc.D;
        zzkh zzkhVar = new zzkh("DOUBLE", 0, 0, 1, zzlcVar);
        zzlc zzlcVar2 = zzlc.C;
        zzkh zzkhVar2 = new zzkh("FLOAT", 1, 1, 1, zzlcVar2);
        zzlc zzlcVar3 = zzlc.B;
        zzkh zzkhVar3 = new zzkh("INT64", 2, 2, 1, zzlcVar3);
        zzkh zzkhVar4 = new zzkh("UINT64", 3, 3, 1, zzlcVar3);
        zzlc zzlcVar4 = zzlc.A;
        zzkh zzkhVar5 = new zzkh("INT32", 4, 4, 1, zzlcVar4);
        zzkh zzkhVar6 = new zzkh("FIXED64", 5, 5, 1, zzlcVar3);
        zzkh zzkhVar7 = new zzkh("FIXED32", 6, 6, 1, zzlcVar4);
        zzlc zzlcVar5 = zzlc.E;
        zzkh zzkhVar8 = new zzkh("BOOL", 7, 7, 1, zzlcVar5);
        zzlc zzlcVar6 = zzlc.F;
        zzkh zzkhVar9 = new zzkh("STRING", 8, 8, 1, zzlcVar6);
        zzlc zzlcVar7 = zzlc.I;
        zzkh zzkhVar10 = new zzkh("MESSAGE", 9, 9, 1, zzlcVar7);
        zzlc zzlcVar8 = zzlc.G;
        zzkh zzkhVar11 = new zzkh("BYTES", 10, 10, 1, zzlcVar8);
        zzkh zzkhVar12 = new zzkh("UINT32", 11, 11, 1, zzlcVar4);
        zzlc zzlcVar9 = zzlc.H;
        zzkh zzkhVar13 = new zzkh("ENUM", 12, 12, 1, zzlcVar9);
        zzkh zzkhVar14 = new zzkh("SFIXED32", 13, 13, 1, zzlcVar4);
        zzkh zzkhVar15 = new zzkh("SFIXED64", 14, 14, 1, zzlcVar3);
        zzkh zzkhVar16 = new zzkh("SINT32", 15, 15, 1, zzlcVar4);
        zzkh zzkhVar17 = new zzkh("SINT64", 16, 16, 1, zzlcVar3);
        zzkh zzkhVar18 = new zzkh("GROUP", 17, 17, 1, zzlcVar7);
        zzkh zzkhVar19 = new zzkh("DOUBLE_LIST", 18, 18, 2, zzlcVar);
        zzkh zzkhVar20 = new zzkh("FLOAT_LIST", 19, 19, 2, zzlcVar2);
        zzkh zzkhVar21 = new zzkh("INT64_LIST", 20, 20, 2, zzlcVar3);
        zzkh zzkhVar22 = new zzkh("UINT64_LIST", 21, 21, 2, zzlcVar3);
        zzkh zzkhVar23 = new zzkh("INT32_LIST", 22, 22, 2, zzlcVar4);
        zzkh zzkhVar24 = new zzkh("FIXED64_LIST", 23, 23, 2, zzlcVar3);
        zzkh zzkhVar25 = new zzkh("FIXED32_LIST", 24, 24, 2, zzlcVar4);
        zzkh zzkhVar26 = new zzkh("BOOL_LIST", 25, 25, 2, zzlcVar5);
        zzkh zzkhVar27 = new zzkh("STRING_LIST", 26, 26, 2, zzlcVar6);
        zzkh zzkhVar28 = new zzkh("MESSAGE_LIST", 27, 27, 2, zzlcVar7);
        zzkh zzkhVar29 = new zzkh("BYTES_LIST", 28, 28, 2, zzlcVar8);
        zzkh zzkhVar30 = new zzkh("UINT32_LIST", 29, 29, 2, zzlcVar4);
        zzkh zzkhVar31 = new zzkh("ENUM_LIST", 30, 30, 2, zzlcVar9);
        zzkh zzkhVar32 = new zzkh("SFIXED32_LIST", 31, 31, 2, zzlcVar4);
        zzkh zzkhVar33 = new zzkh("SFIXED64_LIST", 32, 32, 2, zzlcVar3);
        zzkh zzkhVar34 = new zzkh("SINT32_LIST", 33, 33, 2, zzlcVar4);
        zzkh zzkhVar35 = new zzkh("SINT64_LIST", 34, 34, 2, zzlcVar3);
        zzkh zzkhVar36 = new zzkh("DOUBLE_LIST_PACKED", 35, 35, 3, zzlcVar);
        z = zzkhVar36;
        zzkh zzkhVar37 = new zzkh("FLOAT_LIST_PACKED", 36, 36, 3, zzlcVar2);
        zzkh zzkhVar38 = new zzkh("INT64_LIST_PACKED", 37, 37, 3, zzlcVar3);
        zzkh zzkhVar39 = new zzkh("UINT64_LIST_PACKED", 38, 38, 3, zzlcVar3);
        zzkh zzkhVar40 = new zzkh("INT32_LIST_PACKED", 39, 39, 3, zzlcVar4);
        zzkh zzkhVar41 = new zzkh("FIXED64_LIST_PACKED", 40, 40, 3, zzlcVar3);
        zzkh zzkhVar42 = new zzkh("FIXED32_LIST_PACKED", 41, 41, 3, zzlcVar4);
        zzkh zzkhVar43 = new zzkh("BOOL_LIST_PACKED", 42, 42, 3, zzlcVar5);
        zzkh zzkhVar44 = new zzkh("UINT32_LIST_PACKED", 43, 43, 3, zzlcVar4);
        zzkh zzkhVar45 = new zzkh("ENUM_LIST_PACKED", 44, 44, 3, zzlcVar9);
        zzkh zzkhVar46 = new zzkh("SFIXED32_LIST_PACKED", 45, 45, 3, zzlcVar4);
        zzkh zzkhVar47 = new zzkh("SFIXED64_LIST_PACKED", 46, 46, 3, zzlcVar3);
        zzkh zzkhVar48 = new zzkh("SINT32_LIST_PACKED", 47, 47, 3, zzlcVar4);
        zzkh zzkhVar49 = new zzkh("SINT64_LIST_PACKED", 48, 48, 3, zzlcVar3);
        A = zzkhVar49;
        C = new zzkh[]{zzkhVar, zzkhVar2, zzkhVar3, zzkhVar4, zzkhVar5, zzkhVar6, zzkhVar7, zzkhVar8, zzkhVar9, zzkhVar10, zzkhVar11, zzkhVar12, zzkhVar13, zzkhVar14, zzkhVar15, zzkhVar16, zzkhVar17, zzkhVar18, zzkhVar19, zzkhVar20, zzkhVar21, zzkhVar22, zzkhVar23, zzkhVar24, zzkhVar25, zzkhVar26, zzkhVar27, zzkhVar28, zzkhVar29, zzkhVar30, zzkhVar31, zzkhVar32, zzkhVar33, zzkhVar34, zzkhVar35, zzkhVar36, zzkhVar37, zzkhVar38, zzkhVar39, zzkhVar40, zzkhVar41, zzkhVar42, zzkhVar43, zzkhVar44, zzkhVar45, zzkhVar46, zzkhVar47, zzkhVar48, zzkhVar49, new zzkh("GROUP_LIST", 49, 49, 2, zzlcVar7), new zzkh("MAP", 50, 50, 4, zzlc.z)};
        zzkh[] zzkhVarArrValues = values();
        B = new zzkh[zzkhVarArrValues.length];
        for (zzkh zzkhVar50 : zzkhVarArrValues) {
            B[zzkhVar50.y] = zzkhVar50;
        }
    }

    public zzkh(String str, int i, int i2, int i3, zzlc zzlcVar) {
        super(str, i);
        this.y = i2;
        int i4 = i3 - 1;
        if (i4 == 1 || i4 == 3) {
            Class cls = zzlcVar.y;
        }
        if (i3 == 1) {
            zzlc zzlcVar2 = zzlc.z;
            zzlcVar.ordinal();
        }
    }

    public static zzkh[] values() {
        return (zzkh[]) C.clone();
    }
}
