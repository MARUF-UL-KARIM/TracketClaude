package com.google.common.flogger.backend;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
final class SimpleMessageFormatter$Option {
    public static final /* synthetic */ SimpleMessageFormatter$Option[] y = {new SimpleMessageFormatter$Option("DEFAULT", 0), new SimpleMessageFormatter$Option("WITH_LOG_SITE", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    SimpleMessageFormatter$Option EF5;

    public static SimpleMessageFormatter$Option valueOf(String str) {
        return (SimpleMessageFormatter$Option) Enum.valueOf(SimpleMessageFormatter$Option.class, str);
    }

    public static SimpleMessageFormatter$Option[] values() {
        return (SimpleMessageFormatter$Option[]) y.clone();
    }
}
