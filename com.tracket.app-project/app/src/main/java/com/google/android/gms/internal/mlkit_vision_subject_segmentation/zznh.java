package com.google.android.gms.internal.mlkit_vision_subject_segmentation;

import defpackage.eib;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public enum zznh implements eib {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_FORMAT(0),
    /* JADX INFO: Fake field, exist only in values array */
    NV16(1),
    /* JADX INFO: Fake field, exist only in values array */
    NV21(2),
    /* JADX INFO: Fake field, exist only in values array */
    YV12(3),
    /* JADX INFO: Fake field, exist only in values array */
    YUV_420_888(7),
    /* JADX INFO: Fake field, exist only in values array */
    JPEG(8),
    BITMAP(4),
    /* JADX INFO: Fake field, exist only in values array */
    CM_SAMPLE_BUFFER_REF(5),
    /* JADX INFO: Fake field, exist only in values array */
    UI_IMAGE(6),
    /* JADX INFO: Fake field, exist only in values array */
    CV_PIXEL_BUFFER_REF(9);

    public final int y;

    zznh(int i) {
        this.y = i;
    }

    @Override // defpackage.eib
    public final int zza() {
        return this.y;
    }
}
