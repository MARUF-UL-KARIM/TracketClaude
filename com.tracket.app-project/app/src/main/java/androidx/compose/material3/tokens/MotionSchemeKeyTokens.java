package androidx.compose.material3.tokens;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class MotionSchemeKeyTokens {
    public static final MotionSchemeKeyTokens A;
    public static final /* synthetic */ MotionSchemeKeyTokens[] B;
    public static final MotionSchemeKeyTokens y;
    public static final MotionSchemeKeyTokens z;

    /* JADX INFO: Fake field, exist only in values array */
    MotionSchemeKeyTokens EF0;

    static {
        MotionSchemeKeyTokens motionSchemeKeyTokens = new MotionSchemeKeyTokens("DefaultSpatial", 0);
        MotionSchemeKeyTokens motionSchemeKeyTokens2 = new MotionSchemeKeyTokens("FastSpatial", 1);
        y = motionSchemeKeyTokens2;
        MotionSchemeKeyTokens motionSchemeKeyTokens3 = new MotionSchemeKeyTokens("SlowSpatial", 2);
        MotionSchemeKeyTokens motionSchemeKeyTokens4 = new MotionSchemeKeyTokens("DefaultEffects", 3);
        z = motionSchemeKeyTokens4;
        MotionSchemeKeyTokens motionSchemeKeyTokens5 = new MotionSchemeKeyTokens("FastEffects", 4);
        A = motionSchemeKeyTokens5;
        B = new MotionSchemeKeyTokens[]{motionSchemeKeyTokens, motionSchemeKeyTokens2, motionSchemeKeyTokens3, motionSchemeKeyTokens4, motionSchemeKeyTokens5, new MotionSchemeKeyTokens("SlowEffects", 5)};
    }

    public static MotionSchemeKeyTokens valueOf(String str) {
        return (MotionSchemeKeyTokens) Enum.valueOf(MotionSchemeKeyTokens.class, str);
    }

    public static MotionSchemeKeyTokens[] values() {
        return (MotionSchemeKeyTokens[]) B.clone();
    }
}
