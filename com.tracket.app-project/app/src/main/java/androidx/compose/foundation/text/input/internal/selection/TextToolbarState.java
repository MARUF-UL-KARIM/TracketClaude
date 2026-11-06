package androidx.compose.foundation.text.input.internal.selection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class TextToolbarState {
    public static final /* synthetic */ TextToolbarState[] y = {new TextToolbarState("None", 0), new TextToolbarState("Cursor", 1), new TextToolbarState("Selection", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    TextToolbarState EF5;

    public static TextToolbarState valueOf(String str) {
        return (TextToolbarState) Enum.valueOf(TextToolbarState.class, str);
    }

    public static TextToolbarState[] values() {
        return (TextToolbarState[]) y.clone();
    }
}
