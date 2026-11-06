package com.tracket.utils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ModuleInstallStatus {
    public static final ModuleInstallStatus A;
    public static final ModuleInstallStatus B;
    public static final ModuleInstallStatus C;
    public static final ModuleInstallStatus D;
    public static final /* synthetic */ ModuleInstallStatus[] E;
    public static final ModuleInstallStatus y;
    public static final ModuleInstallStatus z;

    static {
        ModuleInstallStatus moduleInstallStatus = new ModuleInstallStatus("UNKNOWN", 0);
        y = moduleInstallStatus;
        ModuleInstallStatus moduleInstallStatus2 = new ModuleInstallStatus("CHECKING", 1);
        z = moduleInstallStatus2;
        ModuleInstallStatus moduleInstallStatus3 = new ModuleInstallStatus("AVAILABLE", 2);
        A = moduleInstallStatus3;
        ModuleInstallStatus moduleInstallStatus4 = new ModuleInstallStatus("DOWNLOADING", 3);
        B = moduleInstallStatus4;
        ModuleInstallStatus moduleInstallStatus5 = new ModuleInstallStatus("INSTALLED", 4);
        C = moduleInstallStatus5;
        ModuleInstallStatus moduleInstallStatus6 = new ModuleInstallStatus("FAILED", 5);
        D = moduleInstallStatus6;
        E = new ModuleInstallStatus[]{moduleInstallStatus, moduleInstallStatus2, moduleInstallStatus3, moduleInstallStatus4, moduleInstallStatus5, moduleInstallStatus6};
    }

    public static ModuleInstallStatus valueOf(String str) {
        return (ModuleInstallStatus) Enum.valueOf(ModuleInstallStatus.class, str);
    }

    public static ModuleInstallStatus[] values() {
        return (ModuleInstallStatus[]) E.clone();
    }
}
