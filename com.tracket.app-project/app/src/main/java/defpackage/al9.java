package defpackage;

import com.tracket.rendering.producers.VideoFrameProducerRole;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class al9 {
    public final VideoFrameProducerRole a;
    public final String b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final Long f;
    public final Boolean g;
    public final Boolean h;
    public final Boolean i;
    public final String j;
    public final String k;
    public final Boolean l;
    public final String m;
    public final String n;

    public /* synthetic */ al9(VideoFrameProducerRole videoFrameProducerRole, String str, Long l, Long l2, Long l3, Long l4, Boolean bool, Boolean bool2, Boolean bool3, String str2, String str3, Boolean bool4, String str4, String str5, int i) {
        this((i & 1) != 0 ? null : videoFrameProducerRole, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : l2, (i & 16) != 0 ? null : l3, (i & 32) != 0 ? null : l4, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : bool2, (i & 256) != 0 ? null : bool3, (i & 512) != 0 ? null : str2, (i & 1024) != 0 ? null : str3, (i & 2048) != 0 ? null : bool4, (i & 4096) != 0 ? null : str4, (i & 8192) != 0 ? null : str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al9)) {
            return false;
        }
        al9 al9Var = (al9) obj;
        return this.a == al9Var.a && ff4.h(this.b, al9Var.b) && ff4.h(this.c, al9Var.c) && ff4.h(this.d, al9Var.d) && ff4.h(this.e, al9Var.e) && ff4.h(this.f, al9Var.f) && ff4.h(this.g, al9Var.g) && ff4.h(this.h, al9Var.h) && ff4.h(this.i, al9Var.i) && ff4.h(this.j, al9Var.j) && ff4.h(this.k, al9Var.k) && ff4.h(this.l, al9Var.l) && ff4.h(this.m, al9Var.m) && ff4.h(this.n, al9Var.n);
    }

    public final int hashCode() {
        VideoFrameProducerRole videoFrameProducerRole = this.a;
        int iHashCode = (videoFrameProducerRole == null ? 0 : videoFrameProducerRole.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.d;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.e;
        int iHashCode5 = (iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f;
        int iHashCode6 = (iHashCode5 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Boolean bool = this.g;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.h;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.i;
        int iHashCode9 = (iHashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str2 = this.j;
        int iHashCode10 = (iHashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.k;
        int iHashCode11 = (iHashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool4 = this.l;
        int iHashCode12 = (iHashCode11 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str4 = this.m;
        int iHashCode13 = (iHashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.n;
        return iHashCode13 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoFrameDeliveryContext(producerRole=");
        sb.append(this.a);
        sb.append(", clipId=");
        sb.append(this.b);
        sb.append(", positionUs=");
        iu1.x(sb, this.c, ", positionInClipUs=", this.d, ", clipEndInClipUs=");
        iu1.x(sb, this.e, ", lastDecodedFrameUs=", this.f, ", decoderInputFinished=");
        sb.append(this.g);
        sb.append(", decoderOutputFinished=");
        sb.append(this.h);
        sb.append(", decoderReleased=");
        sb.append(this.i);
        sb.append(", decoderBackend=");
        sb.append(this.j);
        sb.append(", decoderName=");
        sb.append(this.k);
        sb.append(", decoderHardwareAccelerated=");
        sb.append(this.l);
        sb.append(", decoderDetail=");
        return zd2.r(sb, this.m, ", errorType=", this.n, ")");
    }

    public al9(VideoFrameProducerRole videoFrameProducerRole, String str, Long l, Long l2, Long l3, Long l4, Boolean bool, Boolean bool2, Boolean bool3, String str2, String str3, Boolean bool4, String str4, String str5) {
        this.a = videoFrameProducerRole;
        this.b = str;
        this.c = l;
        this.d = l2;
        this.e = l3;
        this.f = l4;
        this.g = bool;
        this.h = bool2;
        this.i = bool3;
        this.j = str2;
        this.k = str3;
        this.l = bool4;
        this.m = str4;
        this.n = str5;
    }
}
