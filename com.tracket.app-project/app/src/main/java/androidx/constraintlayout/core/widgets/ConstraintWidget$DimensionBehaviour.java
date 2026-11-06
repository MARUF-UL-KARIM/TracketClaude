package androidx.constraintlayout.core.widgets;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ConstraintWidget$DimensionBehaviour {
    public static final /* synthetic */ ConstraintWidget$DimensionBehaviour[] y = {new ConstraintWidget$DimensionBehaviour("FIXED", 0), new ConstraintWidget$DimensionBehaviour("WRAP_CONTENT", 1), new ConstraintWidget$DimensionBehaviour("MATCH_CONSTRAINT", 2), new ConstraintWidget$DimensionBehaviour("MATCH_PARENT", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    ConstraintWidget$DimensionBehaviour EF5;

    public static ConstraintWidget$DimensionBehaviour valueOf(String str) {
        return (ConstraintWidget$DimensionBehaviour) Enum.valueOf(ConstraintWidget$DimensionBehaviour.class, str);
    }

    public static ConstraintWidget$DimensionBehaviour[] values() {
        return (ConstraintWidget$DimensionBehaviour[]) y.clone();
    }
}
