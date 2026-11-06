package com.tracket.projects;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class MediaPickerAccessIssue {
    public static final /* synthetic */ MediaPickerAccessIssue[] y = {new MediaPickerAccessIssue("DENIED", 0), new MediaPickerAccessIssue("RESTRICTED", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    MediaPickerAccessIssue EF5;

    public static MediaPickerAccessIssue valueOf(String str) {
        return (MediaPickerAccessIssue) Enum.valueOf(MediaPickerAccessIssue.class, str);
    }

    public static MediaPickerAccessIssue[] values() {
        return (MediaPickerAccessIssue[]) y.clone();
    }
}
