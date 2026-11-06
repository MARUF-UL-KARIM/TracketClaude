package com.google.android.gms.internal.ads;

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
public final class zziin {
    public static final zziin A;
    public static final zziin B;
    public static final zziin C;
    public static final /* synthetic */ zziin[] D;
    public final zziio y;
    public final int z;

    /* JADX INFO: Fake field, exist only in values array */
    zziin EF1;

    /* JADX INFO: Fake field, exist only in values array */
    zziin EF2;

    /* JADX INFO: Fake field, exist only in values array */
    zziin EF0;

    static {
        zziin zziinVar = new zziin("DOUBLE", 0, zziio.B, 1);
        zziin zziinVar2 = new zziin("FLOAT", 1, zziio.A, 5);
        zziio zziioVar = zziio.z;
        zziin zziinVar3 = new zziin("INT64", 2, zziioVar, 0);
        zziin zziinVar4 = new zziin("UINT64", 3, zziioVar, 0);
        zziio zziioVar2 = zziio.y;
        zziin zziinVar5 = new zziin("INT32", 4, zziioVar2, 0);
        zziin zziinVar6 = new zziin("FIXED64", 5, zziioVar, 1);
        zziin zziinVar7 = new zziin("FIXED32", 6, zziioVar2, 5);
        zziin zziinVar8 = new zziin("BOOL", 7, zziio.C, 0);
        zziin zziinVar9 = new zziin("STRING", 8, zziio.D, 2);
        A = zziinVar9;
        zziio zziioVar3 = zziio.G;
        zziin zziinVar10 = new zziin("GROUP", 9, zziioVar3, 3);
        B = zziinVar10;
        zziin zziinVar11 = new zziin("MESSAGE", 10, zziioVar3, 2);
        C = zziinVar11;
        D = new zziin[]{zziinVar, zziinVar2, zziinVar3, zziinVar4, zziinVar5, zziinVar6, zziinVar7, zziinVar8, zziinVar9, zziinVar10, zziinVar11, new zziin("BYTES", 11, zziio.E, 2), new zziin("UINT32", 12, zziioVar2, 0), new zziin("ENUM", 13, zziio.F, 0), new zziin("SFIXED32", 14, zziioVar2, 5), new zziin("SFIXED64", 15, zziioVar, 1), new zziin("SINT32", 16, zziioVar2, 0), new zziin("SINT64", 17, zziioVar, 0)};
    }

    public zziin(String str, int i, zziio zziioVar, int i2) {
        super(str, i);
        this.y = zziioVar;
        this.z = i2;
    }

    public static zziin[] values() {
        return (zziin[]) D.clone();
    }
}
