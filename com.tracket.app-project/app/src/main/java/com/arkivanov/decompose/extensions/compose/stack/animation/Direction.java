package com.arkivanov.decompose.extensions.compose.stack.animation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class Direction {
    public static final /* synthetic */ Direction[] y = {new Direction("ENTER_FRONT", 0), new Direction("EXIT_FRONT", 1), new Direction("ENTER_BACK", 2), new Direction("EXIT_BACK", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    Direction EF5;

    public static Direction valueOf(String str) {
        return (Direction) Enum.valueOf(Direction.class, str);
    }

    public static Direction[] values() {
        return (Direction[]) y.clone();
    }
}
