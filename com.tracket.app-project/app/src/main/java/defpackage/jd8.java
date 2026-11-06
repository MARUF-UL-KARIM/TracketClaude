package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public abstract class jd8 implements id8 {
    public final uw y = new uw(0);

    public final boolean c(int i) {
        return (this.y.get() & i) != 0;
    }

    public final void g(int i) {
        uw uwVar;
        int i2;
        do {
            uwVar = this.y;
            i2 = uwVar.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!uwVar.compareAndSet(i2, i2 | i));
    }
}
