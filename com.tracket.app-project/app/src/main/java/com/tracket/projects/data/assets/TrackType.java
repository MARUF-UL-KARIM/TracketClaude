package com.tracket.projects.data.assets;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
final class TrackType {
    public static final /* synthetic */ TrackType[] A;
    public static final TrackType y;
    public static final TrackType z;

    static {
        TrackType trackType = new TrackType("VIDEO", 0);
        y = trackType;
        TrackType trackType2 = new TrackType("AUDIO", 1);
        z = trackType2;
        A = new TrackType[]{trackType, trackType2};
    }

    public static TrackType valueOf(String str) {
        return (TrackType) Enum.valueOf(TrackType.class, str);
    }

    public static TrackType[] values() {
        return (TrackType[]) A.clone();
    }
}
