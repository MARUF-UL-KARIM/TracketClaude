package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class bz {
    public static final bz d = new az().a();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public bz(az azVar) {
        this.a = azVar.a;
        this.b = azVar.b;
        this.c = azVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bz.class != obj.getClass()) {
            return false;
        }
        bz bzVar = (bz) obj;
        return this.a == bzVar.a && this.b == bzVar.b && this.c == bzVar.c;
    }

    public final int hashCode() {
        return ((this.a ? 1 : 0) << 2) + ((this.b ? 1 : 0) << 1) + (this.c ? 1 : 0);
    }
}
