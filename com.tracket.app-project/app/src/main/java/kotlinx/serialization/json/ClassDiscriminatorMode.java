package kotlinx.serialization.json;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ClassDiscriminatorMode {
    public static final ClassDiscriminatorMode A;
    public static final /* synthetic */ ClassDiscriminatorMode[] B;
    public static final ClassDiscriminatorMode y;
    public static final ClassDiscriminatorMode z;

    static {
        ClassDiscriminatorMode classDiscriminatorMode = new ClassDiscriminatorMode("NONE", 0);
        y = classDiscriminatorMode;
        ClassDiscriminatorMode classDiscriminatorMode2 = new ClassDiscriminatorMode("ALL_JSON_OBJECTS", 1);
        z = classDiscriminatorMode2;
        ClassDiscriminatorMode classDiscriminatorMode3 = new ClassDiscriminatorMode("POLYMORPHIC", 2);
        A = classDiscriminatorMode3;
        B = new ClassDiscriminatorMode[]{classDiscriminatorMode, classDiscriminatorMode2, classDiscriminatorMode3};
    }

    public static ClassDiscriminatorMode valueOf(String str) {
        return (ClassDiscriminatorMode) Enum.valueOf(ClassDiscriminatorMode.class, str);
    }

    public static ClassDiscriminatorMode[] values() {
        return (ClassDiscriminatorMode[]) B.clone();
    }
}
