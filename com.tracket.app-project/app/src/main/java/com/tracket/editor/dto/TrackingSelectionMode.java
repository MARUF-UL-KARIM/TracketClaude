package com.tracket.editor.dto;

import defpackage.x03;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class TrackingSelectionMode {
    public static final TrackingSelectionMode A;
    public static final TrackingSelectionMode B;
    public static final TrackingSelectionMode C;
    public static final /* synthetic */ TrackingSelectionMode[] D;
    public static final /* synthetic */ x03 E;
    public static final TrackingSelectionMode y;
    public static final TrackingSelectionMode z;

    static {
        TrackingSelectionMode trackingSelectionMode = new TrackingSelectionMode("REGION", 0);
        y = trackingSelectionMode;
        TrackingSelectionMode trackingSelectionMode2 = new TrackingSelectionMode("FULL_FRAME", 1);
        z = trackingSelectionMode2;
        TrackingSelectionMode trackingSelectionMode3 = new TrackingSelectionMode("ENTITY", 2);
        A = trackingSelectionMode3;
        TrackingSelectionMode trackingSelectionMode4 = new TrackingSelectionMode("POINTS", 3);
        B = trackingSelectionMode4;
        TrackingSelectionMode trackingSelectionMode5 = new TrackingSelectionMode("AREA", 4);
        C = trackingSelectionMode5;
        TrackingSelectionMode[] trackingSelectionModeArr = {trackingSelectionMode, trackingSelectionMode2, trackingSelectionMode3, trackingSelectionMode4, trackingSelectionMode5};
        D = trackingSelectionModeArr;
        E = new x03(trackingSelectionModeArr);
    }

    public static TrackingSelectionMode valueOf(String str) {
        return (TrackingSelectionMode) Enum.valueOf(TrackingSelectionMode.class, str);
    }

    public static TrackingSelectionMode[] values() {
        return (TrackingSelectionMode[]) D.clone();
    }
}
