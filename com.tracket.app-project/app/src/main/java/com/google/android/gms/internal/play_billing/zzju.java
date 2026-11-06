package com.google.android.gms.internal.play_billing;

import defpackage.w2d;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public enum zzju implements w2d {
    BROADCAST_ACTION_UNSPECIFIED(0),
    PURCHASES_UPDATED_ACTION(1),
    LOCAL_PURCHASES_UPDATED_ACTION(2),
    ALTERNATIVE_BILLING_ACTION(3),
    IN_APP_BILLING_RESULT_UPDATE_ACTION(4),
    PLAY_BILLING_ACTIVITY_CREATED_ACTION(5);

    public final int y;

    zzju(int i) {
        this.y = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.y);
    }
}
