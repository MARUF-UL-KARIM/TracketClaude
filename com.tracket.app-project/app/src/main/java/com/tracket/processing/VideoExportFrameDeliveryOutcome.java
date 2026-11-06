package com.tracket.processing;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class VideoExportFrameDeliveryOutcome {
    public static final VideoExportFrameDeliveryOutcome A;
    public static final /* synthetic */ VideoExportFrameDeliveryOutcome[] B;
    public static final VideoExportFrameDeliveryOutcome y;
    public static final VideoExportFrameDeliveryOutcome z;

    static {
        VideoExportFrameDeliveryOutcome videoExportFrameDeliveryOutcome = new VideoExportFrameDeliveryOutcome("COMPLETED", 0);
        y = videoExportFrameDeliveryOutcome;
        VideoExportFrameDeliveryOutcome videoExportFrameDeliveryOutcome2 = new VideoExportFrameDeliveryOutcome("FAILED", 1);
        z = videoExportFrameDeliveryOutcome2;
        VideoExportFrameDeliveryOutcome videoExportFrameDeliveryOutcome3 = new VideoExportFrameDeliveryOutcome("FAILED_NO_VALID_MAIN_FRAME", 2);
        A = videoExportFrameDeliveryOutcome3;
        B = new VideoExportFrameDeliveryOutcome[]{videoExportFrameDeliveryOutcome, videoExportFrameDeliveryOutcome2, videoExportFrameDeliveryOutcome3, new VideoExportFrameDeliveryOutcome("CANCELLED", 3)};
    }

    public static VideoExportFrameDeliveryOutcome valueOf(String str) {
        return (VideoExportFrameDeliveryOutcome) Enum.valueOf(VideoExportFrameDeliveryOutcome.class, str);
    }

    public static VideoExportFrameDeliveryOutcome[] values() {
        return (VideoExportFrameDeliveryOutcome[]) B.clone();
    }
}
