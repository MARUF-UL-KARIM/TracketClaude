package com.google.firebase.perf.util;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public enum Constants$TraceNames {
    /* JADX INFO: Fake field, exist only in values array */
    APP_START_TRACE_NAME("_as"),
    /* JADX INFO: Fake field, exist only in values array */
    ON_CREATE_TRACE_NAME("_astui"),
    /* JADX INFO: Fake field, exist only in values array */
    ON_START_TRACE_NAME("_astfd"),
    /* JADX INFO: Fake field, exist only in values array */
    ON_RESUME_TRACE_NAME("_asti"),
    /* JADX INFO: Fake field, exist only in values array */
    FOREGROUND_TRACE_NAME("_fs"),
    /* JADX INFO: Fake field, exist only in values array */
    BACKGROUND_TRACE_NAME("_bs");

    public final String y;

    Constants$TraceNames(String str) {
        this.y = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.y;
    }
}
