package kotlin;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class LazyThreadSafetyMode {
    public static final /* synthetic */ LazyThreadSafetyMode[] A;
    public static final LazyThreadSafetyMode y;
    public static final LazyThreadSafetyMode z;

    /* JADX INFO: Fake field, exist only in values array */
    LazyThreadSafetyMode EF0;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = new LazyThreadSafetyMode("SYNCHRONIZED", 0);
        LazyThreadSafetyMode lazyThreadSafetyMode2 = new LazyThreadSafetyMode("PUBLICATION", 1);
        y = lazyThreadSafetyMode2;
        LazyThreadSafetyMode lazyThreadSafetyMode3 = new LazyThreadSafetyMode("NONE", 2);
        z = lazyThreadSafetyMode3;
        A = new LazyThreadSafetyMode[]{lazyThreadSafetyMode, lazyThreadSafetyMode2, lazyThreadSafetyMode3};
    }

    public static LazyThreadSafetyMode valueOf(String str) {
        return (LazyThreadSafetyMode) Enum.valueOf(LazyThreadSafetyMode.class, str);
    }

    public static LazyThreadSafetyMode[] values() {
        return (LazyThreadSafetyMode[]) A.clone();
    }
}
