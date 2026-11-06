package com.google.common.util.concurrent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
final class AggregateFuture$ReleaseResourcesReason {
    public static final /* synthetic */ AggregateFuture$ReleaseResourcesReason[] y = {new AggregateFuture$ReleaseResourcesReason("OUTPUT_FUTURE_DONE", 0), new AggregateFuture$ReleaseResourcesReason("ALL_INPUT_FUTURES_PROCESSED", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    AggregateFuture$ReleaseResourcesReason EF5;

    public static AggregateFuture$ReleaseResourcesReason valueOf(String str) {
        return (AggregateFuture$ReleaseResourcesReason) Enum.valueOf(AggregateFuture$ReleaseResourcesReason.class, str);
    }

    public static AggregateFuture$ReleaseResourcesReason[] values() {
        return (AggregateFuture$ReleaseResourcesReason[]) y.clone();
    }
}
