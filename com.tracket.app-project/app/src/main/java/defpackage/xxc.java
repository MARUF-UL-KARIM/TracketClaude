package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class xxc implements IInterface {
    public final IBinder y;

    public xxc(IBinder iBinder) {
        this.y = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.y;
    }
}
