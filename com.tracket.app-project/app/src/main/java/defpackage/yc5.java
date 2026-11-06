package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class yc5 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final ArrayList g;

    public yc5(float f, float f2, float f3, float f4, float f5, float f6, ArrayList arrayList) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yc5)) {
            return false;
        }
        yc5 yc5Var = (yc5) obj;
        return Float.compare(this.a, yc5Var.a) == 0 && Float.compare(this.b, yc5Var.b) == 0 && Float.compare(this.c, yc5Var.c) == 0 && Float.compare(this.d, yc5Var.d) == 0 && Float.compare(this.e, yc5Var.e) == 0 && Float.compare(this.f, yc5Var.f) == 0 && this.g.equals(yc5Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + zd2.a(zd2.a(zd2.a(zd2.a(zd2.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31);
    }

    public final String toString() {
        StringBuilder sbR = wd0.r("MovingStateTextLayout(bubbleLeft=", this.a, ", bubbleTop=", this.b, ", bubbleRight=");
        wd0.u(this.c, this.d, ", bubbleBottom=", ", cornerRadius=", sbR);
        wd0.u(this.e, this.f, ", baseline=", ", segments=", sbR);
        sbR.append(this.g);
        sbR.append(")");
        return sbR.toString();
    }
}
