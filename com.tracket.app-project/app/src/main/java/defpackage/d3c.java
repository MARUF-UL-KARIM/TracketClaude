package defpackage;

import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class d3c extends TimeoutException {
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d3c(String str, int i) {
        super(str);
        this.y = i;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        int i = this.y;
        synchronized (this) {
            switch (i) {
                case 0:
                    setStackTrace(new StackTraceElement[0]);
                    return this;
                default:
                    setStackTrace(new StackTraceElement[0]);
                    return this;
            }
        }
    }
}
