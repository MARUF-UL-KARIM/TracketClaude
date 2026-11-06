package com.airbnb.lottie;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class RenderMode {
    public static final /* synthetic */ RenderMode[] A;
    public static final RenderMode y;
    public static final RenderMode z;

    static {
        RenderMode renderMode = new RenderMode("AUTOMATIC", 0);
        y = renderMode;
        RenderMode renderMode2 = new RenderMode("HARDWARE", 1);
        z = renderMode2;
        A = new RenderMode[]{renderMode, renderMode2, new RenderMode("SOFTWARE", 2)};
    }

    public static RenderMode valueOf(String str) {
        return (RenderMode) Enum.valueOf(RenderMode.class, str);
    }

    public static RenderMode[] values() {
        return (RenderMode[]) A.clone();
    }
}
