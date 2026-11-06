package com.tracket.rendering;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class SurfaceLeaseKind {
    public static final /* synthetic */ SurfaceLeaseKind[] A;
    public static final SurfaceLeaseKind y;
    public static final SurfaceLeaseKind z;

    static {
        SurfaceLeaseKind surfaceLeaseKind = new SurfaceLeaseKind("Decoder", 0);
        y = surfaceLeaseKind;
        SurfaceLeaseKind surfaceLeaseKind2 = new SurfaceLeaseKind("Canvas", 1);
        z = surfaceLeaseKind2;
        A = new SurfaceLeaseKind[]{surfaceLeaseKind, surfaceLeaseKind2};
    }

    public static SurfaceLeaseKind valueOf(String str) {
        return (SurfaceLeaseKind) Enum.valueOf(SurfaceLeaseKind.class, str);
    }

    public static SurfaceLeaseKind[] values() {
        return (SurfaceLeaseKind[]) A.clone();
    }
}
