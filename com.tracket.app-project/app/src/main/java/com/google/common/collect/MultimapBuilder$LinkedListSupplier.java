package com.google.common.collect;

import defpackage.yk8;
import java.util.LinkedList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
final class MultimapBuilder$LinkedListSupplier implements yk8 {
    public static final /* synthetic */ MultimapBuilder$LinkedListSupplier[] y = {new MultimapBuilder$LinkedListSupplier("INSTANCE", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    MultimapBuilder$LinkedListSupplier EF5;

    public static MultimapBuilder$LinkedListSupplier valueOf(String str) {
        return (MultimapBuilder$LinkedListSupplier) Enum.valueOf(MultimapBuilder$LinkedListSupplier.class, str);
    }

    public static MultimapBuilder$LinkedListSupplier[] values() {
        return (MultimapBuilder$LinkedListSupplier[]) y.clone();
    }

    @Override // defpackage.yk8
    public final Object get() {
        return new LinkedList();
    }
}
