package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class kta {
    public static final kta d = new kta(1.0f, 1.0f);
    public final float a;
    public final float b;
    public final int c;

    static {
        String str = vqc.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public kta(float f, float f2) {
        oke.d(f > 0.0f);
        oke.d(f2 > 0.0f);
        this.a = f;
        this.b = f2;
        this.c = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kta.class == obj.getClass()) {
            kta ktaVar = (kta) obj;
            if (this.a == ktaVar.a && this.b == ktaVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.b) + ((Float.floatToRawIntBits(this.a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.a), Float.valueOf(this.b)};
        String str = vqc.a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
