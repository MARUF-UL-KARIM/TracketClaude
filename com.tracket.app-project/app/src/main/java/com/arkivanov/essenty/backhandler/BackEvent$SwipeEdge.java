package com.arkivanov.essenty.backhandler;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class BackEvent$SwipeEdge {
    public static final BackEvent$SwipeEdge A;
    public static final /* synthetic */ BackEvent$SwipeEdge[] B;
    public static final BackEvent$SwipeEdge y;
    public static final BackEvent$SwipeEdge z;

    static {
        BackEvent$SwipeEdge backEvent$SwipeEdge = new BackEvent$SwipeEdge("UNKNOWN", 0);
        y = backEvent$SwipeEdge;
        BackEvent$SwipeEdge backEvent$SwipeEdge2 = new BackEvent$SwipeEdge("LEFT", 1);
        z = backEvent$SwipeEdge2;
        BackEvent$SwipeEdge backEvent$SwipeEdge3 = new BackEvent$SwipeEdge("RIGHT", 2);
        A = backEvent$SwipeEdge3;
        B = new BackEvent$SwipeEdge[]{backEvent$SwipeEdge, backEvent$SwipeEdge2, backEvent$SwipeEdge3};
    }

    public static BackEvent$SwipeEdge valueOf(String str) {
        return (BackEvent$SwipeEdge) Enum.valueOf(BackEvent$SwipeEdge.class, str);
    }

    public static BackEvent$SwipeEdge[] values() {
        return (BackEvent$SwipeEdge[]) B.clone();
    }
}
