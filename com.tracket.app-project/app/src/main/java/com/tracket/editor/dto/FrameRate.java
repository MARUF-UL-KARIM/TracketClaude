package com.tracket.editor.dto;

import defpackage.x03;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.tracket.editor.dto.FrameRate[], still in use, count: 1, list:
  (r0v1 com.tracket.editor.dto.FrameRate[]) from 0x003c: CONSTRUCTOR (r0v1 com.tracket.editor.dto.FrameRate[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:61) call: x03.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class FrameRate {
    /* JADX INFO: Fake field, exist only in values array */
    FPS_15(15),
    /* JADX INFO: Fake field, exist only in values array */
    FPS_24(24),
    FPS_30(30),
    /* JADX INFO: Fake field, exist only in values array */
    FPS_50(50),
    /* JADX INFO: Fake field, exist only in values array */
    FPS_60(60);

    public static final /* synthetic */ x03 B;
    public final int y;

    static {
        B = new x03(frameRateArr);
    }

    public FrameRate(int i) {
        super(str, i);
        this.y = i;
    }

    public static FrameRate valueOf(String str) {
        return (FrameRate) Enum.valueOf(FrameRate.class, str);
    }

    public static FrameRate[] values() {
        return (FrameRate[]) A.clone();
    }
}
