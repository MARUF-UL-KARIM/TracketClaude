package com.tracket.rendering.testing.effects;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class PreviewParityLayerPlacement {
    public static final /* synthetic */ PreviewParityLayerPlacement[] y = {new PreviewParityLayerPlacement("CENTER_CROP", 0), new PreviewParityLayerPlacement("CENTER_FIT", 1), new PreviewParityLayerPlacement("SOLID_FILL", 2), new PreviewParityLayerPlacement("PULSE_CIRCLE_MASK", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    PreviewParityLayerPlacement EF5;

    public static PreviewParityLayerPlacement valueOf(String str) {
        return (PreviewParityLayerPlacement) Enum.valueOf(PreviewParityLayerPlacement.class, str);
    }

    public static PreviewParityLayerPlacement[] values() {
        return (PreviewParityLayerPlacement[]) y.clone();
    }
}
