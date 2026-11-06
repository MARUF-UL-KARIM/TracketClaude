package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class f6a implements h6a, IInterface {
    public final IBinder y;

    public f6a(IBinder iBinder) {
        this.y = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.y;
    }
}
