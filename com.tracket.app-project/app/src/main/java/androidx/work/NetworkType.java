package androidx.work;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class NetworkType {
    public static final NetworkType A;
    public static final NetworkType B;
    public static final NetworkType C;
    public static final NetworkType D;
    public static final /* synthetic */ NetworkType[] E;
    public static final NetworkType y;
    public static final NetworkType z;

    static {
        NetworkType networkType = new NetworkType("NOT_REQUIRED", 0);
        y = networkType;
        NetworkType networkType2 = new NetworkType("CONNECTED", 1);
        z = networkType2;
        NetworkType networkType3 = new NetworkType("UNMETERED", 2);
        A = networkType3;
        NetworkType networkType4 = new NetworkType("NOT_ROAMING", 3);
        B = networkType4;
        NetworkType networkType5 = new NetworkType("METERED", 4);
        C = networkType5;
        NetworkType networkType6 = new NetworkType("TEMPORARILY_UNMETERED", 5);
        D = networkType6;
        E = new NetworkType[]{networkType, networkType2, networkType3, networkType4, networkType5, networkType6};
    }

    public static NetworkType valueOf(String str) {
        return (NetworkType) Enum.valueOf(NetworkType.class, str);
    }

    public static NetworkType[] values() {
        return (NetworkType[]) E.clone();
    }
}
