package kotlin.io.path;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class OnErrorResult {
    public static final /* synthetic */ OnErrorResult[] y = {new OnErrorResult("SKIP_SUBTREE", 0), new OnErrorResult("TERMINATE", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    OnErrorResult EF5;

    public static OnErrorResult valueOf(String str) {
        return (OnErrorResult) Enum.valueOf(OnErrorResult.class, str);
    }

    public static OnErrorResult[] values() {
        return (OnErrorResult[]) y.clone();
    }
}
