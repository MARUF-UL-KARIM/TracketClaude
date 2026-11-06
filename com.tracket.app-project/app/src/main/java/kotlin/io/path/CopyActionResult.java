package kotlin.io.path;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class CopyActionResult {
    public static final /* synthetic */ CopyActionResult[] y = {new CopyActionResult("CONTINUE", 0), new CopyActionResult("SKIP_SUBTREE", 1), new CopyActionResult("TERMINATE", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    CopyActionResult EF5;

    public static CopyActionResult valueOf(String str) {
        return (CopyActionResult) Enum.valueOf(CopyActionResult.class, str);
    }

    public static CopyActionResult[] values() {
        return (CopyActionResult[]) y.clone();
    }
}
