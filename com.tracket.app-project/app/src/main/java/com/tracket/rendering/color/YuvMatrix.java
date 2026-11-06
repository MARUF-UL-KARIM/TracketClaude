package com.tracket.rendering.color;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class YuvMatrix {
    public static final /* synthetic */ YuvMatrix[] y = {new YuvMatrix("BT709", 0), new YuvMatrix("BT2020_NCL", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    YuvMatrix EF5;

    public static YuvMatrix valueOf(String str) {
        return (YuvMatrix) Enum.valueOf(YuvMatrix.class, str);
    }

    public static YuvMatrix[] values() {
        return (YuvMatrix[]) y.clone();
    }
}
