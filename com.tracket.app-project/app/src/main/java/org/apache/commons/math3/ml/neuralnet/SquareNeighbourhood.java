package org.apache.commons.math3.ml.neuralnet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class SquareNeighbourhood {
    public static final /* synthetic */ SquareNeighbourhood[] y = {new SquareNeighbourhood("VON_NEUMANN", 0), new SquareNeighbourhood("MOORE", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    SquareNeighbourhood EF5;

    public static SquareNeighbourhood valueOf(String str) {
        return (SquareNeighbourhood) Enum.valueOf(SquareNeighbourhood.class, str);
    }

    public static SquareNeighbourhood[] values() {
        return (SquareNeighbourhood[]) y.clone();
    }
}
