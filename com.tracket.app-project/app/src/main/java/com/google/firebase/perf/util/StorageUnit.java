package com.google.firebase.perf.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class StorageUnit {
    public static final /* synthetic */ StorageUnit[] y = {new AnonymousClass1(1099511627776L, 0, "TERABYTES"), new AnonymousClass2(1073741824, 1, "GIGABYTES"), new AnonymousClass3(1048576, 2, "MEGABYTES"), new AnonymousClass4(1024, 3, "KILOBYTES"), new AnonymousClass5(1, 4, "BYTES")};

    /* JADX INFO: Fake field, exist only in values array */
    StorageUnit EF10;

    /* JADX INFO: renamed from: com.google.firebase.perf.util.StorageUnit$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
    public final enum AnonymousClass1 extends StorageUnit {
    }

    /* JADX INFO: renamed from: com.google.firebase.perf.util.StorageUnit$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
    public final enum AnonymousClass2 extends StorageUnit {
    }

    /* JADX INFO: renamed from: com.google.firebase.perf.util.StorageUnit$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
    public final enum AnonymousClass3 extends StorageUnit {
    }

    /* JADX INFO: renamed from: com.google.firebase.perf.util.StorageUnit$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
    public final enum AnonymousClass4 extends StorageUnit {
    }

    /* JADX INFO: renamed from: com.google.firebase.perf.util.StorageUnit$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
    public final enum AnonymousClass5 extends StorageUnit {
    }

    public StorageUnit(long j, int i, String str) {
        super(str, i);
    }

    public static StorageUnit valueOf(String str) {
        return (StorageUnit) Enum.valueOf(StorageUnit.class, str);
    }

    public static StorageUnit[] values() {
        return (StorageUnit[]) y.clone();
    }
}
