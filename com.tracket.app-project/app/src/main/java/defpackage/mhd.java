package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class mhd extends ogd {
    public final int a;
    public final lhd b;

    public mhd(int i, lhd lhdVar) {
        this.a = i;
        this.b = lhdVar;
    }

    @Override // defpackage.agd
    public final boolean a() {
        return this.b != lhd.C;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mhd)) {
            return false;
        }
        mhd mhdVar = (mhd) obj;
        return mhdVar.a == this.a && mhdVar.b == this.b;
    }

    public final int hashCode() {
        return Objects.hash(mhd.class, Integer.valueOf(this.a), this.b);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        int length = strValueOf.length();
        int i = this.a;
        StringBuilder sb = new StringBuilder(length + 33 + String.valueOf(i).length() + 10);
        sb.append("AesGcmSiv Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(i);
        sb.append("-byte key)");
        return sb.toString();
    }
}
