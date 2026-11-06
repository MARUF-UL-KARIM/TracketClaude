package org.apache.commons.math3.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class ResizableDoubleArray$ExpansionMode {
    public static final /* synthetic */ ResizableDoubleArray$ExpansionMode[] y = {new ResizableDoubleArray$ExpansionMode("MULTIPLICATIVE", 0), new ResizableDoubleArray$ExpansionMode("ADDITIVE", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    ResizableDoubleArray$ExpansionMode EF5;

    public static ResizableDoubleArray$ExpansionMode valueOf(String str) {
        return (ResizableDoubleArray$ExpansionMode) Enum.valueOf(ResizableDoubleArray$ExpansionMode.class, str);
    }

    public static ResizableDoubleArray$ExpansionMode[] values() {
        return (ResizableDoubleArray$ExpansionMode[]) y.clone();
    }
}
