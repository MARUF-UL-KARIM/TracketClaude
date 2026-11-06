package defpackage;

import com.google.firebase.ml.modeldownloader.internal.FirebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus;
import com.google.firebase.ml.modeldownloader.internal.FirebaseMlLogEvent$ModelDownloadLogEvent$ErrorCode;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class n80 extends qc3 {
    public final FirebaseMlLogEvent$ModelDownloadLogEvent$ErrorCode a;
    public final FirebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus b;
    public final int c;
    public final long d;
    public final long e;
    public final pc3 f;

    public n80(FirebaseMlLogEvent$ModelDownloadLogEvent$ErrorCode firebaseMlLogEvent$ModelDownloadLogEvent$ErrorCode, FirebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus firebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus, int i, long j, long j2, o80 o80Var) {
        this.a = firebaseMlLogEvent$ModelDownloadLogEvent$ErrorCode;
        this.b = firebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus;
        this.c = i;
        this.d = j;
        this.e = j2;
        this.f = o80Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qc3) {
            n80 n80Var = (n80) ((qc3) obj);
            if (this.a.equals(n80Var.a) && this.b.equals(n80Var.b) && this.c == n80Var.c && this.d == n80Var.d && this.e == n80Var.e && this.f.equals(n80Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003;
        long j = this.d;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        return this.f.hashCode() ^ ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "ModelDownloadLogEvent{errorCode=" + this.a + ", downloadStatus=" + this.b + ", downloadFailureStatus=" + this.c + ", roughDownloadDurationMs=" + this.d + ", exactDownloadDurationMs=" + this.e + ", options=" + this.f + "}";
    }
}
