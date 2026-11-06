package org.apache.commons.math3.ml.neuralnet.twod;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class NeuronSquareMesh2D$VerticalDirection {
    public static final /* synthetic */ NeuronSquareMesh2D$VerticalDirection[] y = {new NeuronSquareMesh2D$VerticalDirection("UP", 0), new NeuronSquareMesh2D$VerticalDirection("CENTER", 1), new NeuronSquareMesh2D$VerticalDirection("DOWN", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    NeuronSquareMesh2D$VerticalDirection EF5;

    public static NeuronSquareMesh2D$VerticalDirection valueOf(String str) {
        return (NeuronSquareMesh2D$VerticalDirection) Enum.valueOf(NeuronSquareMesh2D$VerticalDirection.class, str);
    }

    public static NeuronSquareMesh2D$VerticalDirection[] values() {
        return (NeuronSquareMesh2D$VerticalDirection[]) y.clone();
    }
}
