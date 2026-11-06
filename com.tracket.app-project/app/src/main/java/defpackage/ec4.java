package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ec4 extends cc4 {
    public static final ec4 B = new ec4(1, 0, 1);

    public ec4() {
        super(3, 12, 1);
    }

    @Override // defpackage.cc4
    public final boolean equals(Object obj) {
        if (!(obj instanceof ec4)) {
            return false;
        }
        if (isEmpty() && ((ec4) obj).isEmpty()) {
            return true;
        }
        ec4 ec4Var = (ec4) obj;
        return this.y == ec4Var.y && this.z == ec4Var.z;
    }

    @Override // defpackage.cc4
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.y * 31) + this.z;
    }

    @Override // defpackage.cc4
    public final boolean isEmpty() {
        return this.y > this.z;
    }

    @Override // defpackage.cc4
    public final String toString() {
        return this.y + ".." + this.z;
    }
}
