package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class bwd implements CharSequence {
    public char[] y;
    public String z;

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.y[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.y.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new String(this.y, i, i2 - i);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        String str = this.z;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.y);
        this.z = str2;
        return str2;
    }
}
