package androidx.hardware;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class SyncFenceBindings {

    /* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
    public static final class Companion {
        public final void nForceClose(int i) {
            SyncFenceBindings.nForceClose(i);
        }

        public final long nGetSignalTime(int i) {
            return SyncFenceBindings.nGetSignalTime(i);
        }

        public final boolean nResolveSyncFileInfo() {
            return SyncFenceBindings.nResolveSyncFileInfo();
        }

        public final boolean nResolveSyncFileInfoFree() {
            return SyncFenceBindings.nResolveSyncFileInfoFree();
        }
    }

    static {
        System.loadLibrary("graphics-core");
    }

    public static final native void nForceClose(int i);

    public static final native long nGetSignalTime(int i);

    public static final native boolean nResolveSyncFileInfo();

    public static final native boolean nResolveSyncFileInfoFree();
}
