package com.google.firebase.installations.remote;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class InstallationResponse$ResponseCode {
    public static final /* synthetic */ InstallationResponse$ResponseCode[] A;
    public static final InstallationResponse$ResponseCode y;
    public static final InstallationResponse$ResponseCode z;

    static {
        InstallationResponse$ResponseCode installationResponse$ResponseCode = new InstallationResponse$ResponseCode("OK", 0);
        y = installationResponse$ResponseCode;
        InstallationResponse$ResponseCode installationResponse$ResponseCode2 = new InstallationResponse$ResponseCode("BAD_CONFIG", 1);
        z = installationResponse$ResponseCode2;
        A = new InstallationResponse$ResponseCode[]{installationResponse$ResponseCode, installationResponse$ResponseCode2};
    }

    public static InstallationResponse$ResponseCode valueOf(String str) {
        return (InstallationResponse$ResponseCode) Enum.valueOf(InstallationResponse$ResponseCode.class, str);
    }

    public static InstallationResponse$ResponseCode[] values() {
        return (InstallationResponse$ResponseCode[]) A.clone();
    }
}
