package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class nue {
    public static final nue d = new az().b();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public /* synthetic */ nue(az azVar) {
        this.a = azVar.a;
        this.b = azVar.b;
        this.c = azVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nue.class != obj.getClass()) {
            return false;
        }
        nue nueVar = (nue) obj;
        return this.a == nueVar.a && this.b == nueVar.b && this.c == nueVar.c;
    }

    public final int hashCode() {
        int i = (this.a ? 1 : 0) << 2;
        boolean z = this.b;
        return (z ? 1 : 0) + (z ? 1 : 0) + i + (this.c ? 1 : 0);
    }
}
