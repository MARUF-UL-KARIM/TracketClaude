package defpackage;

import androidx.lifecycle.Lifecycle$Event;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public interface bk8 extends Closeable, zr4, mq5 {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    @do5(Lifecycle$Event.ON_DESTROY)
    void close();
}
