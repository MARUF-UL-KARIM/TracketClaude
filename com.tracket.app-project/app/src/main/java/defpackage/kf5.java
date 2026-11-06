package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class kf5 {
    public final /* synthetic */ int a = 0;
    public String b;
    public String c;

    public kf5(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                return (obj instanceof it5) && this.b == null && this.c == null;
            default:
                return super.equals(obj);
        }
    }

    public int hashCode() {
        switch (this.a) {
            case 0:
                String str = this.b;
                int iHashCode = str == null ? 0 : str.hashCode();
                String str2 = this.c;
                return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "Pair{" + ((Object) this.b) + " " + ((Object) this.c) + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ kf5() {
    }
}
