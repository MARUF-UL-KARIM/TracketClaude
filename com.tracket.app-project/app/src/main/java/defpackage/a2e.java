package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public abstract class a2e implements rta {
    public static final c2e F = c2e.e(a2e.class);
    public ByteBuffer B;
    public long C;
    public gnb E;
    public final String y;
    public long D = -1;
    public boolean A = true;
    public boolean z = true;

    public a2e(String str) {
        this.y = str;
    }

    @Override // defpackage.rta
    public final void a(gnb gnbVar, ByteBuffer byteBuffer, long j, ita itaVar) {
        this.C = gnbVar.d();
        byteBuffer.remaining();
        this.D = j;
        this.E = gnbVar;
        ((ByteBuffer) gnbVar.z).position((int) (gnbVar.d() + j));
        this.A = false;
        this.z = false;
        d();
    }

    public final synchronized void b() {
        try {
            if (this.A) {
                return;
            }
            try {
                c2e c2eVar = F;
                String str = this.y;
                c2eVar.d(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                gnb gnbVar = this.E;
                long j = this.C;
                long j2 = this.D;
                ByteBuffer byteBuffer = (ByteBuffer) gnbVar.z;
                int iPosition = byteBuffer.position();
                byteBuffer.position((int) j);
                ByteBuffer byteBufferSlice = byteBuffer.slice();
                byteBufferSlice.limit((int) j2);
                byteBuffer.position(iPosition);
                this.B = byteBufferSlice;
                this.A = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract void c(ByteBuffer byteBuffer);

    public final synchronized void d() {
        try {
            b();
            c2e c2eVar = F;
            String str = this.y;
            c2eVar.d(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
            ByteBuffer byteBuffer = this.B;
            if (byteBuffer != null) {
                this.z = true;
                byteBuffer.rewind();
                c(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    byteBuffer.slice();
                }
                this.B = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
