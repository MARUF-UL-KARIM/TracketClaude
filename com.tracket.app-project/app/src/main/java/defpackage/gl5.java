package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class gl5 {
    public final NotificationManager a;

    static {
        new HashSet();
    }

    public gl5(Context context) {
        this.a = (NotificationManager) context.getSystemService("notification");
    }
}
