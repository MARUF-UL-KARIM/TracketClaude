package com.tracket.paywall;

import defpackage.ng8;
import defpackage.rh8;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class PayException extends Exception {
    public static final /* synthetic */ int A = 0;
    public final String y;
    public final Reason z;

    /* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
    public enum Reason {
        NETWORK((rh8) ng8.m.getValue(), (rh8) ng8.l.getValue()),
        DISCONNECTED((rh8) ng8.p.getValue(), (rh8) ng8.o.getValue()),
        USER_CANCELED((rh8) ng8.t.getValue(), (rh8) ng8.s.getValue()),
        UNAVAILABLE((rh8) ng8.i.getValue(), (rh8) ng8.h.getValue()),
        UNKNOWN((rh8) ng8.r.getValue(), (rh8) ng8.q.getValue());

        public final rh8 y;
        public final rh8 z;

        Reason(rh8 rh8Var, rh8 rh8Var2) {
            this.y = rh8Var;
            this.z = rh8Var2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayException(String str, Reason reason) {
        super(str);
        reason.getClass();
        this.y = str;
        this.z = reason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayException)) {
            return false;
        }
        PayException payException = (PayException) obj;
        return this.y.equals(payException.y) && this.z == payException.z;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.y;
    }

    public final int hashCode() {
        return this.z.hashCode() + (this.y.hashCode() * 31);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "PayException(message=" + this.y + ", reason=" + this.z + ")";
    }
}
