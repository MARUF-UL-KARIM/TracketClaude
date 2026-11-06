package defpackage;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public interface h01 extends cz7, WritableByteChannel {
    h01 P(String str);

    @Override // defpackage.cz7, java.io.Flushable
    void flush();

    OutputStream j0();

    h01 writeByte(int i);
}
