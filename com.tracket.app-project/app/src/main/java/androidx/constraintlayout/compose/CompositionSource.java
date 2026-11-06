package androidx.constraintlayout.compose;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class CompositionSource {
    public static final /* synthetic */ CompositionSource[] y = {new CompositionSource("Unknown", 0), new CompositionSource("Content", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    CompositionSource EF5;

    public static CompositionSource valueOf(String str) {
        return (CompositionSource) Enum.valueOf(CompositionSource.class, str);
    }

    public static CompositionSource[] values() {
        return (CompositionSource[]) y.clone();
    }
}
