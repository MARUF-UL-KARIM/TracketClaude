package org.jetbrains.skia;

import defpackage.xp3;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class StdVectorDecoderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final native void StdVectorDecoder_nDisposeArray(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int StdVectorDecoder_nGetArraySize(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long StdVectorDecoder_nReleaseElement(long j, int i);

    public static final <T> T arrayDecoderScope(Function0<ArrayDecoder> function0, xp3 xp3Var) throws Throwable {
        function0.getClass();
        xp3Var.getClass();
        ArrayDecoder arrayDecoder = null;
        try {
            ArrayDecoder arrayDecoderInvoke = function0.invoke();
            try {
                T t = (T) xp3Var.invoke(arrayDecoderInvoke);
                if (arrayDecoderInvoke != null) {
                    arrayDecoderInvoke.dispose();
                }
                return t;
            } catch (Throwable th) {
                th = th;
                arrayDecoder = arrayDecoderInvoke;
                if (arrayDecoder != null) {
                    arrayDecoder.dispose();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
