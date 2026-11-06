package io.ktor.network.tls.extensions;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class PointFormat {
    public static final /* synthetic */ PointFormat[] y = {new PointFormat("UNCOMPRESSED", 0), new PointFormat("ANSIX962_COMPRESSED_PRIME", 1), new PointFormat("ANSIX962_COMPRESSED_CHAR2", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    PointFormat EF5;

    public static PointFormat valueOf(String str) {
        return (PointFormat) Enum.valueOf(PointFormat.class, str);
    }

    public static PointFormat[] values() {
        return (PointFormat[]) y.clone();
    }
}
