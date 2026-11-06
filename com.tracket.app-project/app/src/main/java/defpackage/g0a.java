package defpackage;

import android.view.WindowInsetsAnimation;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class g0a extends h0a {
    public final WindowInsetsAnimation e;

    public g0a(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    @Override // defpackage.h0a
    public final float a() {
        return this.e.getAlpha();
    }

    @Override // defpackage.h0a
    public final long b() {
        return this.e.getDurationMillis();
    }

    @Override // defpackage.h0a
    public final float c() {
        return this.e.getInterpolatedFraction();
    }

    @Override // defpackage.h0a
    public final int d() {
        return this.e.getTypeMask();
    }

    @Override // defpackage.h0a
    public final void e(float f) {
        this.e.setFraction(f);
    }
}
