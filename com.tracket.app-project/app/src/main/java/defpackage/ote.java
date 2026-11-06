package defpackage;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ote {
    public static final ote c;
    public final String a;
    public final q66 b;

    static {
        new ote("");
        c = new ote("preload");
    }

    public ote(String str) {
        q66 q66Var;
        this.a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            q66Var = new q66();
            q66Var.a = LogSessionId.LOG_SESSION_ID_NONE;
        } else {
            q66Var = null;
        }
        this.b = q66Var;
    }
}
