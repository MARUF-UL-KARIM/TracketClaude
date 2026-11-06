package androidx.compose.foundation.text.selection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
final class DownResolution {
    public static final DownResolution A;
    public static final DownResolution B;
    public static final /* synthetic */ DownResolution[] C;
    public static final DownResolution y;
    public static final DownResolution z;

    static {
        DownResolution downResolution = new DownResolution("Up", 0);
        y = downResolution;
        DownResolution downResolution2 = new DownResolution("Drag", 1);
        z = downResolution2;
        DownResolution downResolution3 = new DownResolution("Timeout", 2);
        A = downResolution3;
        DownResolution downResolution4 = new DownResolution("Cancel", 3);
        B = downResolution4;
        C = new DownResolution[]{downResolution, downResolution2, downResolution3, downResolution4};
    }

    public static DownResolution valueOf(String str) {
        return (DownResolution) Enum.valueOf(DownResolution.class, str);
    }

    public static DownResolution[] values() {
        return (DownResolution[]) C.clone();
    }
}
