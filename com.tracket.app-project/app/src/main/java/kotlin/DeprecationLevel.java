package kotlin;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class DeprecationLevel {
    public static final /* synthetic */ DeprecationLevel[] y = {new DeprecationLevel("WARNING", 0), new DeprecationLevel("ERROR", 1), new DeprecationLevel("HIDDEN", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    DeprecationLevel EF5;

    public static DeprecationLevel valueOf(String str) {
        return (DeprecationLevel) Enum.valueOf(DeprecationLevel.class, str);
    }

    public static DeprecationLevel[] values() {
        return (DeprecationLevel[]) y.clone();
    }
}
