package com.tracket.settings;

import defpackage.x03;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.tracket.settings.TextBenchmarkVariant[], still in use, count: 1, list:
  (r0v1 com.tracket.settings.TextBenchmarkVariant[]) from 0x0046: CONSTRUCTOR (r0v1 com.tracket.settings.TextBenchmarkVariant[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:71) call: x03.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class TextBenchmarkVariant {
    MULTILINE("Multiline"),
    /* JADX INFO: Fake field, exist only in values array */
    SINGLE_LINE("Single"),
    /* JADX INFO: Fake field, exist only in values array */
    STROKE("Stroke"),
    /* JADX INFO: Fake field, exist only in values array */
    ALIGN_START("Start"),
    /* JADX INFO: Fake field, exist only in values array */
    SINGLE_BOX("Box"),
    /* JADX INFO: Fake field, exist only in values array */
    MULTI_BOX("Multi box");

    public static final /* synthetic */ x03 B;
    public final String y;

    static {
        B = new x03(textBenchmarkVariantArr);
    }

    public TextBenchmarkVariant(String str) {
        super(str, i);
        this.y = str;
    }

    public static TextBenchmarkVariant valueOf(String str) {
        return (TextBenchmarkVariant) Enum.valueOf(TextBenchmarkVariant.class, str);
    }

    public static TextBenchmarkVariant[] values() {
        return (TextBenchmarkVariant[]) A.clone();
    }
}
