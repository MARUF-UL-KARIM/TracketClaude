package androidx.constraintlayout.core.widgets.analyzer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
final class WidgetRun$RunType {
    public static final /* synthetic */ WidgetRun$RunType[] y = {new WidgetRun$RunType("NONE", 0), new WidgetRun$RunType("START", 1), new WidgetRun$RunType("END", 2), new WidgetRun$RunType("CENTER", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    WidgetRun$RunType EF5;

    public static WidgetRun$RunType valueOf(String str) {
        return (WidgetRun$RunType) Enum.valueOf(WidgetRun$RunType.class, str);
    }

    public static WidgetRun$RunType[] values() {
        return (WidgetRun$RunType[]) y.clone();
    }
}
