package defpackage;

import com.tracket.editor.export.ExportFailureKind;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class o43 {
    public final ExportFailureKind a;
    public final String b;
    public final Long c;
    public final Long d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final Integer i;
    public final Integer j;
    public final Integer k;
    public final Integer l;
    public final Long m;

    public /* synthetic */ o43(ExportFailureKind exportFailureKind, Long l, String str, String str2, String str3, String str4, Integer num, Integer num2, Integer num3, Integer num4, int i) {
        this((i & 1) != 0 ? null : exportFailureKind, (i & 2) != 0 ? null : "MediaCodec", (i & 4) != 0 ? null : l, null, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : num, (i & 512) != 0 ? null : num2, (i & 1024) != 0 ? null : num3, (i & 2048) != 0 ? null : num4, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o43)) {
            return false;
        }
        o43 o43Var = (o43) obj;
        return this.a == o43Var.a && ff4.h(this.b, o43Var.b) && ff4.h(this.c, o43Var.c) && ff4.h(this.d, o43Var.d) && ff4.h(this.e, o43Var.e) && ff4.h(this.f, o43Var.f) && ff4.h(this.g, o43Var.g) && ff4.h(this.h, o43Var.h) && ff4.h(this.i, o43Var.i) && ff4.h(this.j, o43Var.j) && ff4.h(this.k, o43Var.k) && ff4.h(this.l, o43Var.l) && ff4.h(this.m, o43Var.m);
    }

    public final int hashCode() {
        ExportFailureKind exportFailureKind = this.a;
        int iHashCode = (exportFailureKind == null ? 0 : exportFailureKind.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.d;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.i;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.j;
        int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.k;
        int iHashCode11 = (iHashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.l;
        int iHashCode12 = (iHashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Long l3 = this.m;
        return iHashCode12 + (l3 != null ? l3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExportFailureDetails(kind=");
        sb.append(this.a);
        sb.append(", nativeDomain=");
        sb.append(this.b);
        sb.append(", nativeCode=");
        iu1.x(sb, this.c, ", nativeStatus=", this.d, ", nativeComponent=");
        ot5.C(sb, this.e, ", nativeDiagnostic=", this.f, ", operation=");
        ot5.C(sb, this.g, ", encoderAttempt=", this.h, ", outputWidth=");
        sb.append(this.i);
        sb.append(", outputHeight=");
        sb.append(this.j);
        sb.append(", bitrate=");
        sb.append(this.k);
        sb.append(", frameRate=");
        sb.append(this.l);
        sb.append(", writerStatus=");
        sb.append(this.m);
        sb.append(")");
        return sb.toString();
    }

    public o43(ExportFailureKind exportFailureKind, String str, Long l, Long l2, String str2, String str3, String str4, String str5, Integer num, Integer num2, Integer num3, Integer num4, Long l3) {
        this.a = exportFailureKind;
        this.b = str;
        this.c = l;
        this.d = l2;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = num;
        this.j = num2;
        this.k = num3;
        this.l = num4;
        this.m = l3;
    }
}
