package be.tarsos.dsp.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class Axis {
    public static final /* synthetic */ Axis[] y = {new Axis("X", 0), new Axis("Y", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    Axis EF5;

    public static Axis valueOf(String str) {
        return (Axis) Enum.valueOf(Axis.class, str);
    }

    public static Axis[] values() {
        return (Axis[]) y.clone();
    }
}
