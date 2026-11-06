package androidx.constraintlayout.core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class SolverVariable$Type {
    public static final /* synthetic */ SolverVariable$Type[] y = {new SolverVariable$Type("UNRESTRICTED", 0), new SolverVariable$Type("CONSTANT", 1), new SolverVariable$Type("SLACK", 2), new SolverVariable$Type("ERROR", 3), new SolverVariable$Type("UNKNOWN", 4)};

    /* JADX INFO: Fake field, exist only in values array */
    SolverVariable$Type EF5;

    public static SolverVariable$Type valueOf(String str) {
        return (SolverVariable$Type) Enum.valueOf(SolverVariable$Type.class, str);
    }

    public static SolverVariable$Type[] values() {
        return (SolverVariable$Type[]) y.clone();
    }
}
