package coil3.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class Logger$Level {
    public static final /* synthetic */ Logger$Level[] y = {new Logger$Level("Verbose", 0), new Logger$Level("Debug", 1), new Logger$Level("Info", 2), new Logger$Level("Warn", 3), new Logger$Level("Error", 4)};

    /* JADX INFO: Fake field, exist only in values array */
    Logger$Level EF5;

    public static Logger$Level valueOf(String str) {
        return (Logger$Level) Enum.valueOf(Logger$Level.class, str);
    }

    public static Logger$Level[] values() {
        return (Logger$Level[]) y.clone();
    }
}
