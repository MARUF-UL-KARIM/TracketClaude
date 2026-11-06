package com.google.firebase.ml.modeldownloader;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class DownloadType {
    public static final /* synthetic */ DownloadType[] y = {new DownloadType("LOCAL_MODEL", 0), new DownloadType("LOCAL_MODEL_UPDATE_IN_BACKGROUND", 1), new DownloadType("LATEST_MODEL", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    DownloadType EF5;

    public static DownloadType valueOf(String str) {
        return (DownloadType) Enum.valueOf(DownloadType.class, str);
    }

    public static DownloadType[] values() {
        return (DownloadType[]) y.clone();
    }
}
