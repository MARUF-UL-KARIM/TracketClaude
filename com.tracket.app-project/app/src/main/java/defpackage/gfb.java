package defpackage;

import com.google.android.gms.internal.mlkit_vision_subject_segmentation.zzcc;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class gfb implements njb {
    public final int c;

    public gfb(int i) {
        this.c = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return njb.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof njb)) {
            return false;
        }
        njb njbVar = (njb) obj;
        return this.c == njbVar.zza() && zzcc.y.equals(njbVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.c ^ 14552422) + (zzcc.y.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.c + "intEncoding=" + zzcc.y + ')';
    }

    @Override // defpackage.njb
    public final int zza() {
        return this.c;
    }

    @Override // defpackage.njb
    public final zzcc zzb() {
        return zzcc.y;
    }
}
