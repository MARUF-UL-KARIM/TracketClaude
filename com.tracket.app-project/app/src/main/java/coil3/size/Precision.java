package coil3.size;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class Precision {
    public static final /* synthetic */ Precision[] A;
    public static final Precision y;
    public static final Precision z;

    static {
        Precision precision = new Precision("EXACT", 0);
        y = precision;
        Precision precision2 = new Precision("INEXACT", 1);
        z = precision2;
        A = new Precision[]{precision, precision2};
    }

    public static Precision valueOf(String str) {
        return (Precision) Enum.valueOf(Precision.class, str);
    }

    public static Precision[] values() {
        return (Precision[]) A.clone();
    }
}
