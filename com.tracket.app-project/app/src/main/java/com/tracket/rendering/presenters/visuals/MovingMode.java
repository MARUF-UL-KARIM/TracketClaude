package com.tracket.rendering.presenters.visuals;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public enum MovingMode {
    DRAGGABLE(true),
    EDITABLE(true),
    FIXED(false);

    public final boolean y;

    MovingMode(boolean z) {
        this.y = z;
    }
}
