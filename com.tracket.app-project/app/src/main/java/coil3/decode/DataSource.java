package coil3.decode;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class DataSource {
    public static final DataSource A;
    public static final DataSource B;
    public static final /* synthetic */ DataSource[] C;
    public static final DataSource y;
    public static final DataSource z;

    static {
        DataSource dataSource = new DataSource("MEMORY_CACHE", 0);
        y = dataSource;
        DataSource dataSource2 = new DataSource("MEMORY", 1);
        z = dataSource2;
        DataSource dataSource3 = new DataSource("DISK", 2);
        A = dataSource3;
        DataSource dataSource4 = new DataSource("NETWORK", 3);
        B = dataSource4;
        C = new DataSource[]{dataSource, dataSource2, dataSource3, dataSource4};
    }

    public static DataSource valueOf(String str) {
        return (DataSource) Enum.valueOf(DataSource.class, str);
    }

    public static DataSource[] values() {
        return (DataSource[]) C.clone();
    }
}
