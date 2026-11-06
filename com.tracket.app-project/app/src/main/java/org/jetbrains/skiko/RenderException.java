package org.jetbrains.skiko;

import defpackage.l82;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public class RenderException extends RuntimeException {
    public /* synthetic */ RenderException(String str, Throwable th, int i, l82 l82Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th);
    }

    public RenderException(String str, Throwable th) {
        super(str, th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RenderException() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
