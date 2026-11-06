package com.tracket.rendering.producers.text;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public enum TextResourceFrameProducer$Mode {
    PREVIEW(true, false),
    EXPORT(false, true);

    public final boolean y;
    public final boolean z;

    TextResourceFrameProducer$Mode(boolean z, boolean z2) {
        this.y = z;
        this.z = z2;
    }
}
