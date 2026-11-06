package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ezd extends xga {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ezd(Unsafe unsafe, int i) {
        super(unsafe);
        this.b = i;
    }

    @Override // defpackage.xga
    public final boolean c(long j, Object obj) {
        switch (this.b) {
            case 0:
                return fzd.e ? fzd.i(j, obj) : fzd.j(j, obj);
            default:
                return fzd.e ? fzd.i(j, obj) : fzd.j(j, obj);
        }
    }

    @Override // defpackage.xga
    public final void e(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (!fzd.e) {
                    fzd.l(obj, j, z);
                } else {
                    fzd.k(obj, j, z);
                }
                break;
            default:
                if (!fzd.e) {
                    fzd.l(obj, j, z);
                } else {
                    fzd.k(obj, j, z);
                }
                break;
        }
    }

    @Override // defpackage.xga
    public final float g(long j, Object obj) {
        int i = this.b;
        Unsafe unsafe = this.a;
        switch (i) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(unsafe.getInt(obj, j));
    }

    @Override // defpackage.xga
    public final void k(Object obj, long j, float f) {
        int i = this.b;
        Unsafe unsafe = this.a;
        switch (i) {
            case 0:
                unsafe.putInt(obj, j, Float.floatToIntBits(f));
                break;
            default:
                unsafe.putInt(obj, j, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // defpackage.xga
    public final double l(long j, Object obj) {
        int i = this.b;
        Unsafe unsafe = this.a;
        switch (i) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(unsafe.getLong(obj, j));
    }

    @Override // defpackage.xga
    public final void p(Object obj, long j, double d) {
        switch (this.b) {
            case 0:
                this.a.putLong(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                this.a.putLong(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }
}
