package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class zla extends bpa {
    public final /* synthetic */ bpa c;
    public final /* synthetic */ bpa d;

    public zla(bpa bpaVar, bpa bpaVar2) {
        this.c = bpaVar;
        this.d = bpaVar2;
    }

    @Override // defpackage.bpa
    public final void a() {
        bpa bpaVar = this.d;
        try {
            this.c.a();
        } finally {
            bpaVar.a();
        }
    }
}
