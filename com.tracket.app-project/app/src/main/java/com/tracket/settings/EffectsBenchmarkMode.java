package com.tracket.settings;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class EffectsBenchmarkMode {
    public static final /* synthetic */ EffectsBenchmarkMode[] A;
    public static final EffectsBenchmarkMode y;
    public static final EffectsBenchmarkMode z;

    static {
        EffectsBenchmarkMode effectsBenchmarkMode = new EffectsBenchmarkMode("EFFECTS", 0);
        y = effectsBenchmarkMode;
        EffectsBenchmarkMode effectsBenchmarkMode2 = new EffectsBenchmarkMode("TEXT", 1);
        z = effectsBenchmarkMode2;
        A = new EffectsBenchmarkMode[]{effectsBenchmarkMode, effectsBenchmarkMode2};
    }

    public static EffectsBenchmarkMode valueOf(String str) {
        return (EffectsBenchmarkMode) Enum.valueOf(EffectsBenchmarkMode.class, str);
    }

    public static EffectsBenchmarkMode[] values() {
        return (EffectsBenchmarkMode[]) A.clone();
    }
}
