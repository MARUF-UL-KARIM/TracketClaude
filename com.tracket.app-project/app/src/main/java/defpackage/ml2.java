package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ml2 implements Comparable {
    public final float y;

    public /* synthetic */ ml2(float f) {
        this.y = f;
    }

    public static final /* synthetic */ ml2 a(float f) {
        return new ml2(f);
    }

    public static int b(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return 0;
        }
        return Float.compare(f, f2);
    }

    public static final boolean c(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    public static String d(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return b(this.y, ((ml2) obj).y);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ml2) {
            return Float.compare(this.y, ((ml2) obj).y) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.y);
    }

    public final String toString() {
        return d(this.y);
    }
}
