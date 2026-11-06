package androidx.fragment.app.strictmode;

import defpackage.dm3;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public abstract class Violation extends RuntimeException {
    public final dm3 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Violation(dm3 dm3Var, String str) {
        super(str);
        dm3Var.getClass();
        this.y = dm3Var;
    }
}
