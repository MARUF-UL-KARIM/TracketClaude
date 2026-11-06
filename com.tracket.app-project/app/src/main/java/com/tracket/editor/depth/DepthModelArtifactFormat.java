package com.tracket.editor.depth;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class DepthModelArtifactFormat {
    public static final DepthModelArtifactFormat y;
    public static final /* synthetic */ DepthModelArtifactFormat[] z;

    static {
        DepthModelArtifactFormat depthModelArtifactFormat = new DepthModelArtifactFormat("TFLITE", 0);
        y = depthModelArtifactFormat;
        z = new DepthModelArtifactFormat[]{depthModelArtifactFormat, new DepthModelArtifactFormat("CORE_ML_PACKAGE_ZIP", 1)};
    }

    public static DepthModelArtifactFormat valueOf(String str) {
        return (DepthModelArtifactFormat) Enum.valueOf(DepthModelArtifactFormat.class, str);
    }

    public static DepthModelArtifactFormat[] values() {
        return (DepthModelArtifactFormat[]) z.clone();
    }
}
