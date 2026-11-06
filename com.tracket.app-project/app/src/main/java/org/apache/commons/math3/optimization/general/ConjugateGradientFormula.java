package org.apache.commons.math3.optimization.general;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ConjugateGradientFormula {
    public static final /* synthetic */ ConjugateGradientFormula[] y = {new ConjugateGradientFormula("FLETCHER_REEVES", 0), new ConjugateGradientFormula("POLAK_RIBIERE", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    ConjugateGradientFormula EF5;

    public static ConjugateGradientFormula valueOf(String str) {
        return (ConjugateGradientFormula) Enum.valueOf(ConjugateGradientFormula.class, str);
    }

    public static ConjugateGradientFormula[] values() {
        return (ConjugateGradientFormula[]) y.clone();
    }
}
