package com.google.common.base;

import defpackage.tq3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
final class Functions$ToStringFunction implements tq3 {
    public static final /* synthetic */ Functions$ToStringFunction[] y = {new Functions$ToStringFunction("INSTANCE", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    Functions$ToStringFunction EF5;

    public static Functions$ToStringFunction valueOf(String str) {
        return (Functions$ToStringFunction) Enum.valueOf(Functions$ToStringFunction.class, str);
    }

    public static Functions$ToStringFunction[] values() {
        return (Functions$ToStringFunction[]) y.clone();
    }

    @Override // defpackage.tq3
    public final Object apply(Object obj) {
        obj.getClass();
        return obj.toString();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "Functions.toStringFunction()";
    }
}
