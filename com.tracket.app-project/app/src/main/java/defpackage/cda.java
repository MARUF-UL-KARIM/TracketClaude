package defpackage;

import com.google.android.gms.internal.mlkit_vision_common.zzah;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class cda implements hja {
    public final int c;

    public cda(int i) {
        this.c = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return hja.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hja)) {
            return false;
        }
        hja hjaVar = (hja) obj;
        return this.c == hjaVar.zza() && zzah.y.equals(hjaVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.c ^ 14552422) + (zzah.y.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.c + "intEncoding=" + zzah.y + ')';
    }

    @Override // defpackage.hja
    public final int zza() {
        return this.c;
    }

    @Override // defpackage.hja
    public final zzah zzb() {
        return zzah.y;
    }
}
