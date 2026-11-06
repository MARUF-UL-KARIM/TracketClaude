package org.apache.commons.math3.stat.ranking;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class TiesStrategy {
    public static final /* synthetic */ TiesStrategy[] y = {new TiesStrategy("SEQUENTIAL", 0), new TiesStrategy("MINIMUM", 1), new TiesStrategy("MAXIMUM", 2), new TiesStrategy("AVERAGE", 3), new TiesStrategy("RANDOM", 4)};

    /* JADX INFO: Fake field, exist only in values array */
    TiesStrategy EF5;

    public static TiesStrategy valueOf(String str) {
        return (TiesStrategy) Enum.valueOf(TiesStrategy.class, str);
    }

    public static TiesStrategy[] values() {
        return (TiesStrategy[]) y.clone();
    }
}
