package com.tracket.editor.dto;

import defpackage.x03;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.tracket.editor.dto.AspectRatio[], still in use, count: 1, list:
  (r0v1 com.tracket.editor.dto.AspectRatio[]) from 0x0068: CONSTRUCTOR (r0v1 com.tracket.editor.dto.AspectRatio[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:105) call: x03.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class AspectRatio {
    /* JADX INFO: Fake field, exist only in values array */
    Default9to16(0.5625f),
    /* JADX INFO: Fake field, exist only in values array */
    Default16to9(1.7777778f),
    /* JADX INFO: Fake field, exist only in values array */
    Default1to1(1.0f),
    /* JADX INFO: Fake field, exist only in values array */
    Default4to3(1.3333334f),
    /* JADX INFO: Fake field, exist only in values array */
    Default3to4(0.75f),
    /* JADX INFO: Fake field, exist only in values array */
    Default3to2(1.5f),
    /* JADX INFO: Fake field, exist only in values array */
    Default2to3(0.6666667f),
    /* JADX INFO: Fake field, exist only in values array */
    Default21to9(2.3333333f),
    /* JADX INFO: Fake field, exist only in values array */
    Default9to21(0.42857143f);

    public static final /* synthetic */ x03 A;
    public final float y;

    static {
        A = new x03(aspectRatioArr);
    }

    public AspectRatio(float f) {
        super(str, i);
        this.y = f;
    }

    public static AspectRatio valueOf(String str) {
        return (AspectRatio) Enum.valueOf(AspectRatio.class, str);
    }

    public static AspectRatio[] values() {
        return (AspectRatio[]) z.clone();
    }
}
