package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class hmd {
    public static final hmd b = new hmd("SHA1");
    public static final hmd c = new hmd("SHA224");
    public static final hmd d = new hmd("SHA256");
    public static final hmd e = new hmd("SHA384");
    public static final hmd f = new hmd("SHA512");
    public final String a;

    public hmd(String str) {
        this.a = str;
    }

    public final String toString() {
        return this.a;
    }
}
