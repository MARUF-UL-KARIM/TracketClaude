package androidx.constraintlayout.core.dsl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class Constraint$VSide {
    public static final /* synthetic */ Constraint$VSide[] y = {new Constraint$VSide("TOP", 0), new Constraint$VSide("BOTTOM", 1), new Constraint$VSide("BASELINE", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    Constraint$VSide EF5;

    public static Constraint$VSide valueOf(String str) {
        return (Constraint$VSide) Enum.valueOf(Constraint$VSide.class, str);
    }

    public static Constraint$VSide[] values() {
        return (Constraint$VSide[]) y.clone();
    }
}
