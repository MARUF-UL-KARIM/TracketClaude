package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class jqa implements Comparable {
    public final int y;
    public final fqa z;

    public jqa(int i, fqa fqaVar) {
        this.y = i;
        this.z = fqaVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.y, ((jqa) obj).y);
    }
}
