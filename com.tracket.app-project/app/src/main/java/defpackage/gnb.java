package defpackage;

import java.io.Closeable;
import java.nio.ByteBuffer;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class gnb implements Closeable {
    public final /* synthetic */ int y;
    public final Object z;

    public gnb() {
        this.y = 1;
        this.z = new Inflater(true);
    }

    public int c(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = (ByteBuffer) this.z;
        if (byteBuffer2.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), byteBuffer2.remaining());
        byte[] bArr = new byte[iMin];
        byteBuffer2.get(bArr);
        byteBuffer.put(bArr);
        return iMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.y) {
            case 0:
                break;
            default:
                ((Inflater) this.z).end();
                break;
        }
    }

    public long d() {
        return ((ByteBuffer) this.z).position();
    }

    public gnb(ByteBuffer byteBuffer) {
        this.y = 0;
        this.z = byteBuffer.duplicate();
    }

    private final void a() {
    }
}
