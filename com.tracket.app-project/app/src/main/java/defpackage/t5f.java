package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class t5f {
    public static final t5f d = new t5f(new x1b[0]);
    public final int a;
    public final nbd b;
    public int c;

    static {
        String str = vqc.a;
        Integer.toString(0, 36);
    }

    public t5f(x1b... x1bVarArr) {
        this.b = lad.p(x1bVarArr);
        this.a = x1bVarArr.length;
        int i = 0;
        while (i < this.b.B) {
            int i2 = i + 1;
            int i3 = i2;
            while (true) {
                nbd nbdVar = this.b;
                if (i3 < nbdVar.B) {
                    if (((x1b) nbdVar.get(i)).equals(this.b.get(i3))) {
                        ale.l("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                    }
                    i3++;
                }
            }
            i = i2;
        }
    }

    public final x1b a(int i) {
        return (x1b) this.b.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t5f.class != obj.getClass()) {
            return false;
        }
        t5f t5fVar = (t5f) obj;
        return this.a == t5fVar.a && this.b.equals(t5fVar.b);
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
