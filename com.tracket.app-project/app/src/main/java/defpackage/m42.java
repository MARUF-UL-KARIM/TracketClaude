package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public interface m42 extends j42 {
    void E(y72 y72Var);

    long b(n42 n42Var);

    void close();

    Uri getUri();

    default Map s() {
        return Collections.EMPTY_MAP;
    }
}
