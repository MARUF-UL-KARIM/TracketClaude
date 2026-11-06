package androidx.datastore.core;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ReadException<T> extends State<T> {
    private final Throwable readException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadException(Throwable th, int i) {
        super(i, null);
        th.getClass();
        this.readException = th;
    }

    public final Throwable getReadException() {
        return this.readException;
    }
}
