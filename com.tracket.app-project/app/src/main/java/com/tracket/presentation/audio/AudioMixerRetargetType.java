package com.tracket.presentation.audio;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class AudioMixerRetargetType {
    public static final /* synthetic */ AudioMixerRetargetType[] A;
    public static final AudioMixerRetargetType y;
    public static final AudioMixerRetargetType z;

    static {
        AudioMixerRetargetType audioMixerRetargetType = new AudioMixerRetargetType("CacheHit", 0);
        y = audioMixerRetargetType;
        AudioMixerRetargetType audioMixerRetargetType2 = new AudioMixerRetargetType("HardReset", 1);
        z = audioMixerRetargetType2;
        A = new AudioMixerRetargetType[]{audioMixerRetargetType, audioMixerRetargetType2};
    }

    public static AudioMixerRetargetType valueOf(String str) {
        return (AudioMixerRetargetType) Enum.valueOf(AudioMixerRetargetType.class, str);
    }

    public static AudioMixerRetargetType[] values() {
        return (AudioMixerRetargetType[]) A.clone();
    }
}
