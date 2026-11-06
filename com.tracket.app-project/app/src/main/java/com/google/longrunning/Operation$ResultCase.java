package com.google.longrunning;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class Operation$ResultCase {
    public static final /* synthetic */ Operation$ResultCase[] y = {new Operation$ResultCase("ERROR", 0), new Operation$ResultCase("RESPONSE", 1), new Operation$ResultCase("RESULT_NOT_SET", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    Operation$ResultCase EF5;

    public static Operation$ResultCase valueOf(String str) {
        return (Operation$ResultCase) Enum.valueOf(Operation$ResultCase.class, str);
    }

    public static Operation$ResultCase[] values() {
        return (Operation$ResultCase[]) y.clone();
    }
}
