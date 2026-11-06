package com.google.firebase.crashlytics.internal.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class CrashlyticsReport$Type {
    public static final /* synthetic */ CrashlyticsReport$Type[] y = {new CrashlyticsReport$Type("INCOMPLETE", 0), new CrashlyticsReport$Type("JAVA", 1), new CrashlyticsReport$Type("NATIVE", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    CrashlyticsReport$Type EF5;

    public static CrashlyticsReport$Type valueOf(String str) {
        return (CrashlyticsReport$Type) Enum.valueOf(CrashlyticsReport$Type.class, str);
    }

    public static CrashlyticsReport$Type[] values() {
        return (CrashlyticsReport$Type[]) y.clone();
    }
}
