package androidx.annotation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class RequiresOptIn$Level {
    public static final /* synthetic */ RequiresOptIn$Level[] y = {new RequiresOptIn$Level("WARNING", 0), new RequiresOptIn$Level("ERROR", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    RequiresOptIn$Level EF5;

    public static RequiresOptIn$Level valueOf(String str) {
        return (RequiresOptIn$Level) Enum.valueOf(RequiresOptIn$Level.class, str);
    }

    public static RequiresOptIn$Level[] values() {
        return (RequiresOptIn$Level[]) y.clone();
    }
}
