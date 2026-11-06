package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public interface pqb {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    void a();

    ByteBuffer b();

    boolean c();

    boolean e();

    void f();

    void g(kpb kpbVar);

    iob h(iob iobVar);

    void i(ByteBuffer byteBuffer);

    default long d(long j) {
        return j;
    }
}
