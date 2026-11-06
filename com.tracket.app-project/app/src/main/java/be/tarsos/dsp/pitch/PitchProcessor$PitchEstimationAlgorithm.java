package be.tarsos.dsp.pitch;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class PitchProcessor$PitchEstimationAlgorithm {
    public static final /* synthetic */ PitchProcessor$PitchEstimationAlgorithm[] y = {new PitchProcessor$PitchEstimationAlgorithm("YIN", 0), new PitchProcessor$PitchEstimationAlgorithm("MPM", 1), new PitchProcessor$PitchEstimationAlgorithm("FFT_YIN", 2), new PitchProcessor$PitchEstimationAlgorithm("DYNAMIC_WAVELET", 3), new PitchProcessor$PitchEstimationAlgorithm("FFT_PITCH", 4), new PitchProcessor$PitchEstimationAlgorithm("AMDF", 5)};

    /* JADX INFO: Fake field, exist only in values array */
    PitchProcessor$PitchEstimationAlgorithm EF5;

    public static PitchProcessor$PitchEstimationAlgorithm valueOf(String str) {
        return (PitchProcessor$PitchEstimationAlgorithm) Enum.valueOf(PitchProcessor$PitchEstimationAlgorithm.class, str);
    }

    public static PitchProcessor$PitchEstimationAlgorithm[] values() {
        return (PitchProcessor$PitchEstimationAlgorithm[]) y.clone();
    }
}
