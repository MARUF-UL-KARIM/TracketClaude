package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class u8a {
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final List f;
    public final List g;
    public final PendingIntent h;
    public final List i;

    public u8a(int i, int i2, int i3, long j, long j2, List list, List list2, PendingIntent pendingIntent, List list3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
        this.f = list;
        this.g = list2;
        this.h = pendingIntent;
        this.i = list3;
    }

    public static u8a a(int i, int i2, int i3, long j, long j2, List list, List list2) {
        if (i2 != 8) {
            return new u8a(i, i2, i3, j, j2, list, list2, null, null);
        }
        cp2.m("REQUIRES_USER_CONFIRMATION state not supported.");
        return null;
    }

    public static u8a b(Bundle bundle) {
        return new u8a(bundle.getInt("session_id"), bundle.getInt("status"), bundle.getInt("error_code"), bundle.getLong("bytes_downloaded"), bundle.getLong("total_bytes_to_download"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), (PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getParcelableArrayList("split_file_intents"));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u8a) {
            u8a u8aVar = (u8a) obj;
            if (this.a == u8aVar.a && this.b == u8aVar.b && this.c == u8aVar.c && this.d == u8aVar.d && this.e == u8aVar.e) {
                List list = u8aVar.f;
                List list2 = this.f;
                if (list2 != null ? list2.equals(list) : list == null) {
                    List list3 = u8aVar.g;
                    List list4 = this.g;
                    if (list4 != null ? list4.equals(list3) : list3 == null) {
                        PendingIntent pendingIntent = u8aVar.h;
                        PendingIntent pendingIntent2 = this.h;
                        if (pendingIntent2 != null ? pendingIntent2.equals(pendingIntent) : pendingIntent == null) {
                            List list5 = u8aVar.i;
                            List list6 = this.i;
                            if (list6 != null ? list6.equals(list5) : list5 == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
        long j = this.d;
        long j2 = j ^ (j >>> 32);
        long j3 = this.e;
        long j4 = (j3 >>> 32) ^ j3;
        List list = this.f;
        int iHashCode = ((((((i * 1000003) ^ ((int) j2)) * 1000003) ^ ((int) j4)) * 1000003) ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.g;
        int iHashCode2 = (iHashCode ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        PendingIntent pendingIntent = this.h;
        int iHashCode3 = (iHashCode2 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        List list3 = this.i;
        return iHashCode3 ^ (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f);
        String strValueOf2 = String.valueOf(this.g);
        String strValueOf3 = String.valueOf(this.h);
        String strValueOf4 = String.valueOf(this.i);
        StringBuilder sbS = zd2.s(this.a, this.b, "SplitInstallSessionState{sessionId=", ", status=", ", errorCode=");
        mi9.u(sbS, this.c, ", bytesDownloaded=", this.d);
        iu1.y(sbS, ", totalBytesToDownload=", this.e, ", moduleNamesNullable=");
        ot5.C(sbS, strValueOf, ", languagesNullable=", strValueOf2, ", resolutionIntent=");
        return zd2.r(sbS, strValueOf3, ", splitFileIntents=", strValueOf4, "}");
    }
}
