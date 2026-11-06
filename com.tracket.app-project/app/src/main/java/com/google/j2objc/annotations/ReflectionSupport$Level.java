package com.google.j2objc.annotations;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ReflectionSupport$Level {
    public static final /* synthetic */ ReflectionSupport$Level[] y = {new ReflectionSupport$Level("NATIVE_ONLY", 0), new ReflectionSupport$Level("FULL", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    ReflectionSupport$Level EF5;

    public static ReflectionSupport$Level valueOf(String str) {
        return (ReflectionSupport$Level) Enum.valueOf(ReflectionSupport$Level.class, str);
    }

    public static ReflectionSupport$Level[] values() {
        return (ReflectionSupport$Level[]) y.clone();
    }
}
