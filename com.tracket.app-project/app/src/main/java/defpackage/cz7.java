package defpackage;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public interface cz7 extends Closeable, Flushable {
    void W(long j, vz0 vz0Var);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    uz8 f();

    void flush();
}
