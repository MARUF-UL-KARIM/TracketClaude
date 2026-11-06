package androidx.constraintlayout.core.dsl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class KeyAttributes$Visibility {
    public static final /* synthetic */ KeyAttributes$Visibility[] y = {new KeyAttributes$Visibility("VISIBLE", 0), new KeyAttributes$Visibility("INVISIBLE", 1), new KeyAttributes$Visibility("GONE", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    KeyAttributes$Visibility EF5;

    public static KeyAttributes$Visibility valueOf(String str) {
        return (KeyAttributes$Visibility) Enum.valueOf(KeyAttributes$Visibility.class, str);
    }

    public static KeyAttributes$Visibility[] values() {
        return (KeyAttributes$Visibility[]) y.clone();
    }
}
