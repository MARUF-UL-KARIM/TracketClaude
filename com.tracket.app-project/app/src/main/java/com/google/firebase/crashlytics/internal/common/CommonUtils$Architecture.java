package com.google.firebase.crashlytics.internal.common;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
final class CommonUtils$Architecture {
    public static final /* synthetic */ CommonUtils$Architecture[] A;
    public static final CommonUtils$Architecture y;
    public static final HashMap z;

    /* JADX INFO: Fake field, exist only in values array */
    CommonUtils$Architecture EF0;

    static {
        CommonUtils$Architecture commonUtils$Architecture = new CommonUtils$Architecture("X86_32", 0);
        CommonUtils$Architecture commonUtils$Architecture2 = new CommonUtils$Architecture("X86_64", 1);
        CommonUtils$Architecture commonUtils$Architecture3 = new CommonUtils$Architecture("ARM_UNKNOWN", 2);
        CommonUtils$Architecture commonUtils$Architecture4 = new CommonUtils$Architecture("PPC", 3);
        CommonUtils$Architecture commonUtils$Architecture5 = new CommonUtils$Architecture("PPC64", 4);
        CommonUtils$Architecture commonUtils$Architecture6 = new CommonUtils$Architecture("ARMV6", 5);
        CommonUtils$Architecture commonUtils$Architecture7 = new CommonUtils$Architecture("ARMV7", 6);
        CommonUtils$Architecture commonUtils$Architecture8 = new CommonUtils$Architecture("UNKNOWN", 7);
        y = commonUtils$Architecture8;
        CommonUtils$Architecture commonUtils$Architecture9 = new CommonUtils$Architecture("ARMV7S", 8);
        CommonUtils$Architecture commonUtils$Architecture10 = new CommonUtils$Architecture("ARM64", 9);
        A = new CommonUtils$Architecture[]{commonUtils$Architecture, commonUtils$Architecture2, commonUtils$Architecture3, commonUtils$Architecture4, commonUtils$Architecture5, commonUtils$Architecture6, commonUtils$Architecture7, commonUtils$Architecture8, commonUtils$Architecture9, commonUtils$Architecture10};
        HashMap map = new HashMap(4);
        z = map;
        map.put("armeabi-v7a", commonUtils$Architecture7);
        map.put("armeabi", commonUtils$Architecture6);
        map.put("arm64-v8a", commonUtils$Architecture10);
        map.put("x86", commonUtils$Architecture);
    }

    public static CommonUtils$Architecture valueOf(String str) {
        return (CommonUtils$Architecture) Enum.valueOf(CommonUtils$Architecture.class, str);
    }

    public static CommonUtils$Architecture[] values() {
        return (CommonUtils$Architecture[]) A.clone();
    }
}
