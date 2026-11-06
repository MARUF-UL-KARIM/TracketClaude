package androidx.compose.material3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class SnackbarDuration {
    public static final SnackbarDuration A;
    public static final /* synthetic */ SnackbarDuration[] B;
    public static final SnackbarDuration y;
    public static final SnackbarDuration z;

    static {
        SnackbarDuration snackbarDuration = new SnackbarDuration("Short", 0);
        y = snackbarDuration;
        SnackbarDuration snackbarDuration2 = new SnackbarDuration("Long", 1);
        z = snackbarDuration2;
        SnackbarDuration snackbarDuration3 = new SnackbarDuration("Indefinite", 2);
        A = snackbarDuration3;
        B = new SnackbarDuration[]{snackbarDuration, snackbarDuration2, snackbarDuration3};
    }

    public static SnackbarDuration valueOf(String str) {
        return (SnackbarDuration) Enum.valueOf(SnackbarDuration.class, str);
    }

    public static SnackbarDuration[] values() {
        return (SnackbarDuration[]) B.clone();
    }
}
