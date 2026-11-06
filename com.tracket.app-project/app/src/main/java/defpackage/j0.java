package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends Throwable {
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(String str, int i) {
        super(str);
        this.y = i;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        switch (this.y) {
            case 0:
                synchronized (this) {
                }
                return this;
            case 1:
                synchronized (this) {
                }
                return this;
            case 2:
                synchronized (this) {
                }
                return this;
            case 3:
                synchronized (this) {
                }
                return this;
            case 4:
            default:
                return super.fillInStackTrace();
            case 5:
                synchronized (this) {
                }
                return this;
            case 6:
                synchronized (this) {
                }
                return this;
        }
    }
}
