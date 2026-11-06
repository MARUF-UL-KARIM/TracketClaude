package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j5e extends xwd {
    public boolean A;

    public j5e(evd evdVar) {
        super(evdVar);
        ((evd) this.z).Y++;
    }

    public abstract boolean r0();

    public final void s0() {
        if (this.A) {
            return;
        }
        cp2.n("Not initialized");
    }

    public final void t0() {
        if (this.A) {
            cp2.n("Can't initialize twice");
        } else {
            if (r0()) {
                return;
            }
            ((evd) this.z).a0.incrementAndGet();
            this.A = true;
        }
    }
}
