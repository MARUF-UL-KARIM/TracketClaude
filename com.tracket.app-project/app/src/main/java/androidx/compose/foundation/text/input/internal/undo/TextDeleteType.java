package androidx.compose.foundation.text.input.internal.undo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class TextDeleteType {
    public static final /* synthetic */ TextDeleteType[] y = {new TextDeleteType("Start", 0), new TextDeleteType("End", 1), new TextDeleteType("Inner", 2), new TextDeleteType("NotByUser", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    TextDeleteType EF5;

    public static TextDeleteType valueOf(String str) {
        return (TextDeleteType) Enum.valueOf(TextDeleteType.class, str);
    }

    public static TextDeleteType[] values() {
        return (TextDeleteType[]) y.clone();
    }
}
