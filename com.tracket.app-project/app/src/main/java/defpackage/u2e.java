package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class u2e extends xga {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u2e(Unsafe unsafe, int i) {
        super(unsafe);
        this.b = i;
    }

    @Override // defpackage.xga
    public final double a(long j, Object obj) {
        int i = this.b;
        Unsafe unsafe = this.a;
        switch (i) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(unsafe.getLong(obj, j));
    }

    @Override // defpackage.xga
    public final float d(long j, Object obj) {
        int i = this.b;
        Unsafe unsafe = this.a;
        switch (i) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(unsafe.getInt(obj, j));
    }

    @Override // defpackage.xga
    public final void h(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (!f3e.f) {
                    f3e.c(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    f3e.b(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!f3e.f) {
                    f3e.c(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    f3e.b(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // defpackage.xga
    public final void j(Object obj, long j, byte b) {
        switch (this.b) {
            case 0:
                if (!f3e.f) {
                    f3e.c(obj, j, b);
                } else {
                    f3e.b(obj, j, b);
                }
                break;
            default:
                if (!f3e.f) {
                    f3e.c(obj, j, b);
                } else {
                    f3e.b(obj, j, b);
                }
                break;
        }
    }

    @Override // defpackage.xga
    public final void m(Object obj, long j, double d) {
        switch (this.b) {
            case 0:
                this.a.putLong(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                this.a.putLong(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // defpackage.xga
    public final void q(Object obj, long j, float f) {
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
    public final boolean s(long j, Object obj) {
        switch (this.b) {
            case 0:
                return f3e.f ? f3e.j(j, obj) : f3e.k(j, obj);
            default:
                return f3e.f ? f3e.j(j, obj) : f3e.k(j, obj);
        }
    }
}
