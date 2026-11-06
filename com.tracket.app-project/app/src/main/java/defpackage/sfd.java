package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class sfd {
    public static final sfd c;
    public static final sfd d;
    public static final sfd e;
    public static final sfd f;
    public static final sfd g;
    public static final sfd h;
    public static final sfd i;
    public static final sfd j;
    public static final sfd k;
    public static final sfd l;
    public static final sfd m;
    public static final sfd n;
    public static final sfd o;
    public final /* synthetic */ int a;
    public final String b;

    static {
        int i2 = 0;
        c = new sfd("ENABLED", i2);
        d = new sfd("DISABLED", i2);
        e = new sfd("DESTROYED", i2);
        int i3 = 1;
        f = new sfd("ASSUME_AES_GCM", i3);
        g = new sfd("ASSUME_XCHACHA20POLY1305", i3);
        h = new sfd("ASSUME_CHACHA20POLY1305", i3);
        i = new sfd("ASSUME_AES_CTR_HMAC", i3);
        j = new sfd("ASSUME_AES_EAX", i3);
        k = new sfd("ASSUME_AES_GCM_SIV", i3);
        int i4 = 2;
        l = new sfd("TINK", i4);
        m = new sfd("CRUNCHY", i4);
        n = new sfd("LEGACY", i4);
        o = new sfd("NO_PREFIX", i4);
    }

    public /* synthetic */ sfd(String str, int i2) {
        this.a = i2;
        this.b = str;
    }

    public final String toString() {
        int i2 = this.a;
        return this.b;
    }
}
