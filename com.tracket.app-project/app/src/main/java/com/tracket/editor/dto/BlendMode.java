package com.tracket.editor.dto;

import defpackage.ag8;
import defpackage.oo2;
import defpackage.rh8;
import defpackage.to2;
import defpackage.x03;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.tracket.editor.dto.BlendMode[], still in use, count: 1, list:
  (r0v1 com.tracket.editor.dto.BlendMode[]) from 0x0223: CONSTRUCTOR (r0v1 com.tracket.editor.dto.BlendMode[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:548) call: x03.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class BlendMode {
    NORMAL((to2) oo2.L.getValue(), (rh8) ag8.N.getValue(), false),
    /* JADX INFO: Fake field, exist only in values array */
    DARKEN((to2) oo2.D.getValue(), (rh8) ag8.F.getValue(), false),
    /* JADX INFO: Fake field, exist only in values array */
    MULTIPLY((to2) oo2.K.getValue(), (rh8) ag8.M.getValue(), false),
    /* JADX INFO: Fake field, exist only in values array */
    LINEAR_BURN((to2) oo2.N.getValue(), (rh8) ag8.P.getValue(), true),
    /* JADX INFO: Fake field, exist only in values array */
    COLOR_BURN((to2) oo2.B.getValue(), (rh8) ag8.D.getValue(), true),
    /* JADX INFO: Fake field, exist only in values array */
    LIGHTEN((to2) oo2.I.getValue(), (rh8) ag8.K.getValue(), false),
    /* JADX INFO: Fake field, exist only in values array */
    SCREEN((to2) oo2.Q.getValue(), (rh8) ag8.S.getValue(), false),
    /* JADX INFO: Fake field, exist only in values array */
    LINEAR_DODGE((to2) oo2.O.getValue(), (rh8) ag8.Q.getValue(), true),
    /* JADX INFO: Fake field, exist only in values array */
    COLOR_DODGE((to2) oo2.C.getValue(), (rh8) ag8.E.getValue(), true),
    /* JADX INFO: Fake field, exist only in values array */
    OVERLAY((to2) oo2.M.getValue(), (rh8) ag8.O.getValue(), false),
    /* JADX INFO: Fake field, exist only in values array */
    SOFT_LIGHT((to2) oo2.R.getValue(), (rh8) ag8.T.getValue(), true),
    /* JADX INFO: Fake field, exist only in values array */
    HARD_LIGHT((to2) oo2.G.getValue(), (rh8) ag8.I.getValue(), true),
    /* JADX INFO: Fake field, exist only in values array */
    DIFFERENCE((to2) oo2.E.getValue(), (rh8) ag8.G.getValue(), true),
    /* JADX INFO: Fake field, exist only in values array */
    EXCLUSION((to2) oo2.F.getValue(), (rh8) ag8.H.getValue(), true),
    /* JADX INFO: Fake field, exist only in values array */
    HUE((to2) oo2.H.getValue(), (rh8) ag8.J.getValue(), true),
    /* JADX INFO: Fake field, exist only in values array */
    SATURATION((to2) oo2.P.getValue(), (rh8) ag8.R.getValue(), true),
    /* JADX INFO: Fake field, exist only in values array */
    COLOR((to2) oo2.A.getValue(), (rh8) ag8.C.getValue(), true),
    /* JADX INFO: Fake field, exist only in values array */
    LUMINOSITY((to2) oo2.J.getValue(), (rh8) ag8.L.getValue(), true);

    public static final /* synthetic */ x03 D;
    public final boolean A;
    public final to2 y;
    public final rh8 z;

    static {
        D = new x03(blendModeArr);
    }

    public BlendMode(to2 to2Var, rh8 rh8Var, boolean z) {
        super(str, i);
        this.y = to2Var;
        this.z = rh8Var;
        this.A = z;
    }

    public static BlendMode valueOf(String str) {
        return (BlendMode) Enum.valueOf(BlendMode.class, str);
    }

    public static BlendMode[] values() {
        return (BlendMode[]) C.clone();
    }
}
