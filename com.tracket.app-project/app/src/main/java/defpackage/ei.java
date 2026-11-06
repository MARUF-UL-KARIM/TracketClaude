package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ei implements tw5 {
    public final Path a;
    public RectF b;
    public float[] c;
    public Matrix d;

    public ei(Path path) {
        this.a = path;
    }

    public final void d() {
        this.a.close();
    }

    public final sp6 e() {
        RectF rectF = this.b;
        if (rectF == null) {
            rectF = new RectF();
            this.b = rectF;
        }
        this.a.computeBounds(rectF, true);
        return new sp6(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void f(float f, float f2) {
        this.a.lineTo(f, f2);
    }

    public final void g(float f, float f2) {
        this.a.moveTo(f, f2);
    }

    public final boolean h(tw5 tw5Var, tw5 tw5Var2, int i) {
        Path.Op op;
        if (i == 0) {
            op = Path.Op.DIFFERENCE;
        } else if (i == 1) {
            op = Path.Op.INTERSECT;
        } else if (i == 4) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = i == 2 ? Path.Op.UNION : Path.Op.XOR;
        }
        if (!(tw5Var instanceof ei)) {
            c15.r("Unable to obtain android.graphics.Path");
            return false;
        }
        Path path = ((ei) tw5Var).a;
        if (tw5Var2 instanceof ei) {
            return this.a.op(path, ((ei) tw5Var2).a, op);
        }
        c15.r("Unable to obtain android.graphics.Path");
        return false;
    }

    public final void i() {
        this.a.reset();
    }

    public final void j(int i) {
        this.a.setFillType(i == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    public final void k(long j) {
        Matrix matrix = this.d;
        if (matrix == null) {
            this.d = new Matrix();
        } else {
            matrix.reset();
        }
        Matrix matrix2 = this.d;
        matrix2.getClass();
        matrix2.setTranslate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        Matrix matrix3 = this.d;
        matrix3.getClass();
        this.a.transform(matrix3);
    }
}
