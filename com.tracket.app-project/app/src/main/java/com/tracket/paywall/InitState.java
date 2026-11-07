package com.tracket.paywall;

public enum InitState {
    LOADING,
    READY,
    FAILED;

    public static final InitState y = LOADING;
    public static final InitState z = READY;
    public static final InitState A = FAILED;
}
