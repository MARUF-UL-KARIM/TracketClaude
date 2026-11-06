package com.google.common.collect;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
final class AbstractIterator$State {
    public static final AbstractIterator$State A;
    public static final AbstractIterator$State B;
    public static final /* synthetic */ AbstractIterator$State[] C;
    public static final AbstractIterator$State y;
    public static final AbstractIterator$State z;

    static {
        AbstractIterator$State abstractIterator$State = new AbstractIterator$State("READY", 0);
        y = abstractIterator$State;
        AbstractIterator$State abstractIterator$State2 = new AbstractIterator$State("NOT_READY", 1);
        z = abstractIterator$State2;
        AbstractIterator$State abstractIterator$State3 = new AbstractIterator$State("DONE", 2);
        A = abstractIterator$State3;
        AbstractIterator$State abstractIterator$State4 = new AbstractIterator$State("FAILED", 3);
        B = abstractIterator$State4;
        C = new AbstractIterator$State[]{abstractIterator$State, abstractIterator$State2, abstractIterator$State3, abstractIterator$State4};
    }

    public static AbstractIterator$State valueOf(String str) {
        return (AbstractIterator$State) Enum.valueOf(AbstractIterator$State.class, str);
    }

    public static AbstractIterator$State[] values() {
        return (AbstractIterator$State[]) C.clone();
    }
}
