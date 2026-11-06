package kotlinx.coroutines;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class CoroutineStart {
    public static final CoroutineStart A;
    public static final CoroutineStart B;
    public static final /* synthetic */ CoroutineStart[] C;
    public static final CoroutineStart y;
    public static final CoroutineStart z;

    static {
        CoroutineStart coroutineStart = new CoroutineStart("DEFAULT", 0);
        y = coroutineStart;
        CoroutineStart coroutineStart2 = new CoroutineStart("LAZY", 1);
        z = coroutineStart2;
        CoroutineStart coroutineStart3 = new CoroutineStart("ATOMIC", 2);
        A = coroutineStart3;
        CoroutineStart coroutineStart4 = new CoroutineStart("UNDISPATCHED", 3);
        B = coroutineStart4;
        C = new CoroutineStart[]{coroutineStart, coroutineStart2, coroutineStart3, coroutineStart4};
    }

    public static CoroutineStart valueOf(String str) {
        return (CoroutineStart) Enum.valueOf(CoroutineStart.class, str);
    }

    public static CoroutineStart[] values() {
        return (CoroutineStart[]) C.clone();
    }
}
