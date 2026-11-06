package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class xx {
    public final ei a;
    public final ei b;
    public final ei c;
    public final ei d;

    public xx(ei eiVar, ei eiVar2, ei eiVar3, ei eiVar4) {
        this.a = eiVar;
        this.b = eiVar2;
        this.c = eiVar3;
        this.d = eiVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xx)) {
            return false;
        }
        xx xxVar = (xx) obj;
        return this.a == xxVar.a && this.b == xxVar.b && this.c == xxVar.c && this.d == xxVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Cached(upperFill=" + this.a + ", lowerFill=" + this.b + ", upperLine=" + this.c + ", lowerLine=" + this.d + ")";
    }
}
