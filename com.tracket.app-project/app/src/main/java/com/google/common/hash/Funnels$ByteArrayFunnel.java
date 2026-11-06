package com.google.common.hash;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
final class Funnels$ByteArrayFunnel implements Serializable {
    public static final /* synthetic */ Funnels$ByteArrayFunnel[] y = {new Funnels$ByteArrayFunnel("INSTANCE", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    Funnels$ByteArrayFunnel EF5;

    public static Funnels$ByteArrayFunnel valueOf(String str) {
        return (Funnels$ByteArrayFunnel) Enum.valueOf(Funnels$ByteArrayFunnel.class, str);
    }

    public static Funnels$ByteArrayFunnel[] values() {
        return (Funnels$ByteArrayFunnel[]) y.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "Funnels.byteArrayFunnel()";
    }
}
