package org.checkerframework.dataflow.qual;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class Pure$Kind {
    public static final /* synthetic */ Pure$Kind[] y = {new Pure$Kind("SIDE_EFFECT_FREE", 0), new Pure$Kind("DETERMINISTIC", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    Pure$Kind EF5;

    public static Pure$Kind valueOf(String str) {
        return (Pure$Kind) Enum.valueOf(Pure$Kind.class, str);
    }

    public static Pure$Kind[] values() {
        return (Pure$Kind[]) y.clone();
    }
}
