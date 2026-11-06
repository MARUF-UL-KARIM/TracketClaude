package com.google.j2objc.annotations;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ObjectiveCAdapterMethod$Adaptation {
    public static final /* synthetic */ ObjectiveCAdapterMethod$Adaptation[] y = {new ObjectiveCAdapterMethod$Adaptation("EXCEPTIONS_AS_ERRORS", 0), new ObjectiveCAdapterMethod$Adaptation("RETURN_NATIVE_BOOLS", 1), new ObjectiveCAdapterMethod$Adaptation("ACCEPT_NATIVE_BOOLS", 2), new ObjectiveCAdapterMethod$Adaptation("RETURN_NATIVE_ENUMS", 3), new ObjectiveCAdapterMethod$Adaptation("ACCEPT_NATIVE_ENUMS", 4), new ObjectiveCAdapterMethod$Adaptation("RETURN_ADAPTER_PROTOCOLS", 5), new ObjectiveCAdapterMethod$Adaptation("RETURN_LISTS_AS_NATIVE_ARRAYS", 6)};

    /* JADX INFO: Fake field, exist only in values array */
    ObjectiveCAdapterMethod$Adaptation EF5;

    public static ObjectiveCAdapterMethod$Adaptation valueOf(String str) {
        return (ObjectiveCAdapterMethod$Adaptation) Enum.valueOf(ObjectiveCAdapterMethod$Adaptation.class, str);
    }

    public static ObjectiveCAdapterMethod$Adaptation[] values() {
        return (ObjectiveCAdapterMethod$Adaptation[]) y.clone();
    }
}
