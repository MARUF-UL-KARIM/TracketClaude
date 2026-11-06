package com.google.common.io;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class FileWriteMode {
    public static final /* synthetic */ FileWriteMode[] y = {new FileWriteMode("APPEND", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    FileWriteMode EF5;

    public static FileWriteMode valueOf(String str) {
        return (FileWriteMode) Enum.valueOf(FileWriteMode.class, str);
    }

    public static FileWriteMode[] values() {
        return (FileWriteMode[]) y.clone();
    }
}
