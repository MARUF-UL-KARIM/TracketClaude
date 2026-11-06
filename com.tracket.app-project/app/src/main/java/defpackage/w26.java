package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class w26 {
    public static final w26 c = new w26(0, false);
    public final boolean a;
    public final int b;

    public w26() {
        this.a = false;
        this.b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w26)) {
            return false;
        }
        w26 w26Var = (w26) obj;
        return this.a == w26Var.a && this.b == w26Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.a + ", emojiSupportMatch=" + ((Object) qy2.a(this.b)) + ')';
    }

    public w26(int i, boolean z) {
        this.a = z;
        this.b = i;
    }
}
