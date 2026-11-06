package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class wb8 extends mw4 {
    public final StackTraceElement b;

    public wb8(StackTraceElement stackTraceElement) {
        this.b = stackTraceElement;
    }

    @Override // defpackage.mw4
    public final String a() {
        return this.b.getClassName();
    }

    @Override // defpackage.mw4
    public final String b() {
        return this.b.getFileName();
    }

    @Override // defpackage.mw4
    public final int c() {
        return Math.max(this.b.getLineNumber(), 0);
    }

    @Override // defpackage.mw4
    public final String d() {
        return this.b.getMethodName();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wb8) {
            return this.b.equals(((wb8) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
