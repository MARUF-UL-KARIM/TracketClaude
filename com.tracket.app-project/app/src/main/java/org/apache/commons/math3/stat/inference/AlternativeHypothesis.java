package org.apache.commons.math3.stat.inference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class AlternativeHypothesis {
    public static final /* synthetic */ AlternativeHypothesis[] y = {new AlternativeHypothesis("TWO_SIDED", 0), new AlternativeHypothesis("GREATER_THAN", 1), new AlternativeHypothesis("LESS_THAN", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    AlternativeHypothesis EF5;

    public static AlternativeHypothesis valueOf(String str) {
        return (AlternativeHypothesis) Enum.valueOf(AlternativeHypothesis.class, str);
    }

    public static AlternativeHypothesis[] values() {
        return (AlternativeHypothesis[]) y.clone();
    }
}
