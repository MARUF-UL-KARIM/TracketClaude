package org.apache.commons.math3.geometry.partitioning;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class BSPTreeVisitor$Order {
    public static final /* synthetic */ BSPTreeVisitor$Order[] y = {new BSPTreeVisitor$Order("PLUS_MINUS_SUB", 0), new BSPTreeVisitor$Order("PLUS_SUB_MINUS", 1), new BSPTreeVisitor$Order("MINUS_PLUS_SUB", 2), new BSPTreeVisitor$Order("MINUS_SUB_PLUS", 3), new BSPTreeVisitor$Order("SUB_PLUS_MINUS", 4), new BSPTreeVisitor$Order("SUB_MINUS_PLUS", 5)};

    /* JADX INFO: Fake field, exist only in values array */
    BSPTreeVisitor$Order EF5;

    public static BSPTreeVisitor$Order valueOf(String str) {
        return (BSPTreeVisitor$Order) Enum.valueOf(BSPTreeVisitor$Order.class, str);
    }

    public static BSPTreeVisitor$Order[] values() {
        return (BSPTreeVisitor$Order[]) y.clone();
    }
}
