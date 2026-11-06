package androidx.constraintlayout.core.dsl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class KeyPositions$Type {
    public static final /* synthetic */ KeyPositions$Type[] y = {new KeyPositions$Type("CARTESIAN", 0), new KeyPositions$Type("SCREEN", 1), new KeyPositions$Type("PATH", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    KeyPositions$Type EF5;

    public static KeyPositions$Type valueOf(String str) {
        return (KeyPositions$Type) Enum.valueOf(KeyPositions$Type.class, str);
    }

    public static KeyPositions$Type[] values() {
        return (KeyPositions$Type[]) y.clone();
    }
}
