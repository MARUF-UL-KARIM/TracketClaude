package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class kc2 implements h28 {
    public final jc2 a;
    public h28 b;

    public kc2(jc2 jc2Var) {
        this.a = jc2Var;
    }

    @Override // defpackage.h28
    public final boolean a() {
        return true;
    }

    @Override // defpackage.h28
    public final String b(SSLSocket sSLSocket) {
        h28 h28VarE = e(sSLSocket);
        if (h28VarE != null) {
            return h28VarE.b(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.h28
    public final boolean c(SSLSocket sSLSocket) {
        return this.a.c(sSLSocket);
    }

    @Override // defpackage.h28
    public final void d(SSLSocket sSLSocket, String str, List list) {
        h28 h28VarE = e(sSLSocket);
        if (h28VarE != null) {
            h28VarE.d(sSLSocket, str, list);
        }
    }

    public final synchronized h28 e(SSLSocket sSLSocket) {
        try {
            if (this.b == null && this.a.c(sSLSocket)) {
                this.b = this.a.j(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }
}
