package com.tracket.base;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public enum Analytics$Contract$FailureReason {
    /* JADX INFO: Fake field, exist only in values array */
    NETWORK_ERROR("network_error"),
    /* JADX INFO: Fake field, exist only in values array */
    BILLING_UNAVAILABLE("billing_unavailable"),
    /* JADX INFO: Fake field, exist only in values array */
    FEATURE_NOT_SUPPORTED("feature_not_supported"),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_ALREADY_OWNED("item_already_owned"),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_NOT_OWNED("item_not_owned"),
    LOW_STORAGE("low_storage"),
    NOT_ENOUGH_MEMORY("not_enough_memory"),
    /* JADX INFO: Fake field, exist only in values array */
    STORE_ERROR("store_error"),
    UNKNOWN("unknown");

    public final String y;

    Analytics$Contract$FailureReason(String str) {
        this.y = str;
    }
}
