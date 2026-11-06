package org.apache.commons.math3.geometry.partitioning;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class Side {
    public static final /* synthetic */ Side[] y = {new Side("PLUS", 0), new Side("MINUS", 1), new Side("BOTH", 2), new Side("HYPER", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    Side EF5;

    public static Side valueOf(String str) {
        return (Side) Enum.valueOf(Side.class, str);
    }

    public static Side[] values() {
        return (Side[]) y.clone();
    }
}
