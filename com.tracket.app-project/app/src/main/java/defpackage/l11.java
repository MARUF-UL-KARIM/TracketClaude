package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class l11 {
    public final ju a;
    public int b;

    public l11(int i) {
        switch (i) {
            case 1:
                this.a = new ju();
                break;
            default:
                this.a = new ju();
                break;
        }
    }

    public void a(byte[] bArr) {
        synchronized (this) {
            int i = this.b;
            if (bArr.length + i < tu.a) {
                this.b = i + (bArr.length / 2);
                this.a.addLast(bArr);
            }
        }
    }

    public void b(char[] cArr) {
        cArr.getClass();
        synchronized (this) {
            int i = this.b;
            if (cArr.length + i < tu.a) {
                this.b = i + cArr.length;
                this.a.addLast(cArr);
            }
        }
    }

    public byte[] c(int i) {
        byte[] bArr;
        synchronized (this) {
            ju juVar = this.a;
            bArr = null;
            byte[] bArr2 = (byte[]) (juVar.isEmpty() ? null : juVar.removeLast());
            if (bArr2 != null) {
                this.b -= bArr2.length / 2;
                bArr = bArr2;
            }
        }
        return bArr == null ? new byte[i] : bArr;
    }

    public char[] d(int i) {
        char[] cArr;
        synchronized (this) {
            ju juVar = this.a;
            cArr = null;
            char[] cArr2 = (char[]) (juVar.isEmpty() ? null : juVar.removeLast());
            if (cArr2 != null) {
                this.b -= cArr2.length;
                cArr = cArr2;
            }
        }
        return cArr == null ? new char[i] : cArr;
    }
}
