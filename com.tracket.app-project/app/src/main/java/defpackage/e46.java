package defpackage;

import com.tracket.editor.dto.Visual$Video;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class e46 {
    public static final int d = Visual$Video.C;
    public final long a;
    public final boolean b;
    public final Visual$Video c;

    public /* synthetic */ e46(long j, Visual$Video visual$Video, int i) {
        this((i & 1) != 0 ? 0L : j, (i & 4) != 0 ? null : visual$Video, false);
    }

    public static e46 a(e46 e46Var, long j, boolean z, Visual$Video visual$Video, int i) {
        if ((i & 1) != 0) {
            j = e46Var.a;
        }
        if ((i & 2) != 0) {
            z = e46Var.b;
        }
        if ((i & 4) != 0) {
            visual$Video = e46Var.c;
        }
        e46Var.getClass();
        return new e46(j, visual$Video, z);
    }

    public final long b() {
        Visual$Video visual$Video = this.c;
        if (visual$Video != null) {
            return visual$Video.d(this.a);
        }
        return 0L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e46)) {
            return false;
        }
        e46 e46Var = (e46) obj;
        return this.a == e46Var.a && this.b == e46Var.b && ff4.h(this.c, e46Var.c);
    }

    public final int hashCode() {
        int iE = ot5.e(Long.hashCode(this.a) * 31, 31, this.b);
        Visual$Video visual$Video = this.c;
        return iE + (visual$Video == null ? 0 : visual$Video.hashCode());
    }

    public final String toString() {
        return "PlaybackState(positionUs=" + this.a + ", isPlaying=" + this.b + ", activeClip=" + this.c + ")";
    }

    public e46(long j, Visual$Video visual$Video, boolean z) {
        this.a = j;
        this.b = z;
        this.c = visual$Video;
    }
}
