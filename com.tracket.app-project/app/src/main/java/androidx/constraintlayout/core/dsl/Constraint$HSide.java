package androidx.constraintlayout.core.dsl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class Constraint$HSide {
    public static final /* synthetic */ Constraint$HSide[] y = {new Constraint$HSide("LEFT", 0), new Constraint$HSide("RIGHT", 1), new Constraint$HSide("START", 2), new Constraint$HSide("END", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    Constraint$HSide EF5;

    public static Constraint$HSide valueOf(String str) {
        return (Constraint$HSide) Enum.valueOf(Constraint$HSide.class, str);
    }

    public static Constraint$HSide[] values() {
        return (Constraint$HSide[]) y.clone();
    }
}
