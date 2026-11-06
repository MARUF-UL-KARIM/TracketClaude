package org.apache.commons.math3.ml.neuralnet.twod;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class NeuronSquareMesh2D$HorizontalDirection {
    public static final /* synthetic */ NeuronSquareMesh2D$HorizontalDirection[] y = {new NeuronSquareMesh2D$HorizontalDirection("RIGHT", 0), new NeuronSquareMesh2D$HorizontalDirection("CENTER", 1), new NeuronSquareMesh2D$HorizontalDirection("LEFT", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    NeuronSquareMesh2D$HorizontalDirection EF5;

    public static NeuronSquareMesh2D$HorizontalDirection valueOf(String str) {
        return (NeuronSquareMesh2D$HorizontalDirection) Enum.valueOf(NeuronSquareMesh2D$HorizontalDirection.class, str);
    }

    public static NeuronSquareMesh2D$HorizontalDirection[] values() {
        return (NeuronSquareMesh2D$HorizontalDirection[]) y.clone();
    }
}
