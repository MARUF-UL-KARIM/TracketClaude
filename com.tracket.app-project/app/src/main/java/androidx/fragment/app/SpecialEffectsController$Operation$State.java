package androidx.fragment.app;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class SpecialEffectsController$Operation$State {
    public static final /* synthetic */ SpecialEffectsController$Operation$State[] y = {new SpecialEffectsController$Operation$State("REMOVED", 0), new SpecialEffectsController$Operation$State("VISIBLE", 1), new SpecialEffectsController$Operation$State("GONE", 2), new SpecialEffectsController$Operation$State("INVISIBLE", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    SpecialEffectsController$Operation$State EF5;

    public static SpecialEffectsController$Operation$State valueOf(String str) {
        return (SpecialEffectsController$Operation$State) Enum.valueOf(SpecialEffectsController$Operation$State.class, str);
    }

    public static SpecialEffectsController$Operation$State[] values() {
        return (SpecialEffectsController$Operation$State[]) y.clone();
    }
}
