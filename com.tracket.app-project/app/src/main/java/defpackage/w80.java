package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class w80 extends iw4 {
    public final long a;
    public final Integer b;
    public final ni1 c;
    public final long d;
    public final byte[] e;
    public final String f;
    public final long g;
    public final ui5 h;
    public final r33 i;

    public w80(long j, Integer num, ni1 ni1Var, long j2, byte[] bArr, String str, long j3, ui5 ui5Var, r33 r33Var) {
        this.a = j;
        this.b = num;
        this.c = ni1Var;
        this.d = j2;
        this.e = bArr;
        this.f = str;
        this.g = j3;
        this.h = ui5Var;
        this.i = r33Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iw4) {
            iw4 iw4Var = (iw4) obj;
            w80 w80Var = (w80) iw4Var;
            if (this.a == w80Var.a) {
                Integer num = w80Var.b;
                Integer num2 = this.b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    ni1 ni1Var = w80Var.c;
                    ni1 ni1Var2 = this.c;
                    if (ni1Var2 != null ? ni1Var2.equals(ni1Var) : ni1Var == null) {
                        if (this.d == w80Var.d) {
                            if (Arrays.equals(this.e, iw4Var instanceof w80 ? ((w80) iw4Var).e : w80Var.e)) {
                                String str = w80Var.f;
                                String str2 = this.f;
                                if (str2 != null ? str2.equals(str) : str == null) {
                                    if (this.g == w80Var.g) {
                                        ui5 ui5Var = w80Var.h;
                                        ui5 ui5Var2 = this.h;
                                        if (ui5Var2 != null ? ui5Var2.equals(ui5Var) : ui5Var == null) {
                                            r33 r33Var = w80Var.i;
                                            r33 r33Var2 = this.i;
                                            if (r33Var2 != null ? r33Var2.equals(r33Var) : r33Var == null) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        ni1 ni1Var = this.c;
        int iHashCode2 = (iHashCode ^ (ni1Var == null ? 0 : ni1Var.hashCode())) * 1000003;
        long j2 = this.d;
        int iHashCode3 = (((iHashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.e)) * 1000003;
        String str = this.f;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.g;
        int i2 = (iHashCode4 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        ui5 ui5Var = this.h;
        int iHashCode5 = (i2 ^ (ui5Var == null ? 0 : ui5Var.hashCode())) * 1000003;
        r33 r33Var = this.i;
        return iHashCode5 ^ (r33Var != null ? r33Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", complianceData=" + this.c + ", eventUptimeMs=" + this.d + ", sourceExtension=" + Arrays.toString(this.e) + ", sourceExtensionJsonProto3=" + this.f + ", timezoneOffsetSeconds=" + this.g + ", networkConnectionInfo=" + this.h + ", experimentIds=" + this.i + "}";
    }
}
