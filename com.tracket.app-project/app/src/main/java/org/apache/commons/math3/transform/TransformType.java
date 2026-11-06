package org.apache.commons.math3.transform;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class TransformType {
    public static final /* synthetic */ TransformType[] y = {new TransformType("FORWARD", 0), new TransformType("INVERSE", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    TransformType EF5;

    public static TransformType valueOf(String str) {
        return (TransformType) Enum.valueOf(TransformType.class, str);
    }

    public static TransformType[] values() {
        return (TransformType[]) y.clone();
    }
}
