package com.google.common.flogger.backend;

import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class FormatType {
    public static final FormatType A;
    public static final FormatType B;
    public static final FormatType C;
    public static final FormatType D;
    public static final /* synthetic */ FormatType[] E;
    public static final FormatType z;
    public final boolean y;

    /* JADX INFO: renamed from: com.google.common.flogger.backend.FormatType$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
    public final enum AnonymousClass1 extends FormatType {
        @Override // com.google.common.flogger.backend.FormatType
        public final boolean a(Object obj) {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.common.flogger.backend.FormatType$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
    public final enum AnonymousClass2 extends FormatType {
        @Override // com.google.common.flogger.backend.FormatType
        public final boolean a(Object obj) {
            return obj instanceof Boolean;
        }
    }

    /* JADX INFO: renamed from: com.google.common.flogger.backend.FormatType$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
    public final enum AnonymousClass3 extends FormatType {
        @Override // com.google.common.flogger.backend.FormatType
        public final boolean a(Object obj) {
            if (obj instanceof Character) {
                return true;
            }
            if ((obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short)) {
                return Character.isValidCodePoint(((Number) obj).intValue());
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.google.common.flogger.backend.FormatType$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
    public final enum AnonymousClass4 extends FormatType {
        @Override // com.google.common.flogger.backend.FormatType
        public final boolean a(Object obj) {
            return (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof BigInteger);
        }
    }

    /* JADX INFO: renamed from: com.google.common.flogger.backend.FormatType$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
    public final enum AnonymousClass5 extends FormatType {
        @Override // com.google.common.flogger.backend.FormatType
        public final boolean a(Object obj) {
            return (obj instanceof Double) || (obj instanceof Float) || (obj instanceof BigDecimal);
        }
    }

    static {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1("GENERAL", 0, true);
        z = anonymousClass1;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2("BOOLEAN", 1, false);
        A = anonymousClass2;
        AnonymousClass3 anonymousClass3 = new AnonymousClass3("CHARACTER", 2, false);
        B = anonymousClass3;
        AnonymousClass4 anonymousClass4 = new AnonymousClass4("INTEGRAL", 3, false);
        C = anonymousClass4;
        AnonymousClass5 anonymousClass5 = new AnonymousClass5("FLOAT", 4, true);
        D = anonymousClass5;
        E = new FormatType[]{anonymousClass1, anonymousClass2, anonymousClass3, anonymousClass4, anonymousClass5};
    }

    public FormatType(String str, int i, boolean z2) {
        super(str, i);
        this.y = z2;
    }

    public static FormatType valueOf(String str) {
        return (FormatType) Enum.valueOf(FormatType.class, str);
    }

    public static FormatType[] values() {
        return (FormatType[]) E.clone();
    }

    public abstract boolean a(Object obj);
}
