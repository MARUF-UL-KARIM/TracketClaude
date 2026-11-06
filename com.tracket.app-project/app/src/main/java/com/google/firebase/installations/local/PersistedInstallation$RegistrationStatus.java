package com.google.firebase.installations.local;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class PersistedInstallation$RegistrationStatus {
    public static final PersistedInstallation$RegistrationStatus A;
    public static final PersistedInstallation$RegistrationStatus B;
    public static final PersistedInstallation$RegistrationStatus C;
    public static final /* synthetic */ PersistedInstallation$RegistrationStatus[] D;
    public static final PersistedInstallation$RegistrationStatus y;
    public static final PersistedInstallation$RegistrationStatus z;

    static {
        PersistedInstallation$RegistrationStatus persistedInstallation$RegistrationStatus = new PersistedInstallation$RegistrationStatus("ATTEMPT_MIGRATION", 0);
        y = persistedInstallation$RegistrationStatus;
        PersistedInstallation$RegistrationStatus persistedInstallation$RegistrationStatus2 = new PersistedInstallation$RegistrationStatus("NOT_GENERATED", 1);
        z = persistedInstallation$RegistrationStatus2;
        PersistedInstallation$RegistrationStatus persistedInstallation$RegistrationStatus3 = new PersistedInstallation$RegistrationStatus("UNREGISTERED", 2);
        A = persistedInstallation$RegistrationStatus3;
        PersistedInstallation$RegistrationStatus persistedInstallation$RegistrationStatus4 = new PersistedInstallation$RegistrationStatus("REGISTERED", 3);
        B = persistedInstallation$RegistrationStatus4;
        PersistedInstallation$RegistrationStatus persistedInstallation$RegistrationStatus5 = new PersistedInstallation$RegistrationStatus("REGISTER_ERROR", 4);
        C = persistedInstallation$RegistrationStatus5;
        D = new PersistedInstallation$RegistrationStatus[]{persistedInstallation$RegistrationStatus, persistedInstallation$RegistrationStatus2, persistedInstallation$RegistrationStatus3, persistedInstallation$RegistrationStatus4, persistedInstallation$RegistrationStatus5};
    }

    public static PersistedInstallation$RegistrationStatus valueOf(String str) {
        return (PersistedInstallation$RegistrationStatus) Enum.valueOf(PersistedInstallation$RegistrationStatus.class, str);
    }

    public static PersistedInstallation$RegistrationStatus[] values() {
        return (PersistedInstallation$RegistrationStatus[]) D.clone();
    }
}
