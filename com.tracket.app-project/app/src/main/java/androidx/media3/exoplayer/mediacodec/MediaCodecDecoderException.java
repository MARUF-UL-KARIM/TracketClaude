package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.media3.decoder.DecoderException;
import defpackage.e35;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public class MediaCodecDecoderException extends DecoderException {
    public final int y;

    public MediaCodecDecoderException(IllegalStateException illegalStateException, e35 e35Var) {
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        sb.append(e35Var == null ? null : e35Var.a);
        super(sb.toString(), illegalStateException);
        boolean z = illegalStateException instanceof MediaCodec.CodecException;
        if (z) {
            ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.y = z ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0;
    }
}
