package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.PushbackInputStream;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class c3b extends PushbackInputStream {
    public final /* synthetic */ w91 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3b(w91 w91Var, ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream) {
        super(autoCloseInputStream, 1);
        this.y = w91Var;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        ((z3f) this.y.B).l();
        super.close();
    }
}
