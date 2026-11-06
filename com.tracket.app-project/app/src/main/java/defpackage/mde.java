package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class mde {
    public final Context a;
    public final yk8 b;

    public mde(Context context, yk8 yk8Var) {
        this.a = context;
        this.b = yk8Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mde)) {
            return false;
        }
        mde mdeVar = (mde) obj;
        if (!this.a.equals(mdeVar.a)) {
            return false;
        }
        yk8 yk8Var = mdeVar.b;
        yk8 yk8Var2 = this.b;
        if (yk8Var2 == null) {
            return yk8Var == null;
        }
        return yk8Var2.equals(yk8Var);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        yk8 yk8Var = this.b;
        return (yk8Var == null ? 0 : yk8Var.hashCode()) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        String string = this.a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(length + 45 + strValueOf.length() + 1);
        ot5.C(sb, "FlagsContext{context=", string, ", hermeticFileOverrides=", strValueOf);
        sb.append("}");
        return sb.toString();
    }
}
