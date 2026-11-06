package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ola extends tla {
    public final byte[] b;

    public ola(String str, byte[] bArr) {
        super(str);
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ola.class != obj.getClass()) {
            return false;
        }
        ola olaVar = (ola) obj;
        return this.a.equals(olaVar.a) && Arrays.equals(this.b, olaVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + ((this.a.hashCode() + 527) * 31);
    }
}
