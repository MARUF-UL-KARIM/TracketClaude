package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class a69 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final List f;

    public a69(float f, float f2, float f3, float f4, float f5, List list) {
        list.getClass();
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a69)) {
            return false;
        }
        a69 a69Var = (a69) obj;
        return Float.compare(this.a, a69Var.a) == 0 && Float.compare(this.b, a69Var.b) == 0 && Float.compare(this.c, a69Var.c) == 0 && Float.compare(this.d, a69Var.d) == 0 && Float.compare(this.e, a69Var.e) == 0 && ff4.h(this.f, a69Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + zd2.a(zd2.a(zd2.a(zd2.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31);
    }

    public final String toString() {
        StringBuilder sbR = wd0.r("TrackingRegionGeometry(centerX=", this.a, ", centerY=", this.b, ", width=");
        wd0.u(this.c, this.d, ", height=", ", rotationDegrees=", sbR);
        sbR.append(this.e);
        sbR.append(", corners=");
        sbR.append(this.f);
        sbR.append(")");
        return sbR.toString();
    }
}
