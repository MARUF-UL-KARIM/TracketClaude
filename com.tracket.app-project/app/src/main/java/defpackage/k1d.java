package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class k1d implements Comparable {
    public final Runnable y;
    public final long z;

    public k1d(long j, Runnable runnable) {
        this.y = runnable;
        this.z = j;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.z, ((k1d) obj).z);
    }
}
