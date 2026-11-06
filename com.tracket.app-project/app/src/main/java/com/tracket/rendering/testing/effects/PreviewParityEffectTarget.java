package com.tracket.rendering.testing.effects;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class PreviewParityEffectTarget {
    public static final /* synthetic */ PreviewParityEffectTarget[] y = {new PreviewParityEffectTarget("FOREGROUND", 0), new PreviewParityEffectTarget("OVERLAY", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    PreviewParityEffectTarget EF5;

    public static PreviewParityEffectTarget valueOf(String str) {
        return (PreviewParityEffectTarget) Enum.valueOf(PreviewParityEffectTarget.class, str);
    }

    public static PreviewParityEffectTarget[] values() {
        return (PreviewParityEffectTarget[]) y.clone();
    }
}
