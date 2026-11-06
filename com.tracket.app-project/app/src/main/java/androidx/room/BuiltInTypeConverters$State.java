package androidx.room;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class BuiltInTypeConverters$State {
    public static final /* synthetic */ BuiltInTypeConverters$State[] y = {new BuiltInTypeConverters$State("ENABLED", 0), new BuiltInTypeConverters$State("DISABLED", 1), new BuiltInTypeConverters$State("INHERITED", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    BuiltInTypeConverters$State EF5;

    public static BuiltInTypeConverters$State valueOf(String str) {
        return (BuiltInTypeConverters$State) Enum.valueOf(BuiltInTypeConverters$State.class, str);
    }

    public static BuiltInTypeConverters$State[] values() {
        return (BuiltInTypeConverters$State[]) y.clone();
    }
}
