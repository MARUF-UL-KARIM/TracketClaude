package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import defpackage.i1f;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public class zzvr extends zziw {
    public final int y;

    public zzvr(IllegalStateException illegalStateException, i1f i1fVar) {
        super("Decoder failed: ".concat(String.valueOf(i1fVar == null ? null : i1fVar.a)), illegalStateException);
        boolean z = illegalStateException instanceof MediaCodec.CodecException;
        if (z) {
            ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.y = z ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0;
    }
}
