package defpackage;

import com.tracket.paywall.PayException;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class qu0 {
    public static final PayException.Reason a(int i) {
        if (i == -1) {
            return PayException.Reason.DISCONNECTED;
        }
        if (i == 12) {
            return PayException.Reason.NETWORK;
        }
        if (i == 1) {
            return PayException.Reason.USER_CANCELED;
        }
        if (i != 2) {
            return i != 3 ? PayException.Reason.UNKNOWN : PayException.Reason.UNAVAILABLE;
        }
        return PayException.Reason.NETWORK;
    }
}
