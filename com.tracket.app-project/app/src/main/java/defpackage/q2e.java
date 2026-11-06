package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class q2e implements o2e {
    public static final Object c = new Object();
    public volatile o2e a;
    public volatile Object b;

    public static o2e a(o2e o2eVar) {
        if ((o2eVar instanceof q2e) || (o2eVar instanceof h2e)) {
            return o2eVar;
        }
        q2e q2eVar = new q2e();
        q2eVar.b = c;
        q2eVar.a = o2eVar;
        return q2eVar;
    }

    @Override // defpackage.o2e
    public final Object zzb() {
        Object obj = this.b;
        if (obj != c) {
            return obj;
        }
        o2e o2eVar = this.a;
        if (o2eVar == null) {
            return this.b;
        }
        Object objZzb = o2eVar.zzb();
        this.b = objZzb;
        this.a = null;
        return objZzb;
    }
}
