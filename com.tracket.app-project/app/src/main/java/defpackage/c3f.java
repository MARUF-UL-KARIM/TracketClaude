package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class c3f extends aca {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c3f(int i) {
        super(1);
        this.b = i;
    }

    @Override // defpackage.aca
    public final /* synthetic */ Object a() {
        switch (this.b) {
            case 0:
                return new e3f();
            case 1:
                return new i3f();
            case 2:
                return new q4f();
            default:
                return new u4f();
        }
    }
}
