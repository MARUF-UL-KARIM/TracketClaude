package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class vd extends bl4 implements xp3 {
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vd(int i, int i2) {
        super(1);
        this.y = i2;
        this.z = i;
    }

    @Override // defpackage.xp3
    public final Object invoke(Object obj) {
        int i = this.y;
        int i2 = this.z;
        switch (i) {
            case 0:
                return Boolean.valueOf(((jj3) obj).p0(i2));
            case 1:
                return Boolean.valueOf(((jj3) obj).p0(i2));
            case 2:
                return Boolean.valueOf(((jj3) obj).p0(i2));
            case 3:
                return Boolean.valueOf(((jj3) obj).p0(i2));
            default:
                return Boolean.valueOf(((jj3) obj).i0(i2));
        }
    }
}
