package kotlinx.coroutines.channels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class TickerMode {
    public static final /* synthetic */ TickerMode[] y = {new TickerMode("FIXED_PERIOD", 0), new TickerMode("FIXED_DELAY", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    TickerMode EF5;

    public static TickerMode valueOf(String str) {
        return (TickerMode) Enum.valueOf(TickerMode.class, str);
    }

    public static TickerMode[] values() {
        return (TickerMode[]) y.clone();
    }
}
