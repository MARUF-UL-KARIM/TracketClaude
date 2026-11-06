package kotlinx.serialization.protobuf.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
final class ProtobufTaggedEncoder$NullableMode {
    public static final ProtobufTaggedEncoder$NullableMode A;
    public static final ProtobufTaggedEncoder$NullableMode B;
    public static final ProtobufTaggedEncoder$NullableMode C;
    public static final /* synthetic */ ProtobufTaggedEncoder$NullableMode[] D;
    public static final ProtobufTaggedEncoder$NullableMode y;
    public static final ProtobufTaggedEncoder$NullableMode z;

    static {
        ProtobufTaggedEncoder$NullableMode protobufTaggedEncoder$NullableMode = new ProtobufTaggedEncoder$NullableMode("ACCEPTABLE", 0);
        y = protobufTaggedEncoder$NullableMode;
        ProtobufTaggedEncoder$NullableMode protobufTaggedEncoder$NullableMode2 = new ProtobufTaggedEncoder$NullableMode("OPTIONAL", 1);
        z = protobufTaggedEncoder$NullableMode2;
        ProtobufTaggedEncoder$NullableMode protobufTaggedEncoder$NullableMode3 = new ProtobufTaggedEncoder$NullableMode("COLLECTION", 2);
        A = protobufTaggedEncoder$NullableMode3;
        ProtobufTaggedEncoder$NullableMode protobufTaggedEncoder$NullableMode4 = new ProtobufTaggedEncoder$NullableMode("LIST_ELEMENT", 3);
        B = protobufTaggedEncoder$NullableMode4;
        ProtobufTaggedEncoder$NullableMode protobufTaggedEncoder$NullableMode5 = new ProtobufTaggedEncoder$NullableMode("NOT_NULL", 4);
        C = protobufTaggedEncoder$NullableMode5;
        D = new ProtobufTaggedEncoder$NullableMode[]{protobufTaggedEncoder$NullableMode, protobufTaggedEncoder$NullableMode2, protobufTaggedEncoder$NullableMode3, protobufTaggedEncoder$NullableMode4, protobufTaggedEncoder$NullableMode5};
    }

    public static ProtobufTaggedEncoder$NullableMode valueOf(String str) {
        return (ProtobufTaggedEncoder$NullableMode) Enum.valueOf(ProtobufTaggedEncoder$NullableMode.class, str);
    }

    public static ProtobufTaggedEncoder$NullableMode[] values() {
        return (ProtobufTaggedEncoder$NullableMode[]) D.clone();
    }
}
