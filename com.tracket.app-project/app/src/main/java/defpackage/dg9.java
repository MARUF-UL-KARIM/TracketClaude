package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dg9 implements uj6 {
    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        return uj6.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return (obj instanceof uj6) && 1 == ((uj6) obj).number();
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return Integer.hashCode(1) ^ 1779747127;
    }

    @Override // defpackage.uj6
    public final /* synthetic */ int number() {
        return 1;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@kotlinx.serialization.protobuf.ProtoNumber(number=1)";
    }
}
