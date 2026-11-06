package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class h8a implements ThreadFactory {
    public final /* synthetic */ int a;
    public final AtomicInteger b;
    public final /* synthetic */ String c;

    public h8a(String str, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.c = str;
                this.b = new AtomicInteger(1);
                break;
            default:
                this.c = str;
                this.b = new AtomicInteger(1);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.a;
        String str = this.c;
        AtomicInteger atomicInteger = this.b;
        switch (i) {
            case 0:
                int andIncrement = atomicInteger.getAndIncrement();
                StringBuilder sb = new StringBuilder(mi9.d(str, 12, String.valueOf(andIncrement).length()));
                sb.append("AdWorker(");
                sb.append(str);
                sb.append(") #");
                sb.append(andIncrement);
                return new Thread(runnable, sb.toString());
            default:
                int andIncrement2 = atomicInteger.getAndIncrement();
                StringBuilder sb2 = new StringBuilder(mi9.d(str, 12, String.valueOf(andIncrement2).length()));
                sb2.append("AdWorker(");
                sb2.append(str);
                sb2.append(") #");
                sb2.append(andIncrement2);
                return new Thread(runnable, sb2.toString());
        }
    }
}
