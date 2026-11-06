package defpackage;

import com.google.firebase.sessions.DataCollectionState;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class h42 {
    public final DataCollectionState a;
    public final DataCollectionState b;
    public final double c;

    public h42(DataCollectionState dataCollectionState, DataCollectionState dataCollectionState2, double d) {
        this.a = dataCollectionState;
        this.b = dataCollectionState2;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h42)) {
            return false;
        }
        h42 h42Var = (h42) obj;
        return this.a == h42Var.a && this.b == h42Var.b && Double.compare(this.c, h42Var.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.a + ", crashlytics=" + this.b + ", sessionSamplingRate=" + this.c + ')';
    }
}
