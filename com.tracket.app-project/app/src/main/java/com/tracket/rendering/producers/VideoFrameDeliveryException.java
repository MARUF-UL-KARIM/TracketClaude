package com.tracket.rendering.producers;

import defpackage.al9;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class VideoFrameDeliveryException extends IllegalStateException {
    public final String y;
    public final al9 z;

    public /* synthetic */ VideoFrameDeliveryException(String str, String str2, al9 al9Var, int i) {
        this(str, str2, (i & 4) != 0 ? new al9(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383) : al9Var, (Throwable) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoFrameDeliveryException(String str, String str2, al9 al9Var, Throwable th) {
        super(str2, th);
        str.getClass();
        al9Var.getClass();
        this.y = str;
        this.z = al9Var;
    }
}
