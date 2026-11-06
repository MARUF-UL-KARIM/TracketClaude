package org.tensorflow.lite;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class TensorFlowLite {
    public static final UnsatisfiedLinkError b;
    public static final AtomicBoolean[] d;
    public static final Logger a = Logger.getLogger(TensorFlowLite.class.getName());
    public static volatile boolean c = false;

    static {
        String[][] strArr = {new String[]{"tensorflowlite_jni", "tensorflowlite_jni_stable"}, new String[]{"tensorflowlite_jni_gms_client"}};
        UnsatisfiedLinkError unsatisfiedLinkError = null;
        for (int i = 0; i < 2; i++) {
            for (String str : strArr[i]) {
                try {
                    System.loadLibrary(str);
                    a.info("Loaded native library: " + str);
                    break;
                } catch (UnsatisfiedLinkError e) {
                    a.info("Didn't load native library: " + str);
                    if (unsatisfiedLinkError == null) {
                        unsatisfiedLinkError = e;
                    } else {
                        unsatisfiedLinkError.addSuppressed(e);
                    }
                }
            }
        }
        b = unsatisfiedLinkError;
        d = new AtomicBoolean[InterpreterApi$Options$TfLiteRuntime.values().length];
        for (int i2 = 0; i2 < InterpreterApi$Options$TfLiteRuntime.values().length; i2++) {
            d[i2] = new AtomicBoolean();
        }
    }

    public static void a() {
        if (c) {
            return;
        }
        try {
            nativeDoNothing();
            c = true;
        } catch (UnsatisfiedLinkError e) {
            UnsatisfiedLinkError unsatisfiedLinkError = b;
            if (unsatisfiedLinkError == null) {
                unsatisfiedLinkError = e;
            }
            UnsatisfiedLinkError unsatisfiedLinkError2 = new UnsatisfiedLinkError("Failed to load native TensorFlow Lite methods. Check that the correct native libraries are present, and, if using a custom native library, have been properly loaded via System.loadLibrary():\n  " + unsatisfiedLinkError);
            unsatisfiedLinkError2.initCause(e);
            throw unsatisfiedLinkError2;
        }
    }

    private static native void nativeDoNothing();
}
