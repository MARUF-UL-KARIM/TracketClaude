package androidx.compose.foundation.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class Handle {
    public static final Handle A;
    public static final /* synthetic */ Handle[] B;
    public static final Handle y;
    public static final Handle z;

    static {
        Handle handle = new Handle("Cursor", 0);
        y = handle;
        Handle handle2 = new Handle("SelectionStart", 1);
        z = handle2;
        Handle handle3 = new Handle("SelectionEnd", 2);
        A = handle3;
        B = new Handle[]{handle, handle2, handle3};
    }

    public static Handle valueOf(String str) {
        return (Handle) Enum.valueOf(Handle.class, str);
    }

    public static Handle[] values() {
        return (Handle[]) B.clone();
    }
}
