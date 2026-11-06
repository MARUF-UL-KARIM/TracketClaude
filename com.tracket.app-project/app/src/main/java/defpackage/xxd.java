package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class xxd extends InputStream {
    public int A;
    public int B;
    public int C;
    public boolean D;
    public byte[] E;
    public int F;
    public Iterator y;
    public ByteBuffer z;

    public final boolean a() {
        ByteBuffer byteBuffer;
        Iterator it = this.y;
        do {
            this.B++;
            if (!it.hasNext()) {
                return false;
            }
            byteBuffer = (ByteBuffer) it.next();
            this.z = byteBuffer;
        } while (!byteBuffer.hasRemaining());
        this.C = this.z.position();
        if (this.z.hasArray()) {
            this.D = true;
            this.E = this.z.array();
            this.F = this.z.arrayOffset();
        } else {
            this.D = false;
            this.E = null;
        }
        return true;
    }

    public final void c(int i) {
        int i2 = this.C + i;
        this.C = i2;
        if (i2 == this.z.limit()) {
            a();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.B == this.A) {
            return -1;
        }
        int iLimit = this.z.limit();
        int i3 = this.C;
        int i4 = iLimit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.D) {
            System.arraycopy(this.E, i3 + this.F, bArr, i, i2);
            c(i2);
            return i2;
        }
        int iPosition = this.z.position();
        this.z.position(this.C);
        this.z.get(bArr, i, i2);
        this.z.position(iPosition);
        c(i2);
        return i2;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.B == this.A) {
            return -1;
        }
        if (this.D) {
            int i = this.E[this.C + this.F] & 255;
            c(1);
            return i;
        }
        int i2 = this.z.get(this.C) & 255;
        c(1);
        return i2;
    }
}
