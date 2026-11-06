package org.jetbrains.skia;

import defpackage.l82;
import defpackage.zd2;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class IPoint {
    public static final Companion Companion = new Companion(null);
    private static final IPoint ZERO = new IPoint(0, 0);
    private final int x;
    private final int y;

    public IPoint(int i, int i2) {
        this.x = i;
        this.y = i2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IPoint)) {
            return false;
        }
        IPoint iPoint = (IPoint) obj;
        return this.x == iPoint.x && this.y == iPoint.y;
    }

    public final int getX() {
        return this.x;
    }

    public final int getY() {
        return this.y;
    }

    public int hashCode() {
        return ((this.x + 59) * 59) + this.y;
    }

    public final boolean isEmpty() {
        return this.x <= 0 || this.y <= 0;
    }

    public final IPoint offset(int i, int i2) {
        return new IPoint(this.x + i, this.y + i2);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IPoint(_x=");
        sb.append(this.x);
        sb.append(", _y=");
        return zd2.n(sb, this.y, ')');
    }

    /* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
    public static final class Companion {
        public /* synthetic */ Companion(l82 l82Var) {
            this();
        }

        public final IPoint getZERO() {
            return IPoint.ZERO;
        }

        private Companion() {
        }
    }

    public final IPoint offset(IPoint iPoint) {
        iPoint.getClass();
        return offset(iPoint.x, iPoint.y);
    }
}
