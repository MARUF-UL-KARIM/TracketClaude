package io.ktor.utils.io.core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ByteOrder {
    public static final /* synthetic */ ByteOrder[] y;

    /* JADX INFO: Fake field, exist only in values array */
    ByteOrder EF0;

    static {
        java.nio.ByteOrder.BIG_ENDIAN.getClass();
        ByteOrder byteOrder = new ByteOrder("BIG_ENDIAN", 0);
        java.nio.ByteOrder.LITTLE_ENDIAN.getClass();
        y = new ByteOrder[]{byteOrder, new ByteOrder("LITTLE_ENDIAN", 1)};
        java.nio.ByteOrder.nativeOrder().getClass();
    }

    public static ByteOrder valueOf(String str) {
        return (ByteOrder) Enum.valueOf(ByteOrder.class, str);
    }

    public static ByteOrder[] values() {
        return (ByteOrder[]) y.clone();
    }
}
