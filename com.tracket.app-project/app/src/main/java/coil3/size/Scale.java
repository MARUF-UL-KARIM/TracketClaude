package coil3.size;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class Scale {
    public static final /* synthetic */ Scale[] A;
    public static final Scale y;
    public static final Scale z;

    static {
        Scale scale = new Scale("FILL", 0);
        y = scale;
        Scale scale2 = new Scale("FIT", 1);
        z = scale2;
        A = new Scale[]{scale, scale2};
    }

    public static Scale valueOf(String str) {
        return (Scale) Enum.valueOf(Scale.class, str);
    }

    public static Scale[] values() {
        return (Scale[]) A.clone();
    }
}
