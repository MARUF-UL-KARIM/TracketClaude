package androidx.room;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class Transactor$SQLiteTransactionType {
    public static final /* synthetic */ Transactor$SQLiteTransactionType[] A;
    public static final Transactor$SQLiteTransactionType y;
    public static final Transactor$SQLiteTransactionType z;

    static {
        Transactor$SQLiteTransactionType transactor$SQLiteTransactionType = new Transactor$SQLiteTransactionType("DEFERRED", 0);
        y = transactor$SQLiteTransactionType;
        Transactor$SQLiteTransactionType transactor$SQLiteTransactionType2 = new Transactor$SQLiteTransactionType("IMMEDIATE", 1);
        z = transactor$SQLiteTransactionType2;
        A = new Transactor$SQLiteTransactionType[]{transactor$SQLiteTransactionType, transactor$SQLiteTransactionType2, new Transactor$SQLiteTransactionType("EXCLUSIVE", 2)};
    }

    public static Transactor$SQLiteTransactionType valueOf(String str) {
        return (Transactor$SQLiteTransactionType) Enum.valueOf(Transactor$SQLiteTransactionType.class, str);
    }

    public static Transactor$SQLiteTransactionType[] values() {
        return (Transactor$SQLiteTransactionType[]) A.clone();
    }
}
