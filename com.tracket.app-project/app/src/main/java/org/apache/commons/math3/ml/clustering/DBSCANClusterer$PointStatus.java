package org.apache.commons.math3.ml.clustering;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
final class DBSCANClusterer$PointStatus {
    public static final /* synthetic */ DBSCANClusterer$PointStatus[] y = {new DBSCANClusterer$PointStatus("NOISE", 0), new DBSCANClusterer$PointStatus("PART_OF_CLUSTER", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    DBSCANClusterer$PointStatus EF5;

    public static DBSCANClusterer$PointStatus valueOf(String str) {
        return (DBSCANClusterer$PointStatus) Enum.valueOf(DBSCANClusterer$PointStatus.class, str);
    }

    public static DBSCANClusterer$PointStatus[] values() {
        return (DBSCANClusterer$PointStatus[]) y.clone();
    }
}
