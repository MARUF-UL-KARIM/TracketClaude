package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public interface qm8 extends Closeable {
    boolean F();

    void G(Object[] objArr);

    void H();

    Cursor I(um8 um8Var, CancellationSignal cancellationSignal);

    void J();

    Cursor R(String str);

    void T();

    boolean Z();

    boolean isOpen();

    boolean k();

    void m();

    Cursor n(um8 um8Var);

    void q();

    void r(String str);

    ym8 u(String str);

    void x();
}
