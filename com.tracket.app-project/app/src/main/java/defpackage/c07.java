package defpackage;

import com.tracket.ads.AdsException;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class c07 extends e07 {
    public final AdsException a;

    public c07(AdsException adsException) {
        this.a = adsException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c07) && this.a == ((c07) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(exception=" + this.a + ")";
    }
}
