package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class wb9 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final t14 b;
    public volatile int c = 0;

    public wb9(t14 t14Var, int i) {
        this.b = t14Var;
        this.a = i;
    }

    public final int a(int i) {
        t85 t85VarB = b();
        int iA = t85VarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) t85VarB.B;
        int i2 = iA + t85VarB.y;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final t85 b() {
        ThreadLocal threadLocal = d;
        t85 t85Var = (t85) threadLocal.get();
        if (t85Var == null) {
            t85Var = new t85();
            threadLocal.set(t85Var);
        }
        v85 v85Var = (v85) this.b.z;
        int iA = v85Var.a(6);
        if (iA != 0) {
            int i = iA + v85Var.y;
            int i2 = (this.a * 4) + ((ByteBuffer) v85Var.B).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) v85Var.B).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) v85Var.B;
            t85Var.B = byteBuffer;
            if (byteBuffer != null) {
                t85Var.y = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                t85Var.z = i4;
                t85Var.A = ((ByteBuffer) t85Var.B).getShort(i4);
                return t85Var;
            }
            t85Var.y = 0;
            t85Var.z = 0;
            t85Var.A = 0;
        }
        return t85Var;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        t85 t85VarB = b();
        int iA = t85VarB.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) t85VarB.B).getInt(iA + t85VarB.y) : 0));
        sb.append(", codepoints:");
        t85 t85VarB2 = b();
        int iA2 = t85VarB2.a(16);
        if (iA2 != 0) {
            int i2 = iA2 + t85VarB2.y;
            i = ((ByteBuffer) t85VarB2.B).getInt(((ByteBuffer) t85VarB2.B).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
