package kotlinx.coroutines.channels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class BufferOverflow {
    public static final BufferOverflow A;
    public static final /* synthetic */ BufferOverflow[] B;
    public static final BufferOverflow y;
    public static final BufferOverflow z;

    static {
        BufferOverflow bufferOverflow = new BufferOverflow("SUSPEND", 0);
        y = bufferOverflow;
        BufferOverflow bufferOverflow2 = new BufferOverflow("DROP_OLDEST", 1);
        z = bufferOverflow2;
        BufferOverflow bufferOverflow3 = new BufferOverflow("DROP_LATEST", 2);
        A = bufferOverflow3;
        B = new BufferOverflow[]{bufferOverflow, bufferOverflow2, bufferOverflow3};
    }

    public static BufferOverflow valueOf(String str) {
        return (BufferOverflow) Enum.valueOf(BufferOverflow.class, str);
    }

    public static BufferOverflow[] values() {
        return (BufferOverflow[]) B.clone();
    }
}
