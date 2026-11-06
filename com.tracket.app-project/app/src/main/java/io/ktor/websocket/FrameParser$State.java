package io.ktor.websocket;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class FrameParser$State {
    public static final /* synthetic */ FrameParser$State[] y = {new FrameParser$State("HEADER0", 0), new FrameParser$State("LENGTH", 1), new FrameParser$State("MASK_KEY", 2), new FrameParser$State("BODY", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    FrameParser$State EF5;

    public static FrameParser$State valueOf(String str) {
        return (FrameParser$State) Enum.valueOf(FrameParser$State.class, str);
    }

    public static FrameParser$State[] values() {
        return (FrameParser$State[]) y.clone();
    }
}
