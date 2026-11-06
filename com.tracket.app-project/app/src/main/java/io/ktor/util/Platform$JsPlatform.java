package io.ktor.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class Platform$JsPlatform {
    public static final /* synthetic */ Platform$JsPlatform[] y = {new Platform$JsPlatform("Browser", 0), new Platform$JsPlatform("Node", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    Platform$JsPlatform EF5;

    public static Platform$JsPlatform valueOf(String str) {
        return (Platform$JsPlatform) Enum.valueOf(Platform$JsPlatform.class, str);
    }

    public static Platform$JsPlatform[] values() {
        return (Platform$JsPlatform[]) y.clone();
    }
}
