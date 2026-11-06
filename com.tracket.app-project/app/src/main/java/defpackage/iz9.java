package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class iz9 implements Comparable {
    public final int y;
    public final ez9 z;

    public iz9(int i, ez9 ez9Var) {
        this.y = i;
        this.z = ez9Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.y, ((iz9) obj).y);
    }
}
