package defpackage;

import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class hoc {
    public Message a;

    public final void a() {
        Message message = this.a;
        message.getClass();
        message.sendToTarget();
        this.a = null;
        moc.f(this);
    }
}
