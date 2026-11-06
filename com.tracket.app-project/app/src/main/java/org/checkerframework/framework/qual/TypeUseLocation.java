package org.checkerframework.framework.qual;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class TypeUseLocation {
    public static final /* synthetic */ TypeUseLocation[] y = {new TypeUseLocation("FIELD", 0), new TypeUseLocation("LOCAL_VARIABLE", 1), new TypeUseLocation("RESOURCE_VARIABLE", 2), new TypeUseLocation("EXCEPTION_PARAMETER", 3), new TypeUseLocation("RECEIVER", 4), new TypeUseLocation("PARAMETER", 5), new TypeUseLocation("RETURN", 6), new TypeUseLocation("CONSTRUCTOR_RESULT", 7), new TypeUseLocation("LOWER_BOUND", 8), new TypeUseLocation("EXPLICIT_LOWER_BOUND", 9), new TypeUseLocation("IMPLICIT_LOWER_BOUND", 10), new TypeUseLocation("UPPER_BOUND", 11), new TypeUseLocation("EXPLICIT_UPPER_BOUND", 12), new TypeUseLocation("IMPLICIT_UPPER_BOUND", 13), new TypeUseLocation("OTHERWISE", 14), new TypeUseLocation("ALL", 15)};

    /* JADX INFO: Fake field, exist only in values array */
    TypeUseLocation EF5;

    public static TypeUseLocation valueOf(String str) {
        return (TypeUseLocation) Enum.valueOf(TypeUseLocation.class, str);
    }

    public static TypeUseLocation[] values() {
        return (TypeUseLocation[]) y.clone();
    }
}
