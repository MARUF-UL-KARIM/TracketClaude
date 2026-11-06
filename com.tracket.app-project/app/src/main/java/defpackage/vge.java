package defpackage;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public class vge implements Closeable {
    public static final HashMap D = new HashMap();
    public long A;
    public long B = 2147483647L;
    public long C = -2147483648L;
    public int y;
    public long z;

    public vge(String str) {
    }

    public void a() {
        this.z = SystemClock.elapsedRealtimeNanos() / 1000;
    }

    public void c(long j) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j2 = this.A;
        if (j2 != 0 && jElapsedRealtimeNanos - j2 >= 1000000) {
            this.y = 0;
            this.z = 0L;
            this.B = 2147483647L;
            this.C = -2147483648L;
        }
        this.A = jElapsedRealtimeNanos;
        this.y++;
        this.B = Math.min(this.B, j);
        this.C = Math.max(this.C, j);
        if (this.y % 50 == 0) {
            Locale locale = Locale.US;
            uke.s();
        }
        if (this.y % 500 == 0) {
            this.y = 0;
            this.z = 0L;
            this.B = 2147483647L;
            this.C = -2147483648L;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j = this.z;
        if (j != 0) {
            d(j);
        } else {
            cp2.n("Did you forget to call start()?");
        }
    }

    public void d(long j) {
        c((SystemClock.elapsedRealtimeNanos() / 1000) - j);
    }
}
