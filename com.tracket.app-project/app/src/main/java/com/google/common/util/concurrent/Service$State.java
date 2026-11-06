package com.google.common.util.concurrent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class Service$State {
    public static final /* synthetic */ Service$State[] y = {new Service$State("NEW", 0), new Service$State("STARTING", 1), new Service$State("RUNNING", 2), new Service$State("STOPPING", 3), new Service$State("TERMINATED", 4), new Service$State("FAILED", 5)};

    /* JADX INFO: Fake field, exist only in values array */
    Service$State EF5;

    public static Service$State valueOf(String str) {
        return (Service$State) Enum.valueOf(Service$State.class, str);
    }

    public static Service$State[] values() {
        return (Service$State[]) y.clone();
    }
}
