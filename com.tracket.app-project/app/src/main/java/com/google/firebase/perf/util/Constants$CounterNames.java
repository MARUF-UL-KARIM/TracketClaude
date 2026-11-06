package com.google.firebase.perf.util;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public enum Constants$CounterNames {
    /* JADX INFO: Fake field, exist only in values array */
    TRACE_EVENT_RATE_LIMITED("_fstec"),
    /* JADX INFO: Fake field, exist only in values array */
    NETWORK_TRACE_EVENT_RATE_LIMITED("_fsntc"),
    /* JADX INFO: Fake field, exist only in values array */
    TRACE_STARTED_NOT_STOPPED("_tsns"),
    /* JADX INFO: Fake field, exist only in values array */
    FRAMES_TOTAL("_fr_tot"),
    /* JADX INFO: Fake field, exist only in values array */
    FRAMES_SLOW("_fr_slo"),
    /* JADX INFO: Fake field, exist only in values array */
    FRAMES_FROZEN("_fr_fzn");

    public final String y;

    Constants$CounterNames(String str) {
        this.y = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.y;
    }
}
