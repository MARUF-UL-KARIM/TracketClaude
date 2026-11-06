package defpackage;

import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f2 extends jn6 {
    @Override // defpackage.jn6
    public final int a(int i) {
        return (g().nextInt() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // defpackage.jn6
    public final float b() {
        return g().nextFloat();
    }

    @Override // defpackage.jn6
    public final int c() {
        return g().nextInt();
    }

    @Override // defpackage.jn6
    public final long d() {
        return g().nextLong();
    }

    public abstract Random g();
}
