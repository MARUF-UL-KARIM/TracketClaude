package com.airbnb.lottie.utils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class OffscreenLayer$RenderStrategy {
    public static final OffscreenLayer$RenderStrategy A;
    public static final OffscreenLayer$RenderStrategy B;
    public static final /* synthetic */ OffscreenLayer$RenderStrategy[] C;
    public static final OffscreenLayer$RenderStrategy y;
    public static final OffscreenLayer$RenderStrategy z;

    static {
        OffscreenLayer$RenderStrategy offscreenLayer$RenderStrategy = new OffscreenLayer$RenderStrategy("DIRECT", 0);
        y = offscreenLayer$RenderStrategy;
        OffscreenLayer$RenderStrategy offscreenLayer$RenderStrategy2 = new OffscreenLayer$RenderStrategy("SAVE_LAYER", 1);
        z = offscreenLayer$RenderStrategy2;
        OffscreenLayer$RenderStrategy offscreenLayer$RenderStrategy3 = new OffscreenLayer$RenderStrategy("BITMAP", 2);
        A = offscreenLayer$RenderStrategy3;
        OffscreenLayer$RenderStrategy offscreenLayer$RenderStrategy4 = new OffscreenLayer$RenderStrategy("RENDER_NODE", 3);
        B = offscreenLayer$RenderStrategy4;
        C = new OffscreenLayer$RenderStrategy[]{offscreenLayer$RenderStrategy, offscreenLayer$RenderStrategy2, offscreenLayer$RenderStrategy3, offscreenLayer$RenderStrategy4};
    }

    public static OffscreenLayer$RenderStrategy valueOf(String str) {
        return (OffscreenLayer$RenderStrategy) Enum.valueOf(OffscreenLayer$RenderStrategy.class, str);
    }

    public static OffscreenLayer$RenderStrategy[] values() {
        return (OffscreenLayer$RenderStrategy[]) C.clone();
    }
}
