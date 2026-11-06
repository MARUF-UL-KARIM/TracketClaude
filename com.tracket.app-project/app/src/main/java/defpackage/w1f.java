package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class w1f {
    public final String a;
    public final boolean b;
    public final boolean c;

    public w1f(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != w1f.class) {
            return false;
        }
        w1f w1fVar = (w1f) obj;
        return TextUtils.equals(this.a, w1fVar.a) && this.b == w1fVar.b && this.c == w1fVar.c;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() + 31) * 31) + (true != this.b ? 1237 : 1231)) * 31) + (true != this.c ? 1237 : 1231);
    }
}
