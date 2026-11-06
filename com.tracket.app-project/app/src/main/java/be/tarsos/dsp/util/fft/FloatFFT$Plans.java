package be.tarsos.dsp.util.fft;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
final class FloatFFT$Plans {
    public static final /* synthetic */ FloatFFT$Plans[] y = {new FloatFFT$Plans("SPLIT_RADIX", 0), new FloatFFT$Plans("MIXED_RADIX", 1), new FloatFFT$Plans("BLUESTEIN", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    FloatFFT$Plans EF5;

    public static FloatFFT$Plans valueOf(String str) {
        return (FloatFFT$Plans) Enum.valueOf(FloatFFT$Plans.class, str);
    }

    public static FloatFFT$Plans[] values() {
        return (FloatFFT$Plans[]) y.clone();
    }
}
