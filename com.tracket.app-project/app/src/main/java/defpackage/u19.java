package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class u19 {
    public static final u19 d = new u19(new t19[0]);
    public final int a;
    public final oq6 b;
    public int c;

    static {
        te9.w(0);
    }

    public u19(t19... t19VarArr) {
        oq6 oq6VarN = a84.n(t19VarArr);
        this.b = oq6VarN;
        this.a = t19VarArr.length;
        int i = 0;
        while (i < oq6VarN.B) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < oq6VarN.B; i3++) {
                if (((t19) oq6VarN.get(i)).equals(oq6VarN.get(i3))) {
                    eid.g("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final t19 a(int i) {
        return (t19) this.b.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u19.class != obj.getClass()) {
            return false;
        }
        u19 u19Var = (u19) obj;
        return this.a == u19Var.a && this.b.equals(u19Var.b);
    }

    public final int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.b.hashCode();
        this.c = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return this.b.toString();
    }
}
