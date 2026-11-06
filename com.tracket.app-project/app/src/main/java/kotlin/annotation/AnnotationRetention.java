package kotlin.annotation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class AnnotationRetention {
    public static final /* synthetic */ AnnotationRetention[] y = {new AnnotationRetention("SOURCE", 0), new AnnotationRetention("BINARY", 1), new AnnotationRetention("RUNTIME", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    AnnotationRetention EF5;

    public static AnnotationRetention valueOf(String str) {
        return (AnnotationRetention) Enum.valueOf(AnnotationRetention.class, str);
    }

    public static AnnotationRetention[] values() {
        return (AnnotationRetention[]) y.clone();
    }
}
