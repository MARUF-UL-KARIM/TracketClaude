package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class h80 extends r33 {
    public final byte[] a;
    public final byte[] b;

    public h80(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r33) {
            r33 r33Var = (r33) obj;
            boolean z = r33Var instanceof h80;
            h80 h80Var = (h80) r33Var;
            if (Arrays.equals(this.a, z ? h80Var.a : h80Var.a)) {
                h80 h80Var2 = (h80) r33Var;
                if (Arrays.equals(this.b, z ? h80Var2.b : h80Var2.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((Arrays.hashCode(this.a) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.a) + ", encryptedBlob=" + Arrays.toString(this.b) + "}";
    }
}
