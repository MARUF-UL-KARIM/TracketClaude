package androidx.constraintlayout.core.parser;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
final class CLParser$TYPE {
    public static final /* synthetic */ CLParser$TYPE[] y = {new CLParser$TYPE("UNKNOWN", 0), new CLParser$TYPE("OBJECT", 1), new CLParser$TYPE("ARRAY", 2), new CLParser$TYPE("NUMBER", 3), new CLParser$TYPE("STRING", 4), new CLParser$TYPE("KEY", 5), new CLParser$TYPE("TOKEN", 6)};

    /* JADX INFO: Fake field, exist only in values array */
    CLParser$TYPE EF5;

    public static CLParser$TYPE valueOf(String str) {
        return (CLParser$TYPE) Enum.valueOf(CLParser$TYPE.class, str);
    }

    public static CLParser$TYPE[] values() {
        return (CLParser$TYPE[]) y.clone();
    }
}
