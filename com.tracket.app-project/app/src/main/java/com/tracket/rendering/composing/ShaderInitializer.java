package com.tracket.rendering.composing;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ShaderInitializer {
    public static final /* synthetic */ ShaderInitializer[] A;
    public static final ShaderInitializer y;
    public static final ShaderInitializer z;

    static {
        ShaderInitializer shaderInitializer = new ShaderInitializer("CORDS", 0);
        y = shaderInitializer;
        ShaderInitializer shaderInitializer2 = new ShaderInitializer("DEFAULT", 1);
        z = shaderInitializer2;
        A = new ShaderInitializer[]{shaderInitializer, shaderInitializer2};
    }

    public static ShaderInitializer valueOf(String str) {
        return (ShaderInitializer) Enum.valueOf(ShaderInitializer.class, str);
    }

    public static ShaderInitializer[] values() {
        return (ShaderInitializer[]) A.clone();
    }
}
