package com.tracket.paywall;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class InitState {
    public static final InitState A;
    public static final /* synthetic */ InitState[] B;
    public static final InitState y;
    public static final InitState z;

    static {
        InitState initState = new InitState("LOADING", 0);
        y = initState;
        InitState initState2 = new InitState("READY", 1);
        z = initState2;
        InitState initState3 = new InitState("FAILED", 2);
        A = initState3;
        B = new InitState[]{initState, initState2, initState3};
    }

    public static InitState valueOf(String str) {
        return (InitState) Enum.valueOf(InitState.class, str);
    }

    public static InitState[] values() {
        return (InitState[]) B.clone();
    }
}
