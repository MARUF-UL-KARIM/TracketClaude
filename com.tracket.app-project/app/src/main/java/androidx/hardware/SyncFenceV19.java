package androidx.hardware;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class SyncFenceV19 implements AutoCloseable {
    static {
        System.loadLibrary("graphics-core");
    }

    private final int dupeFileDescriptor() {
        throw null;
    }

    private final native void nClose(int i);

    private final native int nDup(int i);

    private final native boolean nWait(int i, int i2);

    @Override // java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    public final void finalize() {
        throw null;
    }
}
