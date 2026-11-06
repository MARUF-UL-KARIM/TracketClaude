package io.ktor.utils.io;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class LineEnding {
    public static final /* synthetic */ LineEnding[] y = {new LineEnding("Default", 0), new LineEnding("Lenient", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    LineEnding EF5;

    public static LineEnding valueOf(String str) {
        return (LineEnding) Enum.valueOf(LineEnding.class, str);
    }

    public static LineEnding[] values() {
        return (LineEnding[]) y.clone();
    }
}
