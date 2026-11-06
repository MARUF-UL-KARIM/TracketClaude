package org.tensorflow.lite.gpu;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
class GpuDelegateNative {
    public static final UnsatisfiedLinkError a;
    public static volatile boolean b = false;

    static {
        try {
            System.loadLibrary("tensorflowlite_gpu_jni");
            e = null;
        } catch (UnsatisfiedLinkError e) {
            e = e;
        }
        a = e;
    }

    public static void a() {
        if (b) {
            return;
        }
        try {
            nativeDoNothing();
            b = true;
        } catch (UnsatisfiedLinkError e) {
            UnsatisfiedLinkError unsatisfiedLinkError = a;
            if (unsatisfiedLinkError == null) {
                unsatisfiedLinkError = e;
            }
            UnsatisfiedLinkError unsatisfiedLinkError2 = new UnsatisfiedLinkError("Failed to load native GpuDelegate methods. Check that the correct native libraries are present, and, if using a custom native library, have been properly loaded via System.loadLibrary():\n  " + unsatisfiedLinkError);
            unsatisfiedLinkError2.initCause(e);
            unsatisfiedLinkError2.addSuppressed(unsatisfiedLinkError);
            throw unsatisfiedLinkError2;
        }
    }

    private static native void nativeDoNothing();
}
