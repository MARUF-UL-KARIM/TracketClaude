package defpackage;

import com.google.firebase.installations.remote.InstallationResponse$ResponseCode;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class t80 {
    public final String a;
    public final String b;
    public final String c;
    public final o90 d;
    public final InstallationResponse$ResponseCode e;

    public t80(String str, String str2, String str3, o90 o90Var, InstallationResponse$ResponseCode installationResponse$ResponseCode) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = o90Var;
        this.e = installationResponse$ResponseCode;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t80)) {
            return false;
        }
        t80 t80Var = (t80) obj;
        String str = t80Var.a;
        String str2 = this.a;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        String str3 = t80Var.b;
        String str4 = this.b;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = t80Var.c;
        String str6 = this.c;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        o90 o90Var = t80Var.d;
        o90 o90Var2 = this.d;
        if (o90Var2 == null) {
            if (o90Var != null) {
                return false;
            }
        } else if (!o90Var2.equals(o90Var)) {
            return false;
        }
        return this.e.equals(t80Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        o90 o90Var = this.d;
        return this.e.hashCode() ^ (((o90Var != null ? o90Var.hashCode() : 0) ^ iHashCode3) * 1000003);
    }

    public final String toString() {
        return "InstallationResponse{uri=" + this.a + ", fid=" + this.b + ", refreshToken=" + this.c + ", authToken=" + this.d + ", responseCode=" + this.e + "}";
    }
}
