package defpackage;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class yd9 implements Spannable {
    public boolean y = false;
    public Spannable z;

    public yd9(Spannable spannable) {
        this.z = spannable;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.z.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.z.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.z.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.z.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.z.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.z.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.z.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.z.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.z.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        Spannable spannable = this.z;
        if (!this.y && (spannable instanceof PrecomputedText)) {
            this.z = new SpannableString(spannable);
        }
        this.y = true;
        this.z.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        Spannable spannable = this.z;
        if (!this.y && (spannable instanceof PrecomputedText)) {
            this.z = new SpannableString(spannable);
        }
        this.y = true;
        this.z.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.z.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.z.toString();
    }
}
