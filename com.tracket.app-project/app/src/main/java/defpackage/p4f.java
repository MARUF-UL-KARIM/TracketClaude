package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class p4f extends r4f {
    public final /* synthetic */ r4f c;
    public final /* synthetic */ r4f d;

    public p4f(r4f r4fVar, r4f r4fVar2) {
        this.c = r4fVar;
        this.d = r4fVar2;
    }

    @Override // defpackage.r4f
    public final void a() {
        r4f r4fVar = this.d;
        try {
            this.c.a();
        } finally {
            r4fVar.a();
        }
    }
}
