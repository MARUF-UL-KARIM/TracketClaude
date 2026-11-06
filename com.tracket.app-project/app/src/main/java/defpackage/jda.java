package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class jda {
    public boolean c;
    public int e;
    public long h;
    public final hda i;
    public fe3 a = new fe3(1);
    public fe3 b = new fe3(1);
    public long d = -9223372036854775807L;
    public float f = -1.0f;
    public float g = -1.0f;

    public jda(hda hdaVar) {
        this.i = hdaVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    public final void a(long j) {
        if (j == this.d) {
            return;
        }
        this.h++;
        this.a.f(j);
        if (this.a.e()) {
            this.c = false;
        } else if (this.d != -9223372036854775807L) {
            if (this.c) {
                fe3 fe3Var = this.b;
                long j2 = fe3Var.d;
                if (j2 == 0 ? false : fe3Var.g[(int) ((j2 - 1) % 15)]) {
                    this.b.d();
                    this.b.f(this.d);
                }
            } else {
                this.b.d();
                this.b.f(this.d);
            }
            this.c = true;
            this.b.f(j);
        }
        if (this.c && this.b.e()) {
            fe3 fe3Var2 = this.a;
            this.a = this.b;
            this.b = fe3Var2;
            this.c = false;
        }
        this.d = j;
        this.e = this.a.e() ? 0 : this.e + 1;
        c();
    }

    public final long b() {
        if (!this.a.e()) {
            return -9223372036854775807L;
        }
        fe3 fe3Var = this.a;
        long j = fe3Var.e;
        if (j == 0) {
            return 0L;
        }
        return fe3Var.f / j;
    }

    public final void c() {
        float f;
        boolean zE = this.a.e();
        if (zE) {
            fe3 fe3Var = this.a;
            long j = fe3Var.e;
            f = (float) (1.0E9d / (j != 0 ? fe3Var.f / j : 0L));
        } else {
            f = this.f;
        }
        float f2 = this.g;
        if (f == f2) {
            return;
        }
        if (f != -1.0f && f2 != -1.0f) {
            float f3 = 1.0f;
            if (zE && this.a.f >= 5000000000L) {
                f3 = 0.1f;
            }
            if (Math.abs(f - f2) < f3) {
                return;
            }
        } else if (f == -1.0f && this.e < 30) {
            return;
        }
        this.g = f;
        this.i.k(f);
    }
}
