package com.tracket.processing;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class DecoderCreationFailureReason {
    public static final DecoderCreationFailureReason A;
    public static final DecoderCreationFailureReason B;
    public static final DecoderCreationFailureReason C;
    public static final DecoderCreationFailureReason D;
    public static final DecoderCreationFailureReason E;
    public static final DecoderCreationFailureReason F;
    public static final /* synthetic */ DecoderCreationFailureReason[] G;
    public static final DecoderCreationFailureReason y;
    public static final DecoderCreationFailureReason z;

    static {
        DecoderCreationFailureReason decoderCreationFailureReason = new DecoderCreationFailureReason("SOURCE_UNAVAILABLE", 0);
        y = decoderCreationFailureReason;
        DecoderCreationFailureReason decoderCreationFailureReason2 = new DecoderCreationFailureReason("EXTRACTOR_CREATE", 1);
        z = decoderCreationFailureReason2;
        DecoderCreationFailureReason decoderCreationFailureReason3 = new DecoderCreationFailureReason("EXTRACTOR_INITIALIZE", 2);
        A = decoderCreationFailureReason3;
        DecoderCreationFailureReason decoderCreationFailureReason4 = new DecoderCreationFailureReason("NO_SUPPORTED_TRACK", 3);
        B = decoderCreationFailureReason4;
        DecoderCreationFailureReason decoderCreationFailureReason5 = new DecoderCreationFailureReason("MISSING_MIME", 4);
        C = decoderCreationFailureReason5;
        DecoderCreationFailureReason decoderCreationFailureReason6 = new DecoderCreationFailureReason("CODEC_DISCOVERY", 5);
        DecoderCreationFailureReason decoderCreationFailureReason7 = new DecoderCreationFailureReason("NO_DECODER_CANDIDATES", 6);
        D = decoderCreationFailureReason7;
        DecoderCreationFailureReason decoderCreationFailureReason8 = new DecoderCreationFailureReason("CODEC_CANDIDATES_EXHAUSTED", 7);
        E = decoderCreationFailureReason8;
        DecoderCreationFailureReason decoderCreationFailureReason9 = new DecoderCreationFailureReason("UNKNOWN", 8);
        F = decoderCreationFailureReason9;
        G = new DecoderCreationFailureReason[]{decoderCreationFailureReason, decoderCreationFailureReason2, decoderCreationFailureReason3, decoderCreationFailureReason4, decoderCreationFailureReason5, decoderCreationFailureReason6, decoderCreationFailureReason7, decoderCreationFailureReason8, decoderCreationFailureReason9};
    }

    public static DecoderCreationFailureReason valueOf(String str) {
        return (DecoderCreationFailureReason) Enum.valueOf(DecoderCreationFailureReason.class, str);
    }

    public static DecoderCreationFailureReason[] values() {
        return (DecoderCreationFailureReason[]) G.clone();
    }
}
