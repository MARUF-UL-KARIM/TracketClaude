package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class xb9 extends ReplacementSpan {
    public TextPaint C;
    public final wb9 z;
    public final Paint.FontMetricsInt y = new Paint.FontMetricsInt();
    public short A = -1;
    public float B = 1.0f;

    public xb9(wb9 wb9Var) {
        t0e.b(wb9Var, "rasterizer cannot be null");
        this.z = wb9Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0046  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.C;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.C = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint);
                        }
                    }
                } else if (paint instanceof TextPaint) {
                    textPaint = (TextPaint) paint;
                }
            } else if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f, i3, f + this.A, i5, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        dy2.a().getClass();
        float f2 = i4;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        wb9 wb9Var = this.z;
        t14 t14Var = wb9Var.b;
        Typeface typeface = (Typeface) t14Var.C;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) t14Var.A, wb9Var.a * 2, 2, f, f2, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.y;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        wb9 wb9Var = this.z;
        t85 t85VarB = wb9Var.b();
        int iA = t85VarB.a(14);
        this.B = fAbs / (iA != 0 ? ((ByteBuffer) t85VarB.B).getShort(iA + t85VarB.y) : (short) 0);
        t85 t85VarB2 = wb9Var.b();
        int iA2 = t85VarB2.a(14);
        if (iA2 != 0) {
            ((ByteBuffer) t85VarB2.B).getShort(iA2 + t85VarB2.y);
        }
        t85 t85VarB3 = wb9Var.b();
        int iA3 = t85VarB3.a(12);
        short s = (short) ((iA3 != 0 ? ((ByteBuffer) t85VarB3.B).getShort(iA3 + t85VarB3.y) : (short) 0) * this.B);
        this.A = s;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
