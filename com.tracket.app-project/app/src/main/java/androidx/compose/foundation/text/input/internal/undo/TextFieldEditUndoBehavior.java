package androidx.compose.foundation.text.input.internal.undo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class TextFieldEditUndoBehavior {
    public static final /* synthetic */ TextFieldEditUndoBehavior[] y = {new TextFieldEditUndoBehavior("MergeIfPossible", 0), new TextFieldEditUndoBehavior("ClearHistory", 1), new TextFieldEditUndoBehavior("NeverMerge", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    TextFieldEditUndoBehavior EF5;

    public static TextFieldEditUndoBehavior valueOf(String str) {
        return (TextFieldEditUndoBehavior) Enum.valueOf(TextFieldEditUndoBehavior.class, str);
    }

    public static TextFieldEditUndoBehavior[] values() {
        return (TextFieldEditUndoBehavior[]) y.clone();
    }
}
