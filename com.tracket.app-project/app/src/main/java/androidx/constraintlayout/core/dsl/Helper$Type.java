package androidx.constraintlayout.core.dsl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class Helper$Type {
    public static final /* synthetic */ Helper$Type[] y = {new Helper$Type("VERTICAL_GUIDELINE", 0), new Helper$Type("HORIZONTAL_GUIDELINE", 1), new Helper$Type("VERTICAL_CHAIN", 2), new Helper$Type("HORIZONTAL_CHAIN", 3), new Helper$Type("BARRIER", 4)};

    /* JADX INFO: Fake field, exist only in values array */
    Helper$Type EF5;

    public static Helper$Type valueOf(String str) {
        return (Helper$Type) Enum.valueOf(Helper$Type.class, str);
    }

    public static Helper$Type[] values() {
        return (Helper$Type[]) y.clone();
    }
}
