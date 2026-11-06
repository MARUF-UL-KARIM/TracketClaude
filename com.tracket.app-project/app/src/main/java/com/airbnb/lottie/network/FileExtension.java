package com.airbnb.lottie.network;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public enum FileExtension {
    /* JADX INFO: Fake field, exist only in values array */
    JSON(".json"),
    /* JADX INFO: Fake field, exist only in values array */
    ZIP(".zip"),
    /* JADX INFO: Fake field, exist only in values array */
    GZIP(".gz");

    public final String y;

    FileExtension(String str) {
        this.y = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.y;
    }
}
