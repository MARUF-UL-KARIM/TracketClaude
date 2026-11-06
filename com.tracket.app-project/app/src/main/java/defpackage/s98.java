package defpackage;

import com.tracket.editor.dto.StabilizationMotionModel;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class s98 {
    public final q58 a;
    public final StabilizationMotionModel b;
    public final int c;
    public final int d;
    public final String e;

    public s98(q58 q58Var, StabilizationMotionModel stabilizationMotionModel, int i, int i2, String str) {
        stabilizationMotionModel.getClass();
        this.a = q58Var;
        this.b = stabilizationMotionModel;
        this.c = i;
        this.d = i2;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s98)) {
            return false;
        }
        s98 s98Var = (s98) obj;
        return this.a.equals(s98Var.a) && this.b == s98Var.b && this.c == s98Var.c && this.d == s98Var.d && this.e.equals(s98Var.e);
    }

    public final int hashCode() {
        return Integer.hashCode(2) + ot5.g(this.e, zd2.b(this.d, zd2.b(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StabilizationSolveKey(analysisIdentity=");
        sb.append(this.a);
        sb.append(", model=");
        sb.append(this.b);
        sb.append(", sourceWidth=");
        zd2.y(sb, this.c, ", sourceHeight=", this.d, ", runtimePolicyKey=");
        return wd0.o(sb, this.e, ", solverVersion=2)");
    }
}
