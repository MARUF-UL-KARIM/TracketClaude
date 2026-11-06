package com.tracket.presentation.decoder;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class Decoder$ProcessBufferStatus {
    public static final Decoder$ProcessBufferStatus A;
    public static final Decoder$ProcessBufferStatus B;
    public static final /* synthetic */ Decoder$ProcessBufferStatus[] C;
    public static final Decoder$ProcessBufferStatus y;
    public static final Decoder$ProcessBufferStatus z;

    static {
        Decoder$ProcessBufferStatus decoder$ProcessBufferStatus = new Decoder$ProcessBufferStatus("SUCCESS", 0);
        y = decoder$ProcessBufferStatus;
        Decoder$ProcessBufferStatus decoder$ProcessBufferStatus2 = new Decoder$ProcessBufferStatus("NO_INPUT_BUFFER", 1);
        z = decoder$ProcessBufferStatus2;
        Decoder$ProcessBufferStatus decoder$ProcessBufferStatus3 = new Decoder$ProcessBufferStatus("END_OF_STREAM", 2);
        A = decoder$ProcessBufferStatus3;
        Decoder$ProcessBufferStatus decoder$ProcessBufferStatus4 = new Decoder$ProcessBufferStatus("STOPPED", 3);
        B = decoder$ProcessBufferStatus4;
        C = new Decoder$ProcessBufferStatus[]{decoder$ProcessBufferStatus, decoder$ProcessBufferStatus2, decoder$ProcessBufferStatus3, decoder$ProcessBufferStatus4};
    }

    public static Decoder$ProcessBufferStatus valueOf(String str) {
        return (Decoder$ProcessBufferStatus) Enum.valueOf(Decoder$ProcessBufferStatus.class, str);
    }

    public static Decoder$ProcessBufferStatus[] values() {
        return (Decoder$ProcessBufferStatus[]) C.clone();
    }
}
