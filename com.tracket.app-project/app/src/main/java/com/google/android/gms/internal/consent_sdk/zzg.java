package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import defpackage.yhd;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class zzg extends Exception {
    public zzg(int i, String str) {
        super(str);
    }

    public final yhd a() {
        if (getCause() == null) {
            Log.w("UserMessagingPlatform", super.getMessage());
        } else {
            Log.w("UserMessagingPlatform", super.getMessage(), getCause());
        }
        return new yhd(super.getMessage(), 2);
    }

    public zzg(int i, IOException iOException, String str) {
        super(str, iOException);
    }
}
