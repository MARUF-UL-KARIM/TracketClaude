package org.koin.core.definition;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class Kind {
    public static final Kind A;
    public static final /* synthetic */ Kind[] B;
    public static final Kind y;
    public static final Kind z;

    static {
        Kind kind = new Kind("Singleton", 0);
        y = kind;
        Kind kind2 = new Kind("Factory", 1);
        z = kind2;
        Kind kind3 = new Kind("Scoped", 2);
        A = kind3;
        B = new Kind[]{kind, kind2, kind3};
    }

    public static Kind valueOf(String str) {
        return (Kind) Enum.valueOf(Kind.class, str);
    }

    public static Kind[] values() {
        return (Kind[]) B.clone();
    }
}
