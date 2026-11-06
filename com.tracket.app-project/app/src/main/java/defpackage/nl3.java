package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class nl3 implements Comparable {
    public final String A;
    public final String B;
    public final int y;
    public final int z;

    public nl3(int i, int i2, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.y = i;
        this.z = i2;
        this.A = str;
        this.B = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        nl3 nl3Var = (nl3) obj;
        nl3Var.getClass();
        int i = this.y - nl3Var.y;
        return i == 0 ? this.z - nl3Var.z : i;
    }
}
