package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.ApiException;
import defpackage.pyd;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class zzmk extends RuntimeException {
    public final int y;

    public zzmk(int i, String str, ApiException apiException) {
        String strValueOf;
        if (str != null) {
            StringBuilder sb = new StringBuilder(pyd.a(i, 2) + str.length());
            sb.append(i);
            sb.append(": ");
            sb.append(str);
            strValueOf = sb.toString();
        } else {
            strValueOf = String.valueOf(i);
        }
        super(strValueOf, apiException);
        this.y = i;
    }
}
