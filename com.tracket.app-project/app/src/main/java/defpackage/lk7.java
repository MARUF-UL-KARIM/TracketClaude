package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class lk7 {
    public final String a;
    public final lq3 b;
    public final boolean c;

    public lk7(String str, lq3 lq3Var) {
        this.a = str;
        this.b = lq3Var;
    }

    public final String toString() {
        return "AccessibilityKey: " + this.a;
    }

    public /* synthetic */ lk7(String str) {
        this(str, gk7.I);
    }

    public lk7(String str, int i) {
        this(str);
        this.c = true;
    }

    public lk7(String str, boolean z, lq3 lq3Var) {
        this(str, lq3Var);
        this.c = z;
    }
}
