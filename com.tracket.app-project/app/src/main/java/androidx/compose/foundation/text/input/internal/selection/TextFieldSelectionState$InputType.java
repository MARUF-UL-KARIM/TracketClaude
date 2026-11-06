package androidx.compose.foundation.text.input.internal.selection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class TextFieldSelectionState$InputType {
    public static final /* synthetic */ TextFieldSelectionState$InputType[] y = {new TextFieldSelectionState$InputType("None", 0), new TextFieldSelectionState$InputType("Touch", 1), new TextFieldSelectionState$InputType("Mouse", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    TextFieldSelectionState$InputType EF5;

    public static TextFieldSelectionState$InputType valueOf(String str) {
        return (TextFieldSelectionState$InputType) Enum.valueOf(TextFieldSelectionState$InputType.class, str);
    }

    public static TextFieldSelectionState$InputType[] values() {
        return (TextFieldSelectionState$InputType[]) y.clone();
    }
}
