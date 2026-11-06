package androidx.constraintlayout.core.dsl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class KeyPosition$Type {
    public static final /* synthetic */ KeyPosition$Type[] y = {new KeyPosition$Type("CARTESIAN", 0), new KeyPosition$Type("SCREEN", 1), new KeyPosition$Type("PATH", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    KeyPosition$Type EF5;

    public static KeyPosition$Type valueOf(String str) {
        return (KeyPosition$Type) Enum.valueOf(KeyPosition$Type.class, str);
    }

    public static KeyPosition$Type[] values() {
        return (KeyPosition$Type[]) y.clone();
    }
}
