package androidx.constraintlayout.core.dsl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class Constraint$ChainMode {
    public static final /* synthetic */ Constraint$ChainMode[] y = {new Constraint$ChainMode("SPREAD", 0), new Constraint$ChainMode("SPREAD_INSIDE", 1), new Constraint$ChainMode("PACKED", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    Constraint$ChainMode EF5;

    public static Constraint$ChainMode valueOf(String str) {
        return (Constraint$ChainMode) Enum.valueOf(Constraint$ChainMode.class, str);
    }

    public static Constraint$ChainMode[] values() {
        return (Constraint$ChainMode[]) y.clone();
    }
}
