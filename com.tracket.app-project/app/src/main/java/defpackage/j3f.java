package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class j3f {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public j3f(long j, Object obj, int i, int i2, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public final j3f a(Object obj) {
        return this.a.equals(obj) ? this : new j3f(this.d, obj, this.b, this.c, this.e);
    }

    public final boolean b() {
        return this.b != -1;
    }

    public final boolean c(j3f j3fVar) {
        if (j3fVar == null) {
            return false;
        }
        if (this == j3fVar) {
            return true;
        }
        return this.a.equals(j3fVar.a) && this.b == j3fVar.b && this.c == j3fVar.c && this.d == j3fVar.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3f)) {
            return false;
        }
        j3f j3fVar = (j3f) obj;
        return c(j3fVar) && this.e == j3fVar.e;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public j3f(long j, Object obj) {
        this(j, obj, -1, -1, -1);
    }

    public j3f(Object obj, long j, int i) {
        this(j, obj, -1, -1, i);
    }
}
