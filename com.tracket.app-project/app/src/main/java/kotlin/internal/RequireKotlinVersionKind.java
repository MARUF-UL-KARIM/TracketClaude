package kotlin.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class RequireKotlinVersionKind {
    public static final /* synthetic */ RequireKotlinVersionKind[] y = {new RequireKotlinVersionKind("LANGUAGE_VERSION", 0), new RequireKotlinVersionKind("COMPILER_VERSION", 1), new RequireKotlinVersionKind("API_VERSION", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    RequireKotlinVersionKind EF5;

    public static RequireKotlinVersionKind valueOf(String str) {
        return (RequireKotlinVersionKind) Enum.valueOf(RequireKotlinVersionKind.class, str);
    }

    public static RequireKotlinVersionKind[] values() {
        return (RequireKotlinVersionKind[]) y.clone();
    }
}
