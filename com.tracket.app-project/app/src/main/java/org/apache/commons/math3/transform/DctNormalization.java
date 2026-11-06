package org.apache.commons.math3.transform;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class DctNormalization {
    public static final /* synthetic */ DctNormalization[] y = {new DctNormalization("STANDARD_DCT_I", 0), new DctNormalization("ORTHOGONAL_DCT_I", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    DctNormalization EF5;

    public static DctNormalization valueOf(String str) {
        return (DctNormalization) Enum.valueOf(DctNormalization.class, str);
    }

    public static DctNormalization[] values() {
        return (DctNormalization[]) y.clone();
    }
}
