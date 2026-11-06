package com.google.android.datatransport.runtime.backends;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class BackendResponse$Status {
    public static final BackendResponse$Status A;
    public static final BackendResponse$Status B;
    public static final /* synthetic */ BackendResponse$Status[] C;
    public static final BackendResponse$Status y;
    public static final BackendResponse$Status z;

    static {
        BackendResponse$Status backendResponse$Status = new BackendResponse$Status("OK", 0);
        y = backendResponse$Status;
        BackendResponse$Status backendResponse$Status2 = new BackendResponse$Status("TRANSIENT_ERROR", 1);
        z = backendResponse$Status2;
        BackendResponse$Status backendResponse$Status3 = new BackendResponse$Status("FATAL_ERROR", 2);
        A = backendResponse$Status3;
        BackendResponse$Status backendResponse$Status4 = new BackendResponse$Status("INVALID_PAYLOAD", 3);
        B = backendResponse$Status4;
        C = new BackendResponse$Status[]{backendResponse$Status, backendResponse$Status2, backendResponse$Status3, backendResponse$Status4};
    }

    public static BackendResponse$Status valueOf(String str) {
        return (BackendResponse$Status) Enum.valueOf(BackendResponse$Status.class, str);
    }

    public static BackendResponse$Status[] values() {
        return (BackendResponse$Status[]) C.clone();
    }
}
