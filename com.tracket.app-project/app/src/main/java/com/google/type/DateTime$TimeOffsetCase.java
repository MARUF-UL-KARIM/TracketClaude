package com.google.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class DateTime$TimeOffsetCase {
    public static final /* synthetic */ DateTime$TimeOffsetCase[] y = {new DateTime$TimeOffsetCase("UTC_OFFSET", 0), new DateTime$TimeOffsetCase("TIME_ZONE", 1), new DateTime$TimeOffsetCase("TIMEOFFSET_NOT_SET", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    DateTime$TimeOffsetCase EF5;

    public static DateTime$TimeOffsetCase valueOf(String str) {
        return (DateTime$TimeOffsetCase) Enum.valueOf(DateTime$TimeOffsetCase.class, str);
    }

    public static DateTime$TimeOffsetCase[] values() {
        return (DateTime$TimeOffsetCase[]) y.clone();
    }
}
