package io.ktor.websocket;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
final class WebSocketReader$State {
    public static final /* synthetic */ WebSocketReader$State[] y = {new WebSocketReader$State("HEADER", 0), new WebSocketReader$State("BODY", 1), new WebSocketReader$State("CLOSED", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    WebSocketReader$State EF5;

    public static WebSocketReader$State valueOf(String str) {
        return (WebSocketReader$State) Enum.valueOf(WebSocketReader$State.class, str);
    }

    public static WebSocketReader$State[] values() {
        return (WebSocketReader$State[]) y.clone();
    }
}
