package org.apache.commons.math3.geometry.euclidean.threed;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class RotationConvention {
    public static final /* synthetic */ RotationConvention[] y = {new RotationConvention("VECTOR_OPERATOR", 0), new RotationConvention("FRAME_TRANSFORM", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    RotationConvention EF5;

    public static RotationConvention valueOf(String str) {
        return (RotationConvention) Enum.valueOf(RotationConvention.class, str);
    }

    public static RotationConvention[] values() {
        return (RotationConvention[]) y.clone();
    }
}
