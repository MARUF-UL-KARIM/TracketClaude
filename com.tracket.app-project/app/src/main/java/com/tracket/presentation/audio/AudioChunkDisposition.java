package com.tracket.presentation.audio;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class AudioChunkDisposition {
    public static final /* synthetic */ AudioChunkDisposition[] A;
    public static final AudioChunkDisposition y;
    public static final AudioChunkDisposition z;

    static {
        AudioChunkDisposition audioChunkDisposition = new AudioChunkDisposition("Consume", 0);
        y = audioChunkDisposition;
        AudioChunkDisposition audioChunkDisposition2 = new AudioChunkDisposition("Retain", 1);
        z = audioChunkDisposition2;
        A = new AudioChunkDisposition[]{audioChunkDisposition, audioChunkDisposition2};
    }

    public static AudioChunkDisposition valueOf(String str) {
        return (AudioChunkDisposition) Enum.valueOf(AudioChunkDisposition.class, str);
    }

    public static AudioChunkDisposition[] values() {
        return (AudioChunkDisposition[]) A.clone();
    }
}
