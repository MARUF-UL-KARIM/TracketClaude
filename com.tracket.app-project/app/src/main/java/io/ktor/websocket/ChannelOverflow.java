package io.ktor.websocket;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ChannelOverflow {
    public static final /* synthetic */ ChannelOverflow[] y = {new ChannelOverflow("SUSPEND", 0), new ChannelOverflow("CLOSE", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    ChannelOverflow EF5;

    public static ChannelOverflow valueOf(String str) {
        return (ChannelOverflow) Enum.valueOf(ChannelOverflow.class, str);
    }

    public static ChannelOverflow[] values() {
        return (ChannelOverflow[]) y.clone();
    }
}
