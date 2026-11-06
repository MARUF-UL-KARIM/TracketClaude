package androidx.sqlite.driver;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
final class SupportSQLiteStatement$Companion$TransactionOperation {
    public static final SupportSQLiteStatement$Companion$TransactionOperation A;
    public static final SupportSQLiteStatement$Companion$TransactionOperation B;
    public static final SupportSQLiteStatement$Companion$TransactionOperation C;
    public static final /* synthetic */ SupportSQLiteStatement$Companion$TransactionOperation[] D;
    public static final SupportSQLiteStatement$Companion$TransactionOperation y;
    public static final SupportSQLiteStatement$Companion$TransactionOperation z;

    static {
        SupportSQLiteStatement$Companion$TransactionOperation supportSQLiteStatement$Companion$TransactionOperation = new SupportSQLiteStatement$Companion$TransactionOperation("END", 0);
        y = supportSQLiteStatement$Companion$TransactionOperation;
        SupportSQLiteStatement$Companion$TransactionOperation supportSQLiteStatement$Companion$TransactionOperation2 = new SupportSQLiteStatement$Companion$TransactionOperation("ROLLBACK", 1);
        z = supportSQLiteStatement$Companion$TransactionOperation2;
        SupportSQLiteStatement$Companion$TransactionOperation supportSQLiteStatement$Companion$TransactionOperation3 = new SupportSQLiteStatement$Companion$TransactionOperation("BEGIN_EXCLUSIVE", 2);
        A = supportSQLiteStatement$Companion$TransactionOperation3;
        SupportSQLiteStatement$Companion$TransactionOperation supportSQLiteStatement$Companion$TransactionOperation4 = new SupportSQLiteStatement$Companion$TransactionOperation("BEGIN_IMMEDIATE", 3);
        B = supportSQLiteStatement$Companion$TransactionOperation4;
        SupportSQLiteStatement$Companion$TransactionOperation supportSQLiteStatement$Companion$TransactionOperation5 = new SupportSQLiteStatement$Companion$TransactionOperation("BEGIN_DEFERRED", 4);
        C = supportSQLiteStatement$Companion$TransactionOperation5;
        D = new SupportSQLiteStatement$Companion$TransactionOperation[]{supportSQLiteStatement$Companion$TransactionOperation, supportSQLiteStatement$Companion$TransactionOperation2, supportSQLiteStatement$Companion$TransactionOperation3, supportSQLiteStatement$Companion$TransactionOperation4, supportSQLiteStatement$Companion$TransactionOperation5};
    }

    public static SupportSQLiteStatement$Companion$TransactionOperation valueOf(String str) {
        return (SupportSQLiteStatement$Companion$TransactionOperation) Enum.valueOf(SupportSQLiteStatement$Companion$TransactionOperation.class, str);
    }

    public static SupportSQLiteStatement$Companion$TransactionOperation[] values() {
        return (SupportSQLiteStatement$Companion$TransactionOperation[]) D.clone();
    }
}
