package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class iu4 implements View.OnTouchListener {
    public static final int O = ViewConfiguration.getTapTimeout();
    public final jp2 A;
    public wd B;
    public final float[] C;
    public final float[] D;
    public final int E;
    public final float[] F;
    public final float[] G;
    public final float[] H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public final jp2 N;
    public final e60 y;
    public final AccelerateInterpolator z;

    public iu4(jp2 jp2Var) {
        e60 e60Var = new e60();
        e60Var.e = Long.MIN_VALUE;
        e60Var.g = -1L;
        e60Var.f = 0L;
        this.y = e60Var;
        this.z = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.C = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.D = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.F = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.G = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.H = fArr5;
        this.A = jp2Var;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.E = O;
        e60Var.a = 500;
        e60Var.b = 500;
        this.N = jp2Var;
    }

    public static float c(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    public final float a(float f, float f2, float f3, int i) {
        float fC;
        float interpolation;
        float fC2 = c(this.C[i] * f2, 0.0f, this.D[i]);
        float fE = e(f2 - f, fC2) - e(f, fC2);
        AccelerateInterpolator accelerateInterpolator = this.z;
        if (fE >= 0.0f) {
            if (fE > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fE);
            } else {
                fC = 0.0f;
            }
            if (fC == 0.0f) {
                return 0.0f;
            }
            float f4 = this.F[i];
            float f5 = this.G[i];
            float f6 = this.H[i];
            float f7 = f4 * f3;
            return fC > 0.0f ? c(fC * f7, f5, f6) : -c((-fC) * f7, f5, f6);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fE);
        fC = c(interpolation, -1.0f, 1.0f);
        if (fC == 0.0f) {
            return 0.0f;
        }
        float f8 = this.F[i];
        float f9 = this.G[i];
        float f10 = this.H[i];
        float f11 = f8 * f3;
        if (fC > 0.0f) {
        }
    }

    public final float e(float f, float f2) {
        if (f2 != 0.0f && f < f2) {
            if (f >= 0.0f) {
                return 1.0f - (f / f2);
            }
            if (this.L) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    public final void h() {
        int i = 0;
        if (this.J) {
            this.L = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        e60 e60Var = this.y;
        int i2 = (int) (jCurrentAnimationTimeMillis - e60Var.e);
        int i3 = e60Var.b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        e60Var.i = i;
        e60Var.h = e60Var.a(jCurrentAnimationTimeMillis);
        e60Var.g = jCurrentAnimationTimeMillis;
    }

    public final boolean j() {
        jp2 jp2Var;
        int count;
        e60 e60Var = this.y;
        float f = e60Var.d;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(e60Var.c);
        if (iAbs != 0 && (count = (jp2Var = this.N).getCount()) != 0) {
            int childCount = jp2Var.getChildCount();
            int firstVisiblePosition = jp2Var.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && jp2Var.getChildAt(0).getTop() >= 0)) : !(i >= count && jp2Var.getChildAt(childCount - 1).getBottom() <= jp2Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        if (r0 != 3) goto L29;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
            r8 = this;
            boolean r0 = r8.M
            r1 = 0
            if (r0 != 0) goto L7
            goto L78
        L7:
            int r0 = r10.getActionMasked()
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L1b
            if (r0 == r3) goto L17
            if (r0 == r2) goto L1f
            r9 = 3
            if (r0 == r9) goto L17
            goto L78
        L17:
            r8.h()
            return r1
        L1b:
            r8.K = r3
            r8.I = r1
        L1f:
            float r0 = r10.getX()
            int r4 = r9.getWidth()
            float r4 = (float) r4
            jp2 r5 = r8.A
            int r6 = r5.getWidth()
            float r6 = (float) r6
            float r0 = r8.a(r0, r4, r6, r1)
            float r10 = r10.getY()
            int r9 = r9.getHeight()
            float r9 = (float) r9
            int r4 = r5.getHeight()
            float r4 = (float) r4
            float r9 = r8.a(r10, r9, r4, r3)
            e60 r10 = r8.y
            r10.c = r0
            r10.d = r9
            boolean r9 = r8.L
            if (r9 != 0) goto L78
            boolean r9 = r8.j()
            if (r9 == 0) goto L78
            wd r9 = r8.B
            if (r9 != 0) goto L60
            wd r9 = new wd
            r9.<init>(r8, r2)
            r8.B = r9
        L60:
            r8.L = r3
            r8.J = r3
            boolean r10 = r8.I
            if (r10 != 0) goto L73
            int r10 = r8.E
            if (r10 <= 0) goto L73
            long r6 = (long) r10
            java.util.WeakHashMap r10 = defpackage.ar9.a
            r5.postOnAnimationDelayed(r9, r6)
            goto L76
        L73:
            r9.run()
        L76:
            r8.I = r3
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iu4.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
