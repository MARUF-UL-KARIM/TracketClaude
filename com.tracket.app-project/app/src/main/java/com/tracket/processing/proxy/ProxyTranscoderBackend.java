package com.tracket.processing.proxy;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ProxyTranscoderBackend {
    public static final ProxyTranscoderBackend y;
    public static final /* synthetic */ ProxyTranscoderBackend[] z;

    static {
        ProxyTranscoderBackend proxyTranscoderBackend = new ProxyTranscoderBackend("ANDROID_SINGLE_VIDEO", 0);
        y = proxyTranscoderBackend;
        z = new ProxyTranscoderBackend[]{proxyTranscoderBackend, new ProxyTranscoderBackend("IOS_ASSET_READER_WRITER", 1), new ProxyTranscoderBackend("IOS_METAL_PIXEL_BUFFER", 2), new ProxyTranscoderBackend("IOS_METAL_NV12_PIXEL_BUFFER", 3)};
    }

    public static ProxyTranscoderBackend valueOf(String str) {
        return (ProxyTranscoderBackend) Enum.valueOf(ProxyTranscoderBackend.class, str);
    }

    public static ProxyTranscoderBackend[] values() {
        return (ProxyTranscoderBackend[]) z.clone();
    }
}
