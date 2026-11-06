package com.tracket.settings;

import defpackage.x03;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.tracket.settings.VideoVerificationScenario[], still in use, count: 1, list:
  (r0v1 com.tracket.settings.VideoVerificationScenario[]) from 0x003a: CONSTRUCTOR (r0v1 com.tracket.settings.VideoVerificationScenario[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:59) call: x03.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class VideoVerificationScenario {
    /* JADX INFO: Fake field, exist only in values array */
    ALL("Run all"),
    /* JADX INFO: Fake field, exist only in values array */
    PREPARE("Run prepare"),
    /* JADX INFO: Fake field, exist only in values array */
    SEEK("Run seek"),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK("Run playback"),
    /* JADX INFO: Fake field, exist only in values array */
    SCRUB("Run scrub");

    public static final /* synthetic */ x03 A;
    public final String y;

    static {
        A = new x03(videoVerificationScenarioArr);
    }

    public VideoVerificationScenario(String str) {
        super(str, i);
        this.y = str;
    }

    public static VideoVerificationScenario valueOf(String str) {
        return (VideoVerificationScenario) Enum.valueOf(VideoVerificationScenario.class, str);
    }

    public static VideoVerificationScenario[] values() {
        return (VideoVerificationScenario[]) z.clone();
    }
}
