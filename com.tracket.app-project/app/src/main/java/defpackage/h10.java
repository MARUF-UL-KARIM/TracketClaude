package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public interface h10 {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    boolean a();

    boolean b();

    ByteBuffer c();

    void d(g10 g10Var);

    void e(ByteBuffer byteBuffer);

    f10 f(f10 f10Var);

    void g();

    void reset();

    default long h(long j) {
        return j;
    }
}
