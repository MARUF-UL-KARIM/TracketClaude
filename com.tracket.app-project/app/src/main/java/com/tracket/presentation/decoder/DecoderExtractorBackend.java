package com.tracket.presentation.decoder;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class DecoderExtractorBackend {
    public static final /* synthetic */ DecoderExtractorBackend[] A;
    public static final DecoderExtractorBackend y;
    public static final DecoderExtractorBackend z;

    static {
        DecoderExtractorBackend decoderExtractorBackend = new DecoderExtractorBackend("ANDROID", 0);
        y = decoderExtractorBackend;
        DecoderExtractorBackend decoderExtractorBackend2 = new DecoderExtractorBackend("MEDIA3", 1);
        z = decoderExtractorBackend2;
        A = new DecoderExtractorBackend[]{decoderExtractorBackend, decoderExtractorBackend2};
    }

    public static DecoderExtractorBackend valueOf(String str) {
        return (DecoderExtractorBackend) Enum.valueOf(DecoderExtractorBackend.class, str);
    }

    public static DecoderExtractorBackend[] values() {
        return (DecoderExtractorBackend[]) A.clone();
    }
}
