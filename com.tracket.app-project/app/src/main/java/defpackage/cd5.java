package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class cd5 implements n85 {
    public final float a;
    public final bd5 b;
    public final bd5 c;

    public cd5(float f, bd5 bd5Var, bd5 bd5Var2) {
        this.a = f;
        this.b = bd5Var;
        this.c = bd5Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cd5)) {
            return false;
        }
        cd5 cd5Var = (cd5) obj;
        return Float.compare(this.a, cd5Var.a) == 0 && Objects.equals(this.b, cd5Var.b) && Objects.equals(this.c, cd5Var.c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.a) * 31;
        bd5 bd5Var = this.b;
        int iHashCode2 = (iHashCode + (bd5Var != null ? bd5Var.hashCode() : 0)) * 31;
        bd5 bd5Var2 = this.c;
        return iHashCode2 + (bd5Var2 != null ? bd5Var2.hashCode() : 0);
    }

    public final String toString() {
        return "ReplayGain Xing/Info: peak=" + this.a + ", field 1=" + this.b + ", field 2=" + this.c;
    }
}
