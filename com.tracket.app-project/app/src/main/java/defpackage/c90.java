package defpackage;

import com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class c90 {
    public static final /* synthetic */ int h = 0;
    public final String a;
    public final PersistedInstallation$RegistrationStatus b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;

    static {
        byte b = (byte) (((byte) (0 | 2)) | 1);
        if (b == 3) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((b & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        cp2.n(wd0.n("Missing required properties:", sb));
    }

    public c90(String str, PersistedInstallation$RegistrationStatus persistedInstallation$RegistrationStatus, String str2, String str3, long j, long j2, String str4) {
        this.a = str;
        this.b = persistedInstallation$RegistrationStatus;
        this.c = str2;
        this.d = str3;
        this.e = j;
        this.f = j2;
        this.g = str4;
    }

    public final b90 a() {
        b90 b90Var = new b90();
        b90Var.a = this.a;
        b90Var.b = this.b;
        b90Var.c = this.c;
        b90Var.d = this.d;
        b90Var.e = this.e;
        b90Var.f = this.f;
        b90Var.g = this.g;
        b90Var.h = (byte) 3;
        return b90Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c90) {
            c90 c90Var = (c90) obj;
            String str = c90Var.a;
            String str2 = this.a;
            if (str2 != null ? str2.equals(str) : str == null) {
                if (this.b.equals(c90Var.b)) {
                    String str3 = c90Var.c;
                    String str4 = this.c;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = c90Var.d;
                        String str6 = this.d;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            if (this.e == c90Var.e && this.f == c90Var.f) {
                                String str7 = c90Var.g;
                                String str8 = this.g;
                                if (str8 != null ? str8.equals(str7) : str7 == null) {
                                    return true;
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
        String str = this.a;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str2 = this.c;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.e;
        int i = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.g;
        return i2 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.a);
        sb.append(", registrationStatus=");
        sb.append(this.b);
        sb.append(", authToken=");
        sb.append(this.c);
        sb.append(", refreshToken=");
        sb.append(this.d);
        sb.append(", expiresInSecs=");
        sb.append(this.e);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f);
        sb.append(", fisError=");
        return wd0.o(sb, this.g, "}");
    }
}
