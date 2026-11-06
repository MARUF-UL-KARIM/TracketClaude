package kotlin.reflect;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class KParameter$Kind {
    public static final /* synthetic */ KParameter$Kind[] y = {new KParameter$Kind("INSTANCE", 0), new KParameter$Kind("CONTEXT", 1), new KParameter$Kind("EXTENSION_RECEIVER", 2), new KParameter$Kind("VALUE", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    KParameter$Kind EF5;

    public static KParameter$Kind valueOf(String str) {
        return (KParameter$Kind) Enum.valueOf(KParameter$Kind.class, str);
    }

    public static KParameter$Kind[] values() {
        return (KParameter$Kind[]) y.clone();
    }
}
