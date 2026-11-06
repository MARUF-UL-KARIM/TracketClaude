package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public interface o44 extends IInterface {
    void endSession(y44 y44Var, String str);

    void open(y44 y44Var, String str, String str2, Bundle bundle, boolean z, s44 s44Var);

    void prewarm(y44 y44Var, List list, q44 q44Var);
}
