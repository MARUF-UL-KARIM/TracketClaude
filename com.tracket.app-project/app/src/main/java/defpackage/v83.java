package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class v83 {
    public final float a;
    public final float b;
    public final int c;

    public v83(float f, float f2, int i) {
        this.a = f;
        this.b = f2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v83)) {
            return false;
        }
        v83 v83Var = (v83) obj;
        return Float.compare(this.a, v83Var.a) == 0 && Float.compare(this.b, v83Var.b) == 0 && this.c == v83Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + zd2.a(Float.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        return zd2.o(wd0.r("ExpressTicketTouchSample(centerX=", this.a, ", centerY=", this.b, ", pointerCount="), this.c, ")");
    }

    public /* synthetic */ v83() {
        this(0.0f, 0.0f, 0);
    }
}
