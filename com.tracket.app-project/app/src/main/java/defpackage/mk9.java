package defpackage;

import com.tracket.processing.VideoExportFrameDeliveryOutcome;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class mk9 {
    public final VideoExportFrameDeliveryOutcome a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final Long u;
    public final Long v;

    public mk9(VideoExportFrameDeliveryOutcome videoExportFrameDeliveryOutcome, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, Long l, Long l2) {
        videoExportFrameDeliveryOutcome.getClass();
        this.a = videoExportFrameDeliveryOutcome;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = i10;
        this.l = i11;
        this.m = i12;
        this.n = i13;
        this.o = i14;
        this.p = i15;
        this.q = i16;
        this.r = i17;
        this.s = i18;
        this.t = i19;
        this.u = l;
        this.v = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mk9)) {
            return false;
        }
        mk9 mk9Var = (mk9) obj;
        return this.a == mk9Var.a && this.b == mk9Var.b && this.c == mk9Var.c && this.d == mk9Var.d && this.e == mk9Var.e && this.f == mk9Var.f && this.g == mk9Var.g && this.h == mk9Var.h && this.i == mk9Var.i && this.j == mk9Var.j && this.k == mk9Var.k && this.l == mk9Var.l && this.m == mk9Var.m && this.n == mk9Var.n && this.o == mk9Var.o && this.p == mk9Var.p && this.q == mk9Var.q && this.r == mk9Var.r && this.s == mk9Var.s && this.t == mk9Var.t && ff4.h(this.u, mk9Var.u) && ff4.h(this.v, mk9Var.v);
    }

    public final int hashCode() {
        int iB = zd2.b(this.t, zd2.b(this.s, zd2.b(this.r, zd2.b(this.q, zd2.b(this.p, zd2.b(this.o, zd2.b(this.n, zd2.b(this.m, zd2.b(this.l, zd2.b(this.k, zd2.b(this.j, zd2.b(this.i, zd2.b(this.h, zd2.b(this.g, zd2.b(this.f, zd2.b(this.e, zd2.b(this.d, zd2.b(this.c, zd2.b(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        Long l = this.u;
        int iHashCode = (iB + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.v;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoExportFrameDeliverySummary(outcome=");
        sb.append(this.a);
        sb.append(", totalFrames=");
        sb.append(this.b);
        sb.append(", exactFrames=");
        zd2.y(sb, this.c, ", heldFrames=", this.d, ", blackFrames=");
        zd2.y(sb, this.e, ", framesWithMain=", this.f, ", mainProducerIssues=");
        zd2.y(sb, this.g, ", overlayProducerIssues=", this.h, ", producerTimeouts=");
        zd2.y(sb, this.i, ", decoderErrors=", this.j, ", decoderEndOfStreamIssues=");
        zd2.y(sb, this.k, ", decoderUnavailableIssues=", this.l, ", renderReadyTimeouts=");
        zd2.y(sb, this.m, ", platformTimeoutFrames=", this.n, ", missingMainFrames=");
        zd2.y(sb, this.o, ", missingImageOverlayFrames=", this.p, ", missingVideoOverlayFrames=");
        zd2.y(sb, this.q, ", maxConsecutiveNonExactFrames=", this.r, ", maxConsecutiveBlackFrames=");
        zd2.y(sb, this.s, ", recoveredBlackSequences=", this.t, ", firstIssuePositionUs=");
        sb.append(this.u);
        sb.append(", lastIssuePositionUs=");
        sb.append(this.v);
        sb.append(")");
        return sb.toString();
    }
}
