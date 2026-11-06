package defpackage;

import com.tracket.editor.dto.ShapeGeometry$EllipseKind;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class yx2 implements sf9 {
    public static final yx2 c = new yx2(1.0f, 1.0f);
    public final float a;
    public final float b;

    public yx2(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public static yx2 h(yx2 yx2Var, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = yx2Var.a;
        }
        if ((i & 2) != 0) {
            f2 = yx2Var.b;
        }
        yx2Var.getClass();
        return new yx2(f, f2);
    }

    @Override // defpackage.sf9
    public final /* bridge */ sf9 b(float f) {
        return (yx2) super.b(f);
    }

    @Override // defpackage.sf9
    public final sf9 c(float f) {
        return new yx2(this.a * f, this.b * f);
    }

    @Override // defpackage.sf9
    public final sf9 e(sf9 sf9Var) {
        yx2 yx2Var = (yx2) sf9Var;
        yx2Var.getClass();
        return new yx2(this.a - yx2Var.a, this.b - yx2Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yx2)) {
            return false;
        }
        yx2 yx2Var = (yx2) obj;
        return Float.compare(this.a, yx2Var.a) == 0 && Float.compare(this.b, yx2Var.b) == 0;
    }

    @Override // defpackage.sf9
    public final sf9 f(sf9 sf9Var) {
        yx2 yx2Var = (yx2) sf9Var;
        yx2Var.getClass();
        return new yx2(this.a + yx2Var.a, this.b + yx2Var.b);
    }

    public final yx2 g(ShapeGeometry$EllipseKind shapeGeometry$EllipseKind) {
        shapeGeometry$EllipseKind.getClass();
        float fB = fne.b(this.a);
        yx2 yx2Var = new yx2(fB, fne.b(this.b));
        return shapeGeometry$EllipseKind == ShapeGeometry$EllipseKind.z ? h(yx2Var, 0.0f, fB, 1) : yx2Var;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    @Override // defpackage.sf9
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final yx2 d(yx2 yx2Var, float f) {
        yx2Var.getClass();
        float f2 = this.a;
        float fA = iu1.a(yx2Var.a, f2, f, f2);
        float f3 = this.b;
        return new yx2(fA, iu1.a(yx2Var.b, f3, f, f3));
    }

    public final String toString() {
        return iu1.i("EllipseParams(width=", this.a, ", height=", this.b, ")");
    }
}
