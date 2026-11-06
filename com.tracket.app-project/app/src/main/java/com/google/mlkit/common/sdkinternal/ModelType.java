package com.google.mlkit.common.sdkinternal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ModelType {
    public static final /* synthetic */ ModelType[] y = {new ModelType("UNKNOWN", 0), new ModelType("BASE", 1), new ModelType("TRANSLATE", 2), new ModelType("ENTITY_EXTRACTION", 3), new ModelType("CUSTOM", 4), new ModelType("DIGITAL_INK", 5), new ModelType("DIGITAL_INK_SEGMENTATION", 6), new ModelType("TOXICITY_DETECTION", 7), new ModelType("IMAGE_CAPTIONING", 8)};

    /* JADX INFO: Fake field, exist only in values array */
    ModelType EF5;

    public static ModelType[] values() {
        return (ModelType[]) y.clone();
    }
}
