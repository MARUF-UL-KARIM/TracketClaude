package defpackage;

import com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class z80 extends ui5 {
    public final NetworkConnectionInfo$NetworkType a;
    public final NetworkConnectionInfo$MobileSubtype b;

    public z80(NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType, NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype) {
        this.a = networkConnectionInfo$NetworkType;
        this.b = networkConnectionInfo$MobileSubtype;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ui5) {
            ui5 ui5Var = (ui5) obj;
            NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType = this.a;
            if (networkConnectionInfo$NetworkType != null ? networkConnectionInfo$NetworkType.equals(((z80) ui5Var).a) : ((z80) ui5Var).a == null) {
                NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype = this.b;
                if (networkConnectionInfo$MobileSubtype != null ? networkConnectionInfo$MobileSubtype.equals(((z80) ui5Var).b) : ((z80) ui5Var).b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType = this.a;
        int iHashCode = ((networkConnectionInfo$NetworkType == null ? 0 : networkConnectionInfo$NetworkType.hashCode()) ^ 1000003) * 1000003;
        NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype = this.b;
        return iHashCode ^ (networkConnectionInfo$MobileSubtype != null ? networkConnectionInfo$MobileSubtype.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
