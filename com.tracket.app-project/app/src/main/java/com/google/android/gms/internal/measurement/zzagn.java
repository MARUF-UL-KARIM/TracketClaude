package com.google.android.gms.internal.measurement;

import defpackage.nca;
import defpackage.oca;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class zzagn {
    public static final zzagn A;
    public static final zzagn B;
    public static final zzagn C;
    public static final zzagn D;
    public static final zzagn E;
    public static final zzagn F;
    public static final zzagn G;
    public static final /* synthetic */ zzagn[] H;
    public static final zzagn y;
    public static final zzagn z;

    static {
        zzagn zzagnVar = new zzagn("INT", 0);
        y = zzagnVar;
        zzagn zzagnVar2 = new zzagn("LONG", 1);
        z = zzagnVar2;
        zzagn zzagnVar3 = new zzagn("FLOAT", 2);
        A = zzagnVar3;
        zzagn zzagnVar4 = new zzagn("DOUBLE", 3);
        B = zzagnVar4;
        zzagn zzagnVar5 = new zzagn("BOOLEAN", 4);
        C = zzagnVar5;
        zzagn zzagnVar6 = new zzagn("STRING", 5);
        D = zzagnVar6;
        nca ncaVar = oca.z;
        zzagn zzagnVar7 = new zzagn("BYTE_STRING", 6);
        E = zzagnVar7;
        zzagn zzagnVar8 = new zzagn("ENUM", 7);
        F = zzagnVar8;
        zzagn zzagnVar9 = new zzagn("MESSAGE", 8);
        G = zzagnVar9;
        H = new zzagn[]{zzagnVar, zzagnVar2, zzagnVar3, zzagnVar4, zzagnVar5, zzagnVar6, zzagnVar7, zzagnVar8, zzagnVar9};
    }

    public static zzagn[] values() {
        return (zzagn[]) H.clone();
    }
}
