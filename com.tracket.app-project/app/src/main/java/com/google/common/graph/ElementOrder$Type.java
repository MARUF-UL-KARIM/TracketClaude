package com.google.common.graph;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ElementOrder$Type {
    public static final /* synthetic */ ElementOrder$Type[] y = {new ElementOrder$Type("UNORDERED", 0), new ElementOrder$Type("STABLE", 1), new ElementOrder$Type("INSERTION", 2), new ElementOrder$Type("SORTED", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    ElementOrder$Type EF5;

    public static ElementOrder$Type valueOf(String str) {
        return (ElementOrder$Type) Enum.valueOf(ElementOrder$Type.class, str);
    }

    public static ElementOrder$Type[] values() {
        return (ElementOrder$Type[]) y.clone();
    }
}
