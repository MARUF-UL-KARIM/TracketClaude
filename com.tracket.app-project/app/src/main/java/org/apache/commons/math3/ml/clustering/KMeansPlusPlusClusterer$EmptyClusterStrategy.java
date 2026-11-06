package org.apache.commons.math3.ml.clustering;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class KMeansPlusPlusClusterer$EmptyClusterStrategy {
    public static final /* synthetic */ KMeansPlusPlusClusterer$EmptyClusterStrategy[] y = {new KMeansPlusPlusClusterer$EmptyClusterStrategy("LARGEST_VARIANCE", 0), new KMeansPlusPlusClusterer$EmptyClusterStrategy("LARGEST_POINTS_NUMBER", 1), new KMeansPlusPlusClusterer$EmptyClusterStrategy("FARTHEST_POINT", 2), new KMeansPlusPlusClusterer$EmptyClusterStrategy("ERROR", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    KMeansPlusPlusClusterer$EmptyClusterStrategy EF5;

    public static KMeansPlusPlusClusterer$EmptyClusterStrategy valueOf(String str) {
        return (KMeansPlusPlusClusterer$EmptyClusterStrategy) Enum.valueOf(KMeansPlusPlusClusterer$EmptyClusterStrategy.class, str);
    }

    public static KMeansPlusPlusClusterer$EmptyClusterStrategy[] values() {
        return (KMeansPlusPlusClusterer$EmptyClusterStrategy[]) y.clone();
    }
}
