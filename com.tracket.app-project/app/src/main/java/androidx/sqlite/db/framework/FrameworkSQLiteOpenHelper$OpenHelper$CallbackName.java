package androidx.sqlite.db.framework;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class FrameworkSQLiteOpenHelper$OpenHelper$CallbackName {
    public static final FrameworkSQLiteOpenHelper$OpenHelper$CallbackName A;
    public static final FrameworkSQLiteOpenHelper$OpenHelper$CallbackName B;
    public static final FrameworkSQLiteOpenHelper$OpenHelper$CallbackName C;
    public static final /* synthetic */ FrameworkSQLiteOpenHelper$OpenHelper$CallbackName[] D;
    public static final FrameworkSQLiteOpenHelper$OpenHelper$CallbackName y;
    public static final FrameworkSQLiteOpenHelper$OpenHelper$CallbackName z;

    static {
        FrameworkSQLiteOpenHelper$OpenHelper$CallbackName frameworkSQLiteOpenHelper$OpenHelper$CallbackName = new FrameworkSQLiteOpenHelper$OpenHelper$CallbackName("ON_CONFIGURE", 0);
        y = frameworkSQLiteOpenHelper$OpenHelper$CallbackName;
        FrameworkSQLiteOpenHelper$OpenHelper$CallbackName frameworkSQLiteOpenHelper$OpenHelper$CallbackName2 = new FrameworkSQLiteOpenHelper$OpenHelper$CallbackName("ON_CREATE", 1);
        z = frameworkSQLiteOpenHelper$OpenHelper$CallbackName2;
        FrameworkSQLiteOpenHelper$OpenHelper$CallbackName frameworkSQLiteOpenHelper$OpenHelper$CallbackName3 = new FrameworkSQLiteOpenHelper$OpenHelper$CallbackName("ON_UPGRADE", 2);
        A = frameworkSQLiteOpenHelper$OpenHelper$CallbackName3;
        FrameworkSQLiteOpenHelper$OpenHelper$CallbackName frameworkSQLiteOpenHelper$OpenHelper$CallbackName4 = new FrameworkSQLiteOpenHelper$OpenHelper$CallbackName("ON_DOWNGRADE", 3);
        B = frameworkSQLiteOpenHelper$OpenHelper$CallbackName4;
        FrameworkSQLiteOpenHelper$OpenHelper$CallbackName frameworkSQLiteOpenHelper$OpenHelper$CallbackName5 = new FrameworkSQLiteOpenHelper$OpenHelper$CallbackName("ON_OPEN", 4);
        C = frameworkSQLiteOpenHelper$OpenHelper$CallbackName5;
        D = new FrameworkSQLiteOpenHelper$OpenHelper$CallbackName[]{frameworkSQLiteOpenHelper$OpenHelper$CallbackName, frameworkSQLiteOpenHelper$OpenHelper$CallbackName2, frameworkSQLiteOpenHelper$OpenHelper$CallbackName3, frameworkSQLiteOpenHelper$OpenHelper$CallbackName4, frameworkSQLiteOpenHelper$OpenHelper$CallbackName5};
    }

    public static FrameworkSQLiteOpenHelper$OpenHelper$CallbackName valueOf(String str) {
        return (FrameworkSQLiteOpenHelper$OpenHelper$CallbackName) Enum.valueOf(FrameworkSQLiteOpenHelper$OpenHelper$CallbackName.class, str);
    }

    public static FrameworkSQLiteOpenHelper$OpenHelper$CallbackName[] values() {
        return (FrameworkSQLiteOpenHelper$OpenHelper$CallbackName[]) D.clone();
    }
}
