package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class op8 {
    public static final op8 a = new op8();

    public final sp8 a(Looper looper, Handler.Callback callback) {
        return new sp8(new Handler(looper, callback));
    }
}
