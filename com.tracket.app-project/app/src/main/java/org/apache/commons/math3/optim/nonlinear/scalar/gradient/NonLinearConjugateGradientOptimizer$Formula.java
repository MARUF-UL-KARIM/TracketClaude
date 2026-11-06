package org.apache.commons.math3.optim.nonlinear.scalar.gradient;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class NonLinearConjugateGradientOptimizer$Formula {
    public static final /* synthetic */ NonLinearConjugateGradientOptimizer$Formula[] y = {new NonLinearConjugateGradientOptimizer$Formula("FLETCHER_REEVES", 0), new NonLinearConjugateGradientOptimizer$Formula("POLAK_RIBIERE", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    NonLinearConjugateGradientOptimizer$Formula EF5;

    public static NonLinearConjugateGradientOptimizer$Formula valueOf(String str) {
        return (NonLinearConjugateGradientOptimizer$Formula) Enum.valueOf(NonLinearConjugateGradientOptimizer$Formula.class, str);
    }

    public static NonLinearConjugateGradientOptimizer$Formula[] values() {
        return (NonLinearConjugateGradientOptimizer$Formula[]) y.clone();
    }
}
