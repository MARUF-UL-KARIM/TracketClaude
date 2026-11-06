package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class jk9 {
    public final String a;
    public final gk9 b;

    public jk9(String str, gk9 gk9Var) {
        this.a = str;
        this.b = gk9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jk9)) {
            return false;
        }
        jk9 jk9Var = (jk9) obj;
        return this.a.equals(jk9Var.a) && this.b.equals(jk9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "VideoEncoderSetupAttempt(name=" + this.a + ", request=" + this.b + ")";
    }
}
