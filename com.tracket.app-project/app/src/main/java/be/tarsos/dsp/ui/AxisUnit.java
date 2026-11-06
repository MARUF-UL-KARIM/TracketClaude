package be.tarsos.dsp.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class AxisUnit {
    public static final /* synthetic */ AxisUnit[] y = {new AxisUnit("TIME", 0), new AxisUnit("FREQUENCY", 1), new AxisUnit("AMPLITUDE", 2), new AxisUnit("OCCURENCES", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    AxisUnit EF5;

    public static AxisUnit valueOf(String str) {
        return (AxisUnit) Enum.valueOf(AxisUnit.class, str);
    }

    public static AxisUnit[] values() {
        return (AxisUnit[]) y.clone();
    }
}
