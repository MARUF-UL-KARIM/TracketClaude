package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class tu4 {
    public final Object a;
    public ue3 b = new ue3(0);
    public boolean c;
    public boolean d;

    public tu4(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tu4.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((tu4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
