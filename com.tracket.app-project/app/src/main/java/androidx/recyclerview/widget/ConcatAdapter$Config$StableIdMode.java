package androidx.recyclerview.widget;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ConcatAdapter$Config$StableIdMode {
    public static final /* synthetic */ ConcatAdapter$Config$StableIdMode[] y = {new ConcatAdapter$Config$StableIdMode("NO_STABLE_IDS", 0), new ConcatAdapter$Config$StableIdMode("ISOLATED_STABLE_IDS", 1), new ConcatAdapter$Config$StableIdMode("SHARED_STABLE_IDS", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    ConcatAdapter$Config$StableIdMode EF5;

    public static ConcatAdapter$Config$StableIdMode valueOf(String str) {
        return (ConcatAdapter$Config$StableIdMode) Enum.valueOf(ConcatAdapter$Config$StableIdMode.class, str);
    }

    public static ConcatAdapter$Config$StableIdMode[] values() {
        return (ConcatAdapter$Config$StableIdMode[]) y.clone();
    }
}
