package defpackage;

import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class cnd extends agd {
    public final int a;

    public cnd(int i) {
        this.a = i;
    }

    public static cnd b(int i) throws InvalidAlgorithmParameterException {
        if (i == 16 || i == 32) {
            return new cnd(i);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i * 8)));
    }

    @Override // defpackage.agd
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cnd) && ((cnd) obj).a == this.a;
    }

    public final int hashCode() {
        return Objects.hash(cnd.class, Integer.valueOf(this.a));
    }

    public final String toString() {
        int i = this.a;
        return pyd.e(new StringBuilder(String.valueOf(i).length() + 34), "AesCmac PRF Parameters (", i, "-byte key)");
    }
}
