package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public enum DeliveryMechanism {
    DEVELOPER(1),
    /* JADX INFO: Fake field, exist only in values array */
    USER_SIDELOAD(2),
    /* JADX INFO: Fake field, exist only in values array */
    TEST_DISTRIBUTION(3),
    APP_STORE(4);

    public final int y;

    DeliveryMechanism(int i) {
        this.y = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.y);
    }
}
