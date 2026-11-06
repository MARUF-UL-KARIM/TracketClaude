package defpackage;

import com.google.android.datatransport.cct.internal.QosTier;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class x80 extends kw4 {
    public final long a;
    public final long b;
    public final p60 c;
    public final Integer d;
    public final String e;
    public final ArrayList f;

    public x80(long j, long j2, p60 p60Var, Integer num, String str, ArrayList arrayList) {
        QosTier qosTier = QosTier.y;
        this.a = j;
        this.b = j2;
        this.c = p60Var;
        this.d = num;
        this.e = str;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kw4)) {
            return false;
        }
        x80 x80Var = (x80) ((kw4) obj);
        if (this.a != x80Var.a || this.b != x80Var.b || !this.c.equals(x80Var.c)) {
            return false;
        }
        Integer num = x80Var.d;
        Integer num2 = this.d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str = x80Var.e;
        String str2 = this.e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.f.equals(x80Var.f)) {
            return false;
        }
        Object obj2 = QosTier.y;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode()) * 1000003;
        Integer num = this.d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        return ((this.f.hashCode() ^ ((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003)) * 1000003) ^ QosTier.y.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + QosTier.y + "}";
    }
}
