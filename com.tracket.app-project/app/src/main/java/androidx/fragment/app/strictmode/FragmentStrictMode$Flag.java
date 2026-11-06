package androidx.fragment.app.strictmode;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class FragmentStrictMode$Flag {
    public static final /* synthetic */ FragmentStrictMode$Flag[] y = {new FragmentStrictMode$Flag("PENALTY_LOG", 0), new FragmentStrictMode$Flag("PENALTY_DEATH", 1), new FragmentStrictMode$Flag("DETECT_FRAGMENT_REUSE", 2), new FragmentStrictMode$Flag("DETECT_FRAGMENT_TAG_USAGE", 3), new FragmentStrictMode$Flag("DETECT_WRONG_NESTED_HIERARCHY", 4), new FragmentStrictMode$Flag("DETECT_RETAIN_INSTANCE_USAGE", 5), new FragmentStrictMode$Flag("DETECT_SET_USER_VISIBLE_HINT", 6), new FragmentStrictMode$Flag("DETECT_TARGET_FRAGMENT_USAGE", 7), new FragmentStrictMode$Flag("DETECT_WRONG_FRAGMENT_CONTAINER", 8)};

    /* JADX INFO: Fake field, exist only in values array */
    FragmentStrictMode$Flag EF5;

    public static FragmentStrictMode$Flag valueOf(String str) {
        return (FragmentStrictMode$Flag) Enum.valueOf(FragmentStrictMode$Flag.class, str);
    }

    public static FragmentStrictMode$Flag[] values() {
        return (FragmentStrictMode$Flag[]) y.clone();
    }
}
