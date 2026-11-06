package androidx.constraintlayout.core.parser;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
final class CLToken$Type {
    public static final /* synthetic */ CLToken$Type[] y = {new CLToken$Type("UNKNOWN", 0), new CLToken$Type("TRUE", 1), new CLToken$Type("FALSE", 2), new CLToken$Type("NULL", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    CLToken$Type EF5;

    public static CLToken$Type valueOf(String str) {
        return (CLToken$Type) Enum.valueOf(CLToken$Type.class, str);
    }

    public static CLToken$Type[] values() {
        return (CLToken$Type[]) y.clone();
    }
}
