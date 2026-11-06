package androidx.compose.material3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class SnackbarResult {
    public static final /* synthetic */ SnackbarResult[] A;
    public static final SnackbarResult y;
    public static final SnackbarResult z;

    static {
        SnackbarResult snackbarResult = new SnackbarResult("Dismissed", 0);
        y = snackbarResult;
        SnackbarResult snackbarResult2 = new SnackbarResult("ActionPerformed", 1);
        z = snackbarResult2;
        A = new SnackbarResult[]{snackbarResult, snackbarResult2};
    }

    public static SnackbarResult valueOf(String str) {
        return (SnackbarResult) Enum.valueOf(SnackbarResult.class, str);
    }

    public static SnackbarResult[] values() {
        return (SnackbarResult[]) A.clone();
    }
}
