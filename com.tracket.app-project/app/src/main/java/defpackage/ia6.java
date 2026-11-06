package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ia6 extends lq5 {
    public final Object y;

    public ia6(Object obj) {
        this.y = obj;
    }

    @Override // defpackage.lq5
    public final Object a() {
        return this.y;
    }

    @Override // defpackage.lq5
    public final boolean b() {
        return true;
    }

    @Override // defpackage.lq5
    public final Object c() {
        return this.y;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ia6) {
            return this.y.equals(((ia6) obj).y);
        }
        return false;
    }

    public final int hashCode() {
        return this.y.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.y + ")";
    }
}
