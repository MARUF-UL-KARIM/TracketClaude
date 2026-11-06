package org.koin.core.logger;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class Level {
    public static final Level A;
    public static final Level B;
    public static final /* synthetic */ Level[] C;
    public static final Level y;
    public static final Level z;

    static {
        Level level = new Level("DEBUG", 0);
        y = level;
        Level level2 = new Level("INFO", 1);
        Level level3 = new Level("WARNING", 2);
        z = level3;
        Level level4 = new Level("ERROR", 3);
        A = level4;
        Level level5 = new Level("NONE", 4);
        B = level5;
        C = new Level[]{level, level2, level3, level4, level5};
    }

    public static Level valueOf(String str) {
        return (Level) Enum.valueOf(Level.class, str);
    }

    public static Level[] values() {
        return (Level[]) C.clone();
    }
}
