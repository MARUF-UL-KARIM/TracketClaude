package com.google.firebase.sessions;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class SharedSessionRepositoryImpl$NotificationType {
    public static final /* synthetic */ SharedSessionRepositoryImpl$NotificationType[] A;
    public static final SharedSessionRepositoryImpl$NotificationType y;
    public static final SharedSessionRepositoryImpl$NotificationType z;

    static {
        SharedSessionRepositoryImpl$NotificationType sharedSessionRepositoryImpl$NotificationType = new SharedSessionRepositoryImpl$NotificationType("GENERAL", 0);
        y = sharedSessionRepositoryImpl$NotificationType;
        SharedSessionRepositoryImpl$NotificationType sharedSessionRepositoryImpl$NotificationType2 = new SharedSessionRepositoryImpl$NotificationType("FALLBACK", 1);
        z = sharedSessionRepositoryImpl$NotificationType2;
        A = new SharedSessionRepositoryImpl$NotificationType[]{sharedSessionRepositoryImpl$NotificationType, sharedSessionRepositoryImpl$NotificationType2};
    }

    public static SharedSessionRepositoryImpl$NotificationType valueOf(String str) {
        return (SharedSessionRepositoryImpl$NotificationType) Enum.valueOf(SharedSessionRepositoryImpl$NotificationType.class, str);
    }

    public static SharedSessionRepositoryImpl$NotificationType[] values() {
        return (SharedSessionRepositoryImpl$NotificationType[]) A.clone();
    }
}
