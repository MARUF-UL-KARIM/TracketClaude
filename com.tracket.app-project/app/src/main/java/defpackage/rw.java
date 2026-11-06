package defpackage;

import com.google.firebase.encoders.proto.Protobuf$IntEncoding;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class rw implements zj6 {
    public final int c;

    public rw(int i) {
        this.c = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return zj6.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zj6)) {
            return false;
        }
        zj6 zj6Var = (zj6) obj;
        return this.c == zj6Var.tag() && Protobuf$IntEncoding.y.equals(zj6Var.intEncoding());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.c ^ 14552422) + (Protobuf$IntEncoding.y.hashCode() ^ 2041407134);
    }

    @Override // defpackage.zj6
    public final Protobuf$IntEncoding intEncoding() {
        return Protobuf$IntEncoding.y;
    }

    @Override // defpackage.zj6
    public final int tag() {
        return this.c;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.c + "intEncoding=" + Protobuf$IntEncoding.y + ')';
    }
}
