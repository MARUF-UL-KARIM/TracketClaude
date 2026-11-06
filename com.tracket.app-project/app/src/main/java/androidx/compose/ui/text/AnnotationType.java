package androidx.compose.ui.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
final class AnnotationType {
    public static final AnnotationType A;
    public static final AnnotationType B;
    public static final AnnotationType C;
    public static final AnnotationType D;
    public static final AnnotationType E;
    public static final /* synthetic */ AnnotationType[] F;
    public static final AnnotationType y;
    public static final AnnotationType z;

    static {
        AnnotationType annotationType = new AnnotationType("Paragraph", 0);
        y = annotationType;
        AnnotationType annotationType2 = new AnnotationType("Span", 1);
        z = annotationType2;
        AnnotationType annotationType3 = new AnnotationType("VerbatimTts", 2);
        A = annotationType3;
        AnnotationType annotationType4 = new AnnotationType("Url", 3);
        B = annotationType4;
        AnnotationType annotationType5 = new AnnotationType("Link", 4);
        C = annotationType5;
        AnnotationType annotationType6 = new AnnotationType("Clickable", 5);
        D = annotationType6;
        AnnotationType annotationType7 = new AnnotationType("String", 6);
        E = annotationType7;
        F = new AnnotationType[]{annotationType, annotationType2, annotationType3, annotationType4, annotationType5, annotationType6, annotationType7};
    }

    public static AnnotationType valueOf(String str) {
        return (AnnotationType) Enum.valueOf(AnnotationType.class, str);
    }

    public static AnnotationType[] values() {
        return (AnnotationType[]) F.clone();
    }
}
