package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class sle extends xga {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sle(Unsafe unsafe, int i) {
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
    public final void j(Object obj, long j, byte b) {
        switch (this.b) {
            case 0:
                if (!zle.g) {
                    zle.d(obj, j, b);
                } else {
                    zle.c(obj, j, b);
                }
                break;
            default:
                if (!zle.g) {
                    zle.d(obj, j, b);
                } else {
                    zle.c(obj, j, b);
                }
                break;
        }
    }

    @Override // defpackage.xga
    public final boolean s(long j, Object obj) {
        switch (this.b) {
            case 0:
                return zle.g ? zle.h(j, obj) : zle.i(j, obj);
            default:
                return zle.g ? zle.h(j, obj) : zle.i(j, obj);
        }
    }
}
