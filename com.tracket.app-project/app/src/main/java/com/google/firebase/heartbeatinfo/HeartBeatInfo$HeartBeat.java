package com.google.firebase.heartbeatinfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class HeartBeatInfo$HeartBeat {
    public static final /* synthetic */ HeartBeatInfo$HeartBeat[] y = {new HeartBeatInfo$HeartBeat("NONE", 0), new HeartBeatInfo$HeartBeat("SDK", 1), new HeartBeatInfo$HeartBeat("GLOBAL", 2), new HeartBeatInfo$HeartBeat("COMBINED", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    HeartBeatInfo$HeartBeat EF5;

    public static HeartBeatInfo$HeartBeat valueOf(String str) {
        return (HeartBeatInfo$HeartBeat) Enum.valueOf(HeartBeatInfo$HeartBeat.class, str);
    }

    public static HeartBeatInfo$HeartBeat[] values() {
        return (HeartBeatInfo$HeartBeat[]) y.clone();
    }
}
