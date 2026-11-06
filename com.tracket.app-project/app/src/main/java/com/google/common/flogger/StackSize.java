package com.google.common.flogger;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public enum StackSize {
    /* JADX INFO: Fake field, exist only in values array */
    SMALL(10),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIUM(20),
    /* JADX INFO: Fake field, exist only in values array */
    LARGE(50),
    /* JADX INFO: Fake field, exist only in values array */
    FULL(-1),
    /* JADX INFO: Fake field, exist only in values array */
    NONE(0);

    public final int y;

    StackSize(int i) {
        this.y = i;
    }
}
