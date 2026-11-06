package androidx.compose.foundation.text.selection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class SelectedTextType {
    public static final SelectedTextType y;
    public static final /* synthetic */ SelectedTextType[] z;

    static {
        SelectedTextType selectedTextType = new SelectedTextType("EditableText", 0);
        y = selectedTextType;
        z = new SelectedTextType[]{selectedTextType, new SelectedTextType("StaticText", 1)};
    }

    public static SelectedTextType valueOf(String str) {
        return (SelectedTextType) Enum.valueOf(SelectedTextType.class, str);
    }

    public static SelectedTextType[] values() {
        return (SelectedTextType[]) z.clone();
    }
}
