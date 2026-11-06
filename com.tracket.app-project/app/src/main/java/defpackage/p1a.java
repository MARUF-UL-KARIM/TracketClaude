package defpackage;

import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class p1a {
    public final wx0 a;
    public final float b;

    public p1a(Rect rect, float f) {
        this.a = new wx0(rect);
        this.b = f;
    }

    public final Rect a() {
        wx0 wx0Var = this.a;
        wx0Var.getClass();
        return new Rect(wx0Var.a, wx0Var.b, wx0Var.c, wx0Var.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p1a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        p1a p1aVar = (p1a) obj;
        return ff4.h(this.a, p1aVar.a) && this.b == p1aVar.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WindowMetrics(_bounds=");
        sb.append(this.a);
        sb.append(", density=");
        return iu1.j(sb, this.b, ')');
    }

    public p1a(wx0 wx0Var, float f) {
        this.a = wx0Var;
        this.b = f;
    }
}
