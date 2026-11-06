package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class j45 {
    public long a;
    public long b;
    public int c;
    public final Object d;

    public j45() {
        this.d = ByteBuffer.allocate(23).order(ByteOrder.LITTLE_ENDIAN);
        this.a = 0L;
        this.b = 0L;
        this.c = 0;
    }

    public void a() {
        ByteBuffer byteBuffer = (ByteBuffer) this.d;
        byteBuffer.flip();
        while (byteBuffer.remaining() >= 16) {
            b(byteBuffer);
        }
        byteBuffer.compact();
    }

    public void b(ByteBuffer byteBuffer) {
        long j = byteBuffer.getLong();
        long j2 = byteBuffer.getLong();
        long jRotateLeft = (Long.rotateLeft(j * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.a;
        this.a = jRotateLeft;
        long jRotateLeft2 = Long.rotateLeft(jRotateLeft, 27);
        long j3 = this.b;
        this.a = ((jRotateLeft2 + j3) * 5) + 1390208809;
        long jRotateLeft3 = (Long.rotateLeft(j2 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ j3;
        this.b = jRotateLeft3;
        this.b = ((Long.rotateLeft(jRotateLeft3, 31) + this.a) * 5) + 944331445;
        this.c += 16;
    }

    public j45 c(int i, byte[] bArr) {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr, 0, i).order(ByteOrder.LITTLE_ENDIAN);
        int iRemaining = byteBufferOrder.remaining();
        ByteBuffer byteBuffer = (ByteBuffer) this.d;
        if (iRemaining <= byteBuffer.remaining()) {
            byteBuffer.put(byteBufferOrder);
            if (byteBuffer.remaining() < 8) {
                a();
            }
            return this;
        }
        int iPosition = 16 - byteBuffer.position();
        for (int i2 = 0; i2 < iPosition; i2++) {
            byteBuffer.put(byteBufferOrder.get());
        }
        a();
        while (byteBufferOrder.remaining() >= 16) {
            b(byteBufferOrder);
        }
        byteBuffer.put(byteBufferOrder);
        return this;
    }

    public /* synthetic */ j45(int i, long j, long j2, Object obj) {
        this.c = i;
        this.d = obj;
        this.a = j;
        this.b = j2;
    }
}
