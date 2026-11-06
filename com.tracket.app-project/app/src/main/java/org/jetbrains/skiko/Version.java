package org.jetbrains.skiko;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class Version {
    public static final Version INSTANCE = new Version();
    private static final String skiko = "0.144.6";
    private static final String skia = "m144-22f58c9fd4";

    private Version() {
    }

    public final String getSkia() {
        return skia;
    }

    public final String getSkiko() {
        return skiko;
    }
}
