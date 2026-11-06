package com.google.android.gms.internal.mlkit_vision_common;

import defpackage.kga;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public enum zzio implements kga {
    /* JADX INFO: Fake field, exist only in values array */
    SOURCE_UNKNOWN(0),
    BITMAP(1),
    /* JADX INFO: Fake field, exist only in values array */
    BYTEARRAY(2),
    /* JADX INFO: Fake field, exist only in values array */
    BYTEBUFFER(3),
    /* JADX INFO: Fake field, exist only in values array */
    FILEPATH(4),
    /* JADX INFO: Fake field, exist only in values array */
    ANDROID_MEDIA_IMAGE(5);

    public final int y;

    zzio(int i) {
        this.y = i;
    }

    @Override // defpackage.kga
    public final int zza() {
        return this.y;
    }
}
