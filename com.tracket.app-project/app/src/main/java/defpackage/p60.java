package defpackage;

import com.google.android.datatransport.cct.internal.ClientInfo$ClientType;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class p60 extends t91 {
    public final m60 a;

    public p60(m60 m60Var) {
        this.a = m60Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t91)) {
            return false;
        }
        t91 t91Var = (t91) obj;
        Object obj2 = ClientInfo$ClientType.y;
        if (obj2.equals(obj2)) {
            return this.a.equals(((p60) t91Var).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ ((ClientInfo$ClientType.y.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ClientInfo{clientType=" + ClientInfo$ClientType.y + ", androidClientInfo=" + this.a + "}";
    }
}
