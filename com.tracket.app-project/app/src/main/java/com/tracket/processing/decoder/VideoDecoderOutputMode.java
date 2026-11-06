package com.tracket.processing.decoder;

import defpackage.x03;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.tracket.processing.decoder.VideoDecoderOutputMode[], still in use, count: 1, list:
  (r0v1 com.tracket.processing.decoder.VideoDecoderOutputMode[]) from 0x001c: CONSTRUCTOR (r0v1 com.tracket.processing.decoder.VideoDecoderOutputMode[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:29) call: x03.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class VideoDecoderOutputMode {
    NV12("NV12"),
    /* JADX INFO: Fake field, exist only in values array */
    P010_HDR("P010 HDR");

    public static final /* synthetic */ x03 B;
    public final String y;

    static {
        B = new x03(videoDecoderOutputModeArr);
    }

    public VideoDecoderOutputMode(String str) {
        super(str, i);
        this.y = str;
    }

    public static VideoDecoderOutputMode valueOf(String str) {
        return (VideoDecoderOutputMode) Enum.valueOf(VideoDecoderOutputMode.class, str);
    }

    public static VideoDecoderOutputMode[] values() {
        return (VideoDecoderOutputMode[]) A.clone();
    }
}
