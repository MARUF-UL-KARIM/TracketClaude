package androidx.constraintlayout.core.dsl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class Constraint$Behaviour {
    public static final /* synthetic */ Constraint$Behaviour[] y = {new Constraint$Behaviour("SPREAD", 0), new Constraint$Behaviour("WRAP", 1), new Constraint$Behaviour("PERCENT", 2), new Constraint$Behaviour("RATIO", 3), new Constraint$Behaviour("RESOLVED", 4)};

    /* JADX INFO: Fake field, exist only in values array */
    Constraint$Behaviour EF5;

    public static Constraint$Behaviour valueOf(String str) {
        return (Constraint$Behaviour) Enum.valueOf(Constraint$Behaviour.class, str);
    }

    public static Constraint$Behaviour[] values() {
        return (Constraint$Behaviour[]) y.clone();
    }
}
