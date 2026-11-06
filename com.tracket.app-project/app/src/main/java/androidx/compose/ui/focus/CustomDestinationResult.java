package androidx.compose.ui.focus;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class CustomDestinationResult {
    public static final CustomDestinationResult A;
    public static final /* synthetic */ CustomDestinationResult[] B;
    public static final CustomDestinationResult y;
    public static final CustomDestinationResult z;

    static {
        CustomDestinationResult customDestinationResult = new CustomDestinationResult("None", 0);
        y = customDestinationResult;
        CustomDestinationResult customDestinationResult2 = new CustomDestinationResult("Cancelled", 1);
        z = customDestinationResult2;
        CustomDestinationResult customDestinationResult3 = new CustomDestinationResult("Redirected", 2);
        A = customDestinationResult3;
        B = new CustomDestinationResult[]{customDestinationResult, customDestinationResult2, customDestinationResult3, new CustomDestinationResult("RedirectCancelled", 3)};
    }

    public static CustomDestinationResult valueOf(String str) {
        return (CustomDestinationResult) Enum.valueOf(CustomDestinationResult.class, str);
    }

    public static CustomDestinationResult[] values() {
        return (CustomDestinationResult[]) B.clone();
    }
}
