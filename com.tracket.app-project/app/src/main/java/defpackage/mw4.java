package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class mw4 {
    public static final lw4 a = new lw4();

    public abstract String a();

    public abstract String b();

    public abstract int c();

    public abstract String d();

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogSite{ class=");
        sb.append(a());
        sb.append(", method=");
        sb.append(d());
        sb.append(", line=");
        sb.append(c());
        if (b() != null) {
            sb.append(", file=");
            sb.append(b());
        }
        sb.append(" }");
        return sb.toString();
    }
}
