package com.google.errorprone.annotations;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class Modifier {
    public static final /* synthetic */ Modifier[] y = {new Modifier("PUBLIC", 0), new Modifier("PROTECTED", 1), new Modifier("PRIVATE", 2), new Modifier("ABSTRACT", 3), new Modifier("DEFAULT", 4), new Modifier("STATIC", 5), new Modifier("FINAL", 6), new Modifier("TRANSIENT", 7), new Modifier("VOLATILE", 8), new Modifier("SYNCHRONIZED", 9), new Modifier("NATIVE", 10), new Modifier("STRICTFP", 11)};

    /* JADX INFO: Fake field, exist only in values array */
    Modifier EF5;

    public static Modifier valueOf(String str) {
        return (Modifier) Enum.valueOf(Modifier.class, str);
    }

    public static Modifier[] values() {
        return (Modifier[]) y.clone();
    }
}
