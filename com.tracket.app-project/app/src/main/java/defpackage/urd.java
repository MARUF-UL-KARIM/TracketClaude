package defpackage;

import java.security.spec.ECParameterSpec;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class urd {
    public static final urd c = new urd("NIST_P256", akd.a);
    public static final urd d = new urd("NIST_P384", akd.b);
    public static final urd e = new urd("NIST_P521", akd.c);
    public final String a;
    public final ECParameterSpec b;

    public urd(String str, ECParameterSpec eCParameterSpec) {
        this.a = str;
        this.b = eCParameterSpec;
    }

    public final String toString() {
        return this.a;
    }
}
