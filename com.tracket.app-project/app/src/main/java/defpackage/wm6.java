package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class wm6 extends InputStream {
    public final /* synthetic */ ym6 A;
    public int y;
    public int z;

    public wm6(ym6 ym6Var, vm6 vm6Var) {
        this.A = ym6Var;
        this.y = ym6Var.V(vm6Var.z + 4);
        this.z = vm6Var.A;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (bArr == null) {
            bd3.w("buffer");
            return 0;
        }
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = this.z;
        if (i3 <= 0) {
            return -1;
        }
        if (i2 > i3) {
            i2 = i3;
        }
        int i4 = this.y;
        ym6 ym6Var = this.A;
        ym6Var.B(i4, bArr, i, i2);
        this.y = ym6Var.V(this.y + i2);
        this.z -= i2;
        return i2;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        ym6 ym6Var = this.A;
        RandomAccessFile randomAccessFile = ym6Var.y;
        if (this.z == 0) {
            return -1;
        }
        randomAccessFile.seek(this.y);
        int i = randomAccessFile.read();
        this.y = ym6Var.V(this.y + 1);
        this.z--;
        return i;
    }
}
