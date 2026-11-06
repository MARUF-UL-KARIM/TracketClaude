package androidx.compose.material3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class SheetValue {
    public static final SheetValue A;
    public static final /* synthetic */ SheetValue[] B;
    public static final SheetValue y;
    public static final SheetValue z;

    static {
        SheetValue sheetValue = new SheetValue("Hidden", 0);
        y = sheetValue;
        SheetValue sheetValue2 = new SheetValue("Expanded", 1);
        z = sheetValue2;
        SheetValue sheetValue3 = new SheetValue("PartiallyExpanded", 2);
        A = sheetValue3;
        B = new SheetValue[]{sheetValue, sheetValue2, sheetValue3};
    }

    public static SheetValue valueOf(String str) {
        return (SheetValue) Enum.valueOf(SheetValue.class, str);
    }

    public static SheetValue[] values() {
        return (SheetValue[]) B.clone();
    }
}
