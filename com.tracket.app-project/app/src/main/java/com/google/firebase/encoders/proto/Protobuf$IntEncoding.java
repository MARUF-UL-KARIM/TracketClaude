package com.google.firebase.encoders.proto;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class Protobuf$IntEncoding {
    public static final Protobuf$IntEncoding y;
    public static final /* synthetic */ Protobuf$IntEncoding[] z;

    static {
        Protobuf$IntEncoding protobuf$IntEncoding = new Protobuf$IntEncoding("DEFAULT", 0);
        y = protobuf$IntEncoding;
        z = new Protobuf$IntEncoding[]{protobuf$IntEncoding, new Protobuf$IntEncoding("SIGNED", 1), new Protobuf$IntEncoding("FIXED", 2)};
    }

    public static Protobuf$IntEncoding valueOf(String str) {
        return (Protobuf$IntEncoding) Enum.valueOf(Protobuf$IntEncoding.class, str);
    }

    public static Protobuf$IntEncoding[] values() {
        return (Protobuf$IntEncoding[]) z.clone();
    }
}
