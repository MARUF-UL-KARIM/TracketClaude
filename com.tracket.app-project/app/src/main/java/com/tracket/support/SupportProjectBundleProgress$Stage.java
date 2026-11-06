package com.tracket.support;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class SupportProjectBundleProgress$Stage {
    public static final /* synthetic */ SupportProjectBundleProgress$Stage[] A;
    public static final SupportProjectBundleProgress$Stage y;
    public static final SupportProjectBundleProgress$Stage z;

    static {
        SupportProjectBundleProgress$Stage supportProjectBundleProgress$Stage = new SupportProjectBundleProgress$Stage("PREPARING", 0);
        y = supportProjectBundleProgress$Stage;
        SupportProjectBundleProgress$Stage supportProjectBundleProgress$Stage2 = new SupportProjectBundleProgress$Stage("UPLOADING", 1);
        z = supportProjectBundleProgress$Stage2;
        A = new SupportProjectBundleProgress$Stage[]{supportProjectBundleProgress$Stage, supportProjectBundleProgress$Stage2};
    }

    public static SupportProjectBundleProgress$Stage valueOf(String str) {
        return (SupportProjectBundleProgress$Stage) Enum.valueOf(SupportProjectBundleProgress$Stage.class, str);
    }

    public static SupportProjectBundleProgress$Stage[] values() {
        return (SupportProjectBundleProgress$Stage[]) A.clone();
    }
}
