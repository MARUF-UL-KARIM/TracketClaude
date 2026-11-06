package androidx.compose.runtime;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class InvalidationResult {
    public static final InvalidationResult A;
    public static final InvalidationResult B;
    public static final /* synthetic */ InvalidationResult[] C;
    public static final InvalidationResult y;
    public static final InvalidationResult z;

    static {
        InvalidationResult invalidationResult = new InvalidationResult("IGNORED", 0);
        y = invalidationResult;
        InvalidationResult invalidationResult2 = new InvalidationResult("SCHEDULED", 1);
        z = invalidationResult2;
        InvalidationResult invalidationResult3 = new InvalidationResult("DEFERRED", 2);
        A = invalidationResult3;
        InvalidationResult invalidationResult4 = new InvalidationResult("IMMINENT", 3);
        B = invalidationResult4;
        C = new InvalidationResult[]{invalidationResult, invalidationResult2, invalidationResult3, invalidationResult4};
    }

    public static InvalidationResult valueOf(String str) {
        return (InvalidationResult) Enum.valueOf(InvalidationResult.class, str);
    }

    public static InvalidationResult[] values() {
        return (InvalidationResult[]) C.clone();
    }
}
