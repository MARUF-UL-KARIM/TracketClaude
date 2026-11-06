package androidx.core.graphics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class BlendModeCompat {
    public static final BlendModeCompat A;
    public static final BlendModeCompat B;
    public static final BlendModeCompat C;
    public static final BlendModeCompat D;
    public static final BlendModeCompat E;
    public static final /* synthetic */ BlendModeCompat[] F;
    public static final BlendModeCompat y;
    public static final BlendModeCompat z;

    /* JADX INFO: Fake field, exist only in values array */
    BlendModeCompat EF1;

    static {
        BlendModeCompat blendModeCompat = new BlendModeCompat("CLEAR", 0);
        BlendModeCompat blendModeCompat2 = new BlendModeCompat("SRC", 1);
        BlendModeCompat blendModeCompat3 = new BlendModeCompat("DST", 2);
        BlendModeCompat blendModeCompat4 = new BlendModeCompat("SRC_OVER", 3);
        BlendModeCompat blendModeCompat5 = new BlendModeCompat("DST_OVER", 4);
        BlendModeCompat blendModeCompat6 = new BlendModeCompat("SRC_IN", 5);
        BlendModeCompat blendModeCompat7 = new BlendModeCompat("DST_IN", 6);
        BlendModeCompat blendModeCompat8 = new BlendModeCompat("SRC_OUT", 7);
        BlendModeCompat blendModeCompat9 = new BlendModeCompat("DST_OUT", 8);
        BlendModeCompat blendModeCompat10 = new BlendModeCompat("SRC_ATOP", 9);
        BlendModeCompat blendModeCompat11 = new BlendModeCompat("DST_ATOP", 10);
        BlendModeCompat blendModeCompat12 = new BlendModeCompat("XOR", 11);
        BlendModeCompat blendModeCompat13 = new BlendModeCompat("PLUS", 12);
        y = blendModeCompat13;
        BlendModeCompat blendModeCompat14 = new BlendModeCompat("MODULATE", 13);
        z = blendModeCompat14;
        BlendModeCompat blendModeCompat15 = new BlendModeCompat("SCREEN", 14);
        A = blendModeCompat15;
        BlendModeCompat blendModeCompat16 = new BlendModeCompat("OVERLAY", 15);
        B = blendModeCompat16;
        BlendModeCompat blendModeCompat17 = new BlendModeCompat("DARKEN", 16);
        C = blendModeCompat17;
        BlendModeCompat blendModeCompat18 = new BlendModeCompat("LIGHTEN", 17);
        D = blendModeCompat18;
        BlendModeCompat blendModeCompat19 = new BlendModeCompat("COLOR_DODGE", 18);
        BlendModeCompat blendModeCompat20 = new BlendModeCompat("COLOR_BURN", 19);
        BlendModeCompat blendModeCompat21 = new BlendModeCompat("HARD_LIGHT", 20);
        BlendModeCompat blendModeCompat22 = new BlendModeCompat("SOFT_LIGHT", 21);
        BlendModeCompat blendModeCompat23 = new BlendModeCompat("DIFFERENCE", 22);
        BlendModeCompat blendModeCompat24 = new BlendModeCompat("EXCLUSION", 23);
        BlendModeCompat blendModeCompat25 = new BlendModeCompat("MULTIPLY", 24);
        E = blendModeCompat25;
        F = new BlendModeCompat[]{blendModeCompat, blendModeCompat2, blendModeCompat3, blendModeCompat4, blendModeCompat5, blendModeCompat6, blendModeCompat7, blendModeCompat8, blendModeCompat9, blendModeCompat10, blendModeCompat11, blendModeCompat12, blendModeCompat13, blendModeCompat14, blendModeCompat15, blendModeCompat16, blendModeCompat17, blendModeCompat18, blendModeCompat19, blendModeCompat20, blendModeCompat21, blendModeCompat22, blendModeCompat23, blendModeCompat24, blendModeCompat25, new BlendModeCompat("HUE", 25), new BlendModeCompat("SATURATION", 26), new BlendModeCompat("COLOR", 27), new BlendModeCompat("LUMINOSITY", 28)};
    }

    public static BlendModeCompat valueOf(String str) {
        return (BlendModeCompat) Enum.valueOf(BlendModeCompat.class, str);
    }

    public static BlendModeCompat[] values() {
        return (BlendModeCompat[]) F.clone();
    }
}
