package androidx.constraintlayout.core.widgets;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ConstraintAnchor$Type {
    public static final /* synthetic */ ConstraintAnchor$Type[] y = {new ConstraintAnchor$Type("NONE", 0), new ConstraintAnchor$Type("LEFT", 1), new ConstraintAnchor$Type("TOP", 2), new ConstraintAnchor$Type("RIGHT", 3), new ConstraintAnchor$Type("BOTTOM", 4), new ConstraintAnchor$Type("BASELINE", 5), new ConstraintAnchor$Type("CENTER", 6), new ConstraintAnchor$Type("CENTER_X", 7), new ConstraintAnchor$Type("CENTER_Y", 8)};

    /* JADX INFO: Fake field, exist only in values array */
    ConstraintAnchor$Type EF5;

    public static ConstraintAnchor$Type valueOf(String str) {
        return (ConstraintAnchor$Type) Enum.valueOf(ConstraintAnchor$Type.class, str);
    }

    public static ConstraintAnchor$Type[] values() {
        return (ConstraintAnchor$Type[]) y.clone();
    }
}
