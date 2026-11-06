package kotlinx.serialization;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class EncodeDefault$Mode {
    public static final /* synthetic */ EncodeDefault$Mode[] y = {new EncodeDefault$Mode("ALWAYS", 0), new EncodeDefault$Mode("NEVER", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    EncodeDefault$Mode EF5;

    public static EncodeDefault$Mode valueOf(String str) {
        return (EncodeDefault$Mode) Enum.valueOf(EncodeDefault$Mode.class, str);
    }

    public static EncodeDefault$Mode[] values() {
        return (EncodeDefault$Mode[]) y.clone();
    }
}
