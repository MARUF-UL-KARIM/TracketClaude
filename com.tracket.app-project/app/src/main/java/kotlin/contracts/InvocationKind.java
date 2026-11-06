package kotlin.contracts;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class InvocationKind {
    public static final /* synthetic */ InvocationKind[] y = {new InvocationKind("AT_MOST_ONCE", 0), new InvocationKind("AT_LEAST_ONCE", 1), new InvocationKind("EXACTLY_ONCE", 2), new InvocationKind("UNKNOWN", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    InvocationKind EF5;

    public static InvocationKind valueOf(String str) {
        return (InvocationKind) Enum.valueOf(InvocationKind.class, str);
    }

    public static InvocationKind[] values() {
        return (InvocationKind[]) y.clone();
    }
}
