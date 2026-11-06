package org.apache.commons.math3.transform;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class DstNormalization {
    public static final /* synthetic */ DstNormalization[] y = {new DstNormalization("STANDARD_DST_I", 0), new DstNormalization("ORTHOGONAL_DST_I", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    DstNormalization EF5;

    public static DstNormalization valueOf(String str) {
        return (DstNormalization) Enum.valueOf(DstNormalization.class, str);
    }

    public static DstNormalization[] values() {
        return (DstNormalization[]) y.clone();
    }
}
