package defpackage;

import android.os.VibrationEffect;
import android.os.Vibrator;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class d18 {
    public static final d18 a = new d18();
    public static final fp8 b = new fp8(new c97(20));

    public static void a() {
        try {
            ((Vibrator) b.getValue()).vibrate(VibrationEffect.createOneShot(45L, -1));
        } catch (Throwable unused) {
        }
    }
}
