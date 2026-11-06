package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public class zzht extends IOException {
    public final int y;

    public zzht() {
        this.y = 2008;
    }

    public zzht(String str, int i) {
        super(str);
        this.y = i;
    }

    public zzht(String str, Exception exc, int i) {
        super(str, exc);
        this.y = i;
    }

    public zzht(int i, Exception exc) {
        super(exc);
        this.y = i;
    }
}
