package org.apache.commons.math3.stat.ranking;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class NaNStrategy {
    public static final /* synthetic */ NaNStrategy[] y = {new NaNStrategy("MINIMAL", 0), new NaNStrategy("MAXIMAL", 1), new NaNStrategy("REMOVED", 2), new NaNStrategy("FIXED", 3), new NaNStrategy("FAILED", 4)};

    /* JADX INFO: Fake field, exist only in values array */
    NaNStrategy EF5;

    public static NaNStrategy valueOf(String str) {
        return (NaNStrategy) Enum.valueOf(NaNStrategy.class, str);
    }

    public static NaNStrategy[] values() {
        return (NaNStrategy[]) y.clone();
    }
}
