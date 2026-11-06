package com.google.android.gms.internal.ads;

import defpackage.gke;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public class zzih extends zzht {
    public final int z;

    public zzih(IOException iOException, int i, int i2) {
        super(i == 2000 ? i2 != 1 ? 2000 : 2001 : i, iOException);
        this.z = i2;
    }

    public static zzih a(IOException iOException, int i) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else {
            i2 = (message == null || !gke.g(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i2 == 2007 ? new zzig("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007, 1) : new zzih(iOException, i2, i);
    }

    public zzih() {
        this.z = 1;
    }

    public zzih(String str, int i, int i2) {
        super(str, i == 2000 ? i2 != 1 ? 2000 : 2001 : i);
        this.z = i2;
    }

    public zzih(String str, IOException iOException, int i, int i2) {
        super(str, iOException, i == 2000 ? i2 != 1 ? 2000 : 2001 : i);
        this.z = i2;
    }
}
