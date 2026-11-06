package defpackage;

import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class db2 extends cwe {
    public final Object a = new Object();
    public final ExecutorService b = Executors.newFixedThreadPool(4, new cb2(0));
    public volatile Handler c;
}
