package org.apache.commons.math3.geometry.partitioning.utilities;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
final class AVLTree$Skew {
    public static final /* synthetic */ AVLTree$Skew[] y = {new AVLTree$Skew("LEFT_HIGH", 0), new AVLTree$Skew("RIGHT_HIGH", 1), new AVLTree$Skew("BALANCED", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    AVLTree$Skew EF5;

    public static AVLTree$Skew valueOf(String str) {
        return (AVLTree$Skew) Enum.valueOf(AVLTree$Skew.class, str);
    }

    public static AVLTree$Skew[] values() {
        return (AVLTree$Skew[]) y.clone();
    }
}
