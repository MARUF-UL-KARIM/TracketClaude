package org.apache.commons.math3.transform;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class DftNormalization {
    public static final /* synthetic */ DftNormalization[] y = {new DftNormalization("STANDARD", 0), new DftNormalization("UNITARY", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    DftNormalization EF5;

    public static DftNormalization valueOf(String str) {
        return (DftNormalization) Enum.valueOf(DftNormalization.class, str);
    }

    public static DftNormalization[] values() {
        return (DftNormalization[]) y.clone();
    }
}
