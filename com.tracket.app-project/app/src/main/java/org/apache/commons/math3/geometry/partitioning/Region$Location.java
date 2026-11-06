package org.apache.commons.math3.geometry.partitioning;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class Region$Location {
    public static final /* synthetic */ Region$Location[] y = {new Region$Location("INSIDE", 0), new Region$Location("OUTSIDE", 1), new Region$Location("BOUNDARY", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    Region$Location EF5;

    public static Region$Location valueOf(String str) {
        return (Region$Location) Enum.valueOf(Region$Location.class, str);
    }

    public static Region$Location[] values() {
        return (Region$Location[]) y.clone();
    }
}
