package androidx.annotation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class InspectableProperty$ValueType {
    public static final /* synthetic */ InspectableProperty$ValueType[] y = {new InspectableProperty$ValueType("NONE", 0), new InspectableProperty$ValueType("INFERRED", 1), new InspectableProperty$ValueType("INT_ENUM", 2), new InspectableProperty$ValueType("INT_FLAG", 3), new InspectableProperty$ValueType("COLOR", 4), new InspectableProperty$ValueType("GRAVITY", 5), new InspectableProperty$ValueType("RESOURCE_ID", 6)};

    /* JADX INFO: Fake field, exist only in values array */
    InspectableProperty$ValueType EF5;

    public static InspectableProperty$ValueType valueOf(String str) {
        return (InspectableProperty$ValueType) Enum.valueOf(InspectableProperty$ValueType.class, str);
    }

    public static InspectableProperty$ValueType[] values() {
        return (InspectableProperty$ValueType[]) y.clone();
    }
}
