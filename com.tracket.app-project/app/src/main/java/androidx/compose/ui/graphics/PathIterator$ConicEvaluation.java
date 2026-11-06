package androidx.compose.ui.graphics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class PathIterator$ConicEvaluation {
    public static final /* synthetic */ PathIterator$ConicEvaluation[] y = {new PathIterator$ConicEvaluation("AsConic", 0), new PathIterator$ConicEvaluation("AsQuadratics", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    PathIterator$ConicEvaluation EF5;

    public static PathIterator$ConicEvaluation valueOf(String str) {
        return (PathIterator$ConicEvaluation) Enum.valueOf(PathIterator$ConicEvaluation.class, str);
    }

    public static PathIterator$ConicEvaluation[] values() {
        return (PathIterator$ConicEvaluation[]) y.clone();
    }
}
