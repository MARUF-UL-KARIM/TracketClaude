package com.google.android.gms.internal.ads;

import defpackage.iua;
import java.util.Locale;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class zzavn extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzavn(zzavm zzavmVar, zzavk zzavkVar, long j) {
        Locale locale = Locale.US;
        Long lValueOf = Long.valueOf(j);
        super(String.format(locale, iua.a("bk3t6gFTc30="), Long.valueOf(zzavmVar.y), Long.valueOf(zzavkVar.y), lValueOf));
        Optional.of(zzavkVar);
        Optional.of(lValueOf);
    }

    public zzavn(zzavm zzavmVar, Exception exc) {
        super(String.format(Locale.US, iua.a("bk0="), Long.valueOf(zzavmVar.y)), exc);
        Optional.empty();
        Optional.empty();
    }
}
