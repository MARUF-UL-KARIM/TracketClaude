package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ea9 extends da9 {
    public final /* synthetic */ int B;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.B) {
            case 0:
                int i = this.A;
                this.A = i + 2;
                Object[] objArr = this.y;
                return new p05(0, objArr[i], objArr[i + 1]);
            case 1:
                int i2 = this.A;
                this.A = i2 + 2;
                return this.y[i2];
            default:
                int i3 = this.A;
                this.A = i3 + 2;
                return this.y[i3 + 1];
        }
    }
}
