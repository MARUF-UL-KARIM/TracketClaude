package defpackage;

import android.media.AudioAttributes;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class yw {
    public static final yw c = new yw(0);
    public final int a;
    public AudioAttributes b;

    static {
        iu1.r(0, 1, 2, 3, 4);
        te9.w(5);
        te9.w(6);
    }

    public yw(int i) {
        this.a = i;
    }

    public final AudioAttributes a() {
        AudioAttributes audioAttributes = this.b;
        if (audioAttributes != null) {
            return audioAttributes;
        }
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.a).setFlags(0).setUsage(1);
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            usage.setAllowedCapturePolicy(1);
            usage.setHapticChannelsMuted(true);
        }
        if (i >= 32) {
            usage.setSpatializationBehavior(0);
            usage.setIsContentSpatialized(false);
        }
        AudioAttributes audioAttributesBuild = usage.build();
        this.b = audioAttributesBuild;
        return audioAttributesBuild;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && yw.class == obj.getClass() && this.a == ((yw) obj).a;
    }

    public final int hashCode() {
        return ((((((527 + this.a) * 961) + 1) * 31) + 1) * 29791) + 1;
    }
}
