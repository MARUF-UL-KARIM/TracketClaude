package androidx.room;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class RoomDatabase$JournalMode {
    public static final /* synthetic */ RoomDatabase$JournalMode[] A;
    public static final RoomDatabase$JournalMode y;
    public static final RoomDatabase$JournalMode z;

    /* JADX INFO: Fake field, exist only in values array */
    RoomDatabase$JournalMode EF0;

    static {
        RoomDatabase$JournalMode roomDatabase$JournalMode = new RoomDatabase$JournalMode("AUTOMATIC", 0);
        RoomDatabase$JournalMode roomDatabase$JournalMode2 = new RoomDatabase$JournalMode("TRUNCATE", 1);
        y = roomDatabase$JournalMode2;
        RoomDatabase$JournalMode roomDatabase$JournalMode3 = new RoomDatabase$JournalMode("WRITE_AHEAD_LOGGING", 2);
        z = roomDatabase$JournalMode3;
        A = new RoomDatabase$JournalMode[]{roomDatabase$JournalMode, roomDatabase$JournalMode2, roomDatabase$JournalMode3};
    }

    public static RoomDatabase$JournalMode valueOf(String str) {
        return (RoomDatabase$JournalMode) Enum.valueOf(RoomDatabase$JournalMode.class, str);
    }

    public static RoomDatabase$JournalMode[] values() {
        return (RoomDatabase$JournalMode[]) A.clone();
    }
}
