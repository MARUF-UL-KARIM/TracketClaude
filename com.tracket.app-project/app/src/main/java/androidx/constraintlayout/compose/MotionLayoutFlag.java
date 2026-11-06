package androidx.constraintlayout.compose;

import defpackage.de2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
@de2
public final class MotionLayoutFlag {
    public static final /* synthetic */ MotionLayoutFlag[] y = {new MotionLayoutFlag("Default", 0), new MotionLayoutFlag("FullMeasure", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    MotionLayoutFlag EF5;

    public static MotionLayoutFlag valueOf(String str) {
        return (MotionLayoutFlag) Enum.valueOf(MotionLayoutFlag.class, str);
    }

    public static MotionLayoutFlag[] values() {
        return (MotionLayoutFlag[]) y.clone();
    }
}
