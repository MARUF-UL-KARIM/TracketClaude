package org.apache.commons.math3.analysis.solvers;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class BaseSecantSolver$Method {
    public static final /* synthetic */ BaseSecantSolver$Method[] y = {new BaseSecantSolver$Method("REGULA_FALSI", 0), new BaseSecantSolver$Method("ILLINOIS", 1), new BaseSecantSolver$Method("PEGASUS", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    BaseSecantSolver$Method EF5;

    public static BaseSecantSolver$Method valueOf(String str) {
        return (BaseSecantSolver$Method) Enum.valueOf(BaseSecantSolver$Method.class, str);
    }

    public static BaseSecantSolver$Method[] values() {
        return (BaseSecantSolver$Method[]) y.clone();
    }
}
