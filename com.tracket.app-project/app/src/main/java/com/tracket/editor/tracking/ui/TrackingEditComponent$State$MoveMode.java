package com.tracket.editor.tracking.ui;

import defpackage.x03;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class TrackingEditComponent$State$MoveMode {
    public static final TrackingEditComponent$State$MoveMode A;
    public static final /* synthetic */ TrackingEditComponent$State$MoveMode[] B;
    public static final /* synthetic */ x03 C;
    public static final TrackingEditComponent$State$MoveMode y;
    public static final TrackingEditComponent$State$MoveMode z;

    static {
        TrackingEditComponent$State$MoveMode trackingEditComponent$State$MoveMode = new TrackingEditComponent$State$MoveMode("CURRENT", 0);
        y = trackingEditComponent$State$MoveMode;
        TrackingEditComponent$State$MoveMode trackingEditComponent$State$MoveMode2 = new TrackingEditComponent$State$MoveMode("FORWARD", 1);
        z = trackingEditComponent$State$MoveMode2;
        TrackingEditComponent$State$MoveMode trackingEditComponent$State$MoveMode3 = new TrackingEditComponent$State$MoveMode("BOTH", 2);
        A = trackingEditComponent$State$MoveMode3;
        TrackingEditComponent$State$MoveMode[] trackingEditComponent$State$MoveModeArr = {trackingEditComponent$State$MoveMode, trackingEditComponent$State$MoveMode2, trackingEditComponent$State$MoveMode3};
        B = trackingEditComponent$State$MoveModeArr;
        C = new x03(trackingEditComponent$State$MoveModeArr);
    }

    public static TrackingEditComponent$State$MoveMode valueOf(String str) {
        return (TrackingEditComponent$State$MoveMode) Enum.valueOf(TrackingEditComponent$State$MoveMode.class, str);
    }

    public static TrackingEditComponent$State$MoveMode[] values() {
        return (TrackingEditComponent$State$MoveMode[]) B.clone();
    }
}
