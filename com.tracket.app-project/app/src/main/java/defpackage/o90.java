package defpackage;

import com.google.firebase.installations.remote.TokenResult$ResponseCode;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class o90 {
    public final String a;
    public final long b;
    public final TokenResult$ResponseCode c;

    public o90(String str, long j, TokenResult$ResponseCode tokenResult$ResponseCode) {
        this.a = str;
        this.b = j;
        this.c = tokenResult$ResponseCode;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o90) {
            o90 o90Var = (o90) obj;
            String str = o90Var.a;
            String str2 = this.a;
            if (str2 != null ? str2.equals(str) : str == null) {
                if (this.b == o90Var.b) {
                    TokenResult$ResponseCode tokenResult$ResponseCode = o90Var.c;
                    TokenResult$ResponseCode tokenResult$ResponseCode2 = this.c;
                    if (tokenResult$ResponseCode2 != null ? tokenResult$ResponseCode2.equals(tokenResult$ResponseCode) : tokenResult$ResponseCode == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i = (((iHashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        TokenResult$ResponseCode tokenResult$ResponseCode = this.c;
        return i ^ (tokenResult$ResponseCode != null ? tokenResult$ResponseCode.hashCode() : 0);
    }

    public final String toString() {
        return "TokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.b + ", responseCode=" + this.c + "}";
    }
}
