package com.google.common.base;

import defpackage.tq3;
import defpackage.yk8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
final class Suppliers$SupplierFunctionImpl implements tq3 {
    public static final /* synthetic */ Suppliers$SupplierFunctionImpl[] y = {new Suppliers$SupplierFunctionImpl("INSTANCE", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    Suppliers$SupplierFunctionImpl EF5;

    public static Suppliers$SupplierFunctionImpl valueOf(String str) {
        return (Suppliers$SupplierFunctionImpl) Enum.valueOf(Suppliers$SupplierFunctionImpl.class, str);
    }

    public static Suppliers$SupplierFunctionImpl[] values() {
        return (Suppliers$SupplierFunctionImpl[]) y.clone();
    }

    @Override // defpackage.tq3
    public final Object apply(Object obj) {
        return ((yk8) obj).get();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "Suppliers.supplierFunction()";
    }
}
