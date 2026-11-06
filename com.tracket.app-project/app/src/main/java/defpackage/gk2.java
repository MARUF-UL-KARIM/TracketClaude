package defpackage;

import android.os.Build;
import android.view.DisplayCutout;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class gk2 {
    public final DisplayCutout a;

    public gk2(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final oa4 a() {
        return Build.VERSION.SDK_INT >= 30 ? oa4.d(q3.d(this.a)) : oa4.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gk2.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((gk2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
