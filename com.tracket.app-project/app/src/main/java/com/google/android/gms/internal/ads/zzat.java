package com.google.android.gms.internal.ads;

import defpackage.zd2;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public class zzat extends IOException {
    public final boolean y;
    public final int z;

    public zzat(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.y = z;
        this.z = i;
    }

    public static zzat a(RuntimeException runtimeException, String str) {
        return new zzat(str, runtimeException, true, 1);
    }

    public static zzat b(String str) {
        return new zzat(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        String strConcat = message != null ? message.concat(" ") : "";
        int length = strConcat.length();
        boolean z = this.y;
        int length2 = String.valueOf(z).length() + length + 20;
        int i = this.z;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + length2 + 11 + 1);
        sb.append(strConcat);
        sb.append("{contentIsMalformed=");
        sb.append(z);
        sb.append(", dataType=");
        return zd2.o(sb, i, "}");
    }
}
