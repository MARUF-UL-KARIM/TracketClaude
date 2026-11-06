package com.tracket.editor.dto;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class MediaSourceKind {
    public static final MediaSourceKind A;
    public static final /* synthetic */ MediaSourceKind[] B;
    public static final MediaSourceKind y;
    public static final MediaSourceKind z;

    static {
        MediaSourceKind mediaSourceKind = new MediaSourceKind("LOCAL", 0);
        y = mediaSourceKind;
        MediaSourceKind mediaSourceKind2 = new MediaSourceKind("EXTERNAL", 1);
        z = mediaSourceKind2;
        MediaSourceKind mediaSourceKind3 = new MediaSourceKind("ASSET", 2);
        A = mediaSourceKind3;
        B = new MediaSourceKind[]{mediaSourceKind, mediaSourceKind2, mediaSourceKind3};
    }

    public static MediaSourceKind valueOf(String str) {
        return (MediaSourceKind) Enum.valueOf(MediaSourceKind.class, str);
    }

    public static MediaSourceKind[] values() {
        return (MediaSourceKind[]) B.clone();
    }
}
