package kotlinx.serialization.json;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class DecodeSequenceMode {
    public static final /* synthetic */ DecodeSequenceMode[] y = {new DecodeSequenceMode("WHITESPACE_SEPARATED", 0), new DecodeSequenceMode("ARRAY_WRAPPED", 1), new DecodeSequenceMode("AUTO_DETECT", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    DecodeSequenceMode EF5;

    public static DecodeSequenceMode valueOf(String str) {
        return (DecodeSequenceMode) Enum.valueOf(DecodeSequenceMode.class, str);
    }

    public static DecodeSequenceMode[] values() {
        return (DecodeSequenceMode[]) y.clone();
    }
}
