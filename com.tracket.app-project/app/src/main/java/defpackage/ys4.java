package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ys4 implements LineHeightSpan {
    public final boolean A;
    public final boolean B;
    public final float C;
    public final int D;
    public int E = Integer.MIN_VALUE;
    public int F = Integer.MIN_VALUE;
    public int G = Integer.MIN_VALUE;
    public int H = Integer.MIN_VALUE;
    public int I;
    public int J;
    public final float y;
    public final int z;

    public ys4(float f, int i, boolean z, boolean z2, float f2, int i2) {
        this.y = f;
        this.z = i;
        this.A = z;
        this.B = z2;
        this.C = f2;
        this.D = i2;
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            v94.b("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        double dCeil;
        int i5 = fontMetricsInt.descent;
        int i6 = fontMetricsInt.ascent;
        if (i5 - i6 <= 0) {
            return;
        }
        boolean z = i == 0;
        boolean z2 = i2 == this.z;
        int i7 = this.D;
        boolean z3 = this.B;
        boolean z4 = this.A;
        if (z && z2 && z4 && z3 && i7 != 2) {
            return;
        }
        if (this.E == Integer.MIN_VALUE) {
            int i8 = i5 - i6;
            int iCeil = (int) Math.ceil(this.y);
            int i9 = iCeil - i8;
            if (i7 != 1 || i9 > 0) {
                float fAbs = this.C;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                if (i9 <= 0) {
                    dCeil = Math.ceil(i9 * fAbs);
                } else {
                    dCeil = Math.ceil((1.0f - fAbs) * i9);
                }
                int i10 = (int) dCeil;
                int i11 = fontMetricsInt.descent;
                int i12 = i10 + i11;
                this.G = i12;
                int i13 = i12 - iCeil;
                this.F = i13;
                if (i7 == 0 || i9 >= 0) {
                    if (z4) {
                        i13 = fontMetricsInt.ascent;
                    }
                    this.E = i13;
                    if (z3) {
                        i12 = i11;
                    }
                    this.H = i12;
                    this.I = fontMetricsInt.ascent - i13;
                    this.J = i12 - i11;
                } else if (i7 == 2) {
                    int i14 = fontMetricsInt.ascent;
                    this.E = z4 ? Math.max(i14, i13) : Math.min(i14, i13);
                    int i15 = fontMetricsInt.descent;
                    int i16 = this.G;
                    this.H = z3 ? Math.min(i15, i16) : Math.max(i15, i16);
                    this.I = 0;
                    this.J = 0;
                }
            } else {
                int i17 = fontMetricsInt.ascent;
                this.F = i17;
                int i18 = fontMetricsInt.descent;
                this.G = i18;
                this.E = i17;
                this.H = i18;
                this.I = 0;
                this.J = 0;
            }
        }
        fontMetricsInt.ascent = z ? this.E : this.F;
        fontMetricsInt.descent = z2 ? this.H : this.G;
    }
}
