package com.airbnb.lottie;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class AsyncUpdates {
    public static final /* synthetic */ AsyncUpdates[] A;
    public static final AsyncUpdates y;
    public static final AsyncUpdates z;

    static {
        AsyncUpdates asyncUpdates = new AsyncUpdates("AUTOMATIC", 0);
        y = asyncUpdates;
        AsyncUpdates asyncUpdates2 = new AsyncUpdates("ENABLED", 1);
        z = asyncUpdates2;
        A = new AsyncUpdates[]{asyncUpdates, asyncUpdates2, new AsyncUpdates("DISABLED", 2)};
    }

    public static AsyncUpdates valueOf(String str) {
        return (AsyncUpdates) Enum.valueOf(AsyncUpdates.class, str);
    }

    public static AsyncUpdates[] values() {
        return (AsyncUpdates[]) A.clone();
    }
}
