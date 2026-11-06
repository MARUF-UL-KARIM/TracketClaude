package com.google.firebase.crashlytics.internal.settings;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
final class SettingsCacheBehavior {
    public static final SettingsCacheBehavior A;
    public static final /* synthetic */ SettingsCacheBehavior[] B;
    public static final SettingsCacheBehavior y;
    public static final SettingsCacheBehavior z;

    static {
        SettingsCacheBehavior settingsCacheBehavior = new SettingsCacheBehavior("USE_CACHE", 0);
        y = settingsCacheBehavior;
        SettingsCacheBehavior settingsCacheBehavior2 = new SettingsCacheBehavior("SKIP_CACHE_LOOKUP", 1);
        z = settingsCacheBehavior2;
        SettingsCacheBehavior settingsCacheBehavior3 = new SettingsCacheBehavior("IGNORE_CACHE_EXPIRATION", 2);
        A = settingsCacheBehavior3;
        B = new SettingsCacheBehavior[]{settingsCacheBehavior, settingsCacheBehavior2, settingsCacheBehavior3};
    }

    public static SettingsCacheBehavior valueOf(String str) {
        return (SettingsCacheBehavior) Enum.valueOf(SettingsCacheBehavior.class, str);
    }

    public static SettingsCacheBehavior[] values() {
        return (SettingsCacheBehavior[]) B.clone();
    }
}
