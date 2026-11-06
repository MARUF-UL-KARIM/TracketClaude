package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class cna extends aca {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cna(int i) {
        super(0);
        this.b = i;
    }

    @Override // defpackage.aca
    public final /* synthetic */ Object a() {
        switch (this.b) {
            case 0:
                return new moa();
            case 1:
                return new dra();
            case 2:
                return new plc();
            default:
                return new ytd();
        }
    }
}
