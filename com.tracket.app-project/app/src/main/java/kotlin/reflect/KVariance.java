package kotlin.reflect;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class KVariance {
    public static final KVariance y;
    public static final /* synthetic */ KVariance[] z;

    static {
        KVariance kVariance = new KVariance("INVARIANT", 0);
        y = kVariance;
        z = new KVariance[]{kVariance, new KVariance("IN", 1), new KVariance("OUT", 2)};
    }

    public static KVariance valueOf(String str) {
        return (KVariance) Enum.valueOf(KVariance.class, str);
    }

    public static KVariance[] values() {
        return (KVariance[]) z.clone();
    }
}
