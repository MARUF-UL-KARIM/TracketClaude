package com.tracket.editor.preview;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class PlayerBarrierOperation {
    public static final PlayerBarrierOperation A;
    public static final /* synthetic */ PlayerBarrierOperation[] B;
    public static final PlayerBarrierOperation y;
    public static final PlayerBarrierOperation z;

    static {
        PlayerBarrierOperation playerBarrierOperation = new PlayerBarrierOperation("RELEASE", 0);
        y = playerBarrierOperation;
        PlayerBarrierOperation playerBarrierOperation2 = new PlayerBarrierOperation("RESTORE", 1);
        z = playerBarrierOperation2;
        PlayerBarrierOperation playerBarrierOperation3 = new PlayerBarrierOperation("TOOL_PREVIEW", 2);
        A = playerBarrierOperation3;
        B = new PlayerBarrierOperation[]{playerBarrierOperation, playerBarrierOperation2, playerBarrierOperation3};
    }

    public static PlayerBarrierOperation valueOf(String str) {
        return (PlayerBarrierOperation) Enum.valueOf(PlayerBarrierOperation.class, str);
    }

    public static PlayerBarrierOperation[] values() {
        return (PlayerBarrierOperation[]) B.clone();
    }
}
