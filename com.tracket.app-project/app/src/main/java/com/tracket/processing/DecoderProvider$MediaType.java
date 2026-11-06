package com.tracket.processing;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class DecoderProvider$MediaType {
    public static final /* synthetic */ DecoderProvider$MediaType[] A;
    public static final DecoderProvider$MediaType y;
    public static final DecoderProvider$MediaType z;

    static {
        DecoderProvider$MediaType decoderProvider$MediaType = new DecoderProvider$MediaType("VIDEO", 0);
        y = decoderProvider$MediaType;
        DecoderProvider$MediaType decoderProvider$MediaType2 = new DecoderProvider$MediaType("AUDIO", 1);
        z = decoderProvider$MediaType2;
        A = new DecoderProvider$MediaType[]{decoderProvider$MediaType, decoderProvider$MediaType2};
    }

    public static DecoderProvider$MediaType valueOf(String str) {
        return (DecoderProvider$MediaType) Enum.valueOf(DecoderProvider$MediaType.class, str);
    }

    public static DecoderProvider$MediaType[] values() {
        return (DecoderProvider$MediaType[]) A.clone();
    }
}
