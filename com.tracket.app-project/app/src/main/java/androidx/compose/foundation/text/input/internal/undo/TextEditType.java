package androidx.compose.foundation.text.input.internal.undo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class TextEditType {
    public static final /* synthetic */ TextEditType[] y = {new TextEditType("Insert", 0), new TextEditType("Delete", 1), new TextEditType("Replace", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    TextEditType EF5;

    public static TextEditType valueOf(String str) {
        return (TextEditType) Enum.valueOf(TextEditType.class, str);
    }

    public static TextEditType[] values() {
        return (TextEditType[]) y.clone();
    }
}
