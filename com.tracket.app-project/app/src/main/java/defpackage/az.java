package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class az {
    public boolean a;
    public boolean b;
    public boolean c;

    public /* synthetic */ az(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public bz a() {
        if (this.a || !(this.b || this.c)) {
            return new bz(this);
        }
        cp2.n("Secondary offload attribute fields are true but primary isFormatSupported is false");
        return null;
    }

    public nue b() {
        if (this.a || !(this.b || this.c)) {
            return new nue(this);
        }
        cp2.n("Secondary offload attribute fields are true but primary isFormatSupported is false");
        return null;
    }
}
