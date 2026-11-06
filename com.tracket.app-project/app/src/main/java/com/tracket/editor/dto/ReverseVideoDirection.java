package com.tracket.editor.dto;

import defpackage.x03;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ReverseVideoDirection {
    public static final /* synthetic */ ReverseVideoDirection[] A;
    public static final /* synthetic */ x03 B;
    public static final ReverseVideoDirection y;
    public static final ReverseVideoDirection z;

    static {
        ReverseVideoDirection reverseVideoDirection = new ReverseVideoDirection("ORIGINAL", 0);
        y = reverseVideoDirection;
        ReverseVideoDirection reverseVideoDirection2 = new ReverseVideoDirection("REVERSED", 1);
        z = reverseVideoDirection2;
        ReverseVideoDirection[] reverseVideoDirectionArr = {reverseVideoDirection, reverseVideoDirection2};
        A = reverseVideoDirectionArr;
        B = new x03(reverseVideoDirectionArr);
    }

    public static ReverseVideoDirection valueOf(String str) {
        return (ReverseVideoDirection) Enum.valueOf(ReverseVideoDirection.class, str);
    }

    public static ReverseVideoDirection[] values() {
        return (ReverseVideoDirection[]) A.clone();
    }
}
