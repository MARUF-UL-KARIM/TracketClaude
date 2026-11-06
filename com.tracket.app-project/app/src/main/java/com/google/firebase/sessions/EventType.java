package com.google.firebase.sessions;

import defpackage.ol5;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public enum EventType implements ol5 {
    /* JADX INFO: Fake field, exist only in values array */
    EVENT_TYPE_UNKNOWN(0),
    SESSION_START(1);

    public final int y;

    EventType(int i) {
        this.y = i;
    }

    @Override // defpackage.ol5
    public final int getNumber() {
        return this.y;
    }
}
