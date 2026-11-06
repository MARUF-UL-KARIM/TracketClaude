package com.tracket.editor.dto;

import defpackage.x03;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class DepthRecordingKind {
    public static final /* synthetic */ DepthRecordingKind[] A;
    public static final /* synthetic */ x03 B;
    public static final DepthRecordingKind y;
    public static final DepthRecordingKind z;

    static {
        DepthRecordingKind depthRecordingKind = new DepthRecordingKind("VIDEO", 0);
        y = depthRecordingKind;
        DepthRecordingKind depthRecordingKind2 = new DepthRecordingKind("IMAGE", 1);
        z = depthRecordingKind2;
        DepthRecordingKind[] depthRecordingKindArr = {depthRecordingKind, depthRecordingKind2};
        A = depthRecordingKindArr;
        B = new x03(depthRecordingKindArr);
    }

    public static DepthRecordingKind valueOf(String str) {
        return (DepthRecordingKind) Enum.valueOf(DepthRecordingKind.class, str);
    }

    public static DepthRecordingKind[] values() {
        return (DepthRecordingKind[]) A.clone();
    }
}
