package androidx.media3.exoplayer.source;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
final class ProgressiveMediaPeriod$ControlledTrackOutput$OutputMode {
    public static final ProgressiveMediaPeriod$ControlledTrackOutput$OutputMode A;
    public static final /* synthetic */ ProgressiveMediaPeriod$ControlledTrackOutput$OutputMode[] B;
    public static final ProgressiveMediaPeriod$ControlledTrackOutput$OutputMode y;
    public static final ProgressiveMediaPeriod$ControlledTrackOutput$OutputMode z;

    static {
        ProgressiveMediaPeriod$ControlledTrackOutput$OutputMode progressiveMediaPeriod$ControlledTrackOutput$OutputMode = new ProgressiveMediaPeriod$ControlledTrackOutput$OutputMode("PASS_THROUGH", 0);
        y = progressiveMediaPeriod$ControlledTrackOutput$OutputMode;
        ProgressiveMediaPeriod$ControlledTrackOutput$OutputMode progressiveMediaPeriod$ControlledTrackOutput$OutputMode2 = new ProgressiveMediaPeriod$ControlledTrackOutput$OutputMode("DISCARD_AFTER_NEXT_SAMPLE_METADATA", 1);
        z = progressiveMediaPeriod$ControlledTrackOutput$OutputMode2;
        ProgressiveMediaPeriod$ControlledTrackOutput$OutputMode progressiveMediaPeriod$ControlledTrackOutput$OutputMode3 = new ProgressiveMediaPeriod$ControlledTrackOutput$OutputMode("DISCARDING", 2);
        A = progressiveMediaPeriod$ControlledTrackOutput$OutputMode3;
        B = new ProgressiveMediaPeriod$ControlledTrackOutput$OutputMode[]{progressiveMediaPeriod$ControlledTrackOutput$OutputMode, progressiveMediaPeriod$ControlledTrackOutput$OutputMode2, progressiveMediaPeriod$ControlledTrackOutput$OutputMode3};
    }

    public static ProgressiveMediaPeriod$ControlledTrackOutput$OutputMode valueOf(String str) {
        return (ProgressiveMediaPeriod$ControlledTrackOutput$OutputMode) Enum.valueOf(ProgressiveMediaPeriod$ControlledTrackOutput$OutputMode.class, str);
    }

    public static ProgressiveMediaPeriod$ControlledTrackOutput$OutputMode[] values() {
        return (ProgressiveMediaPeriod$ControlledTrackOutput$OutputMode[]) B.clone();
    }
}
