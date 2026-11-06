package defpackage;

import android.content.IntentSender;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class t2a implements u2a {
    public final IntentSender.SendIntentException a;

    public t2a(IntentSender.SendIntentException sendIntentException) {
        this.a = sendIntentException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t2a) && this.a.equals(((t2a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failed(cause=" + this.a + ")";
    }
}
