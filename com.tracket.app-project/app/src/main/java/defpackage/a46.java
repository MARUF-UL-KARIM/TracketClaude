package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class a46 {
    public static final a46 d = new a46(1.0f, 1.0f);
    public final float a;
    public final float b;
    public final int c;

    static {
        te9.w(0);
        te9.w(1);
    }

    public a46(float f, float f2) {
        iyd.g(f > 0.0f);
        iyd.g(f2 > 0.0f);
        this.a = f;
        this.b = f2;
        this.c = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a46.class == obj.getClass()) {
            a46 a46Var = (a46) obj;
            if (this.a == a46Var.a && this.b == a46Var.b) {
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
        String str = te9.a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
