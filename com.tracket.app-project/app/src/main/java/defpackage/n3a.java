package defpackage;

import androidx.work.WorkInfo$State;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class n3a {
    public String a;
    public WorkInfo$State b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3a)) {
            return false;
        }
        n3a n3aVar = (n3a) obj;
        if (this.b != n3aVar.b) {
            return false;
        }
        return this.a.equals(n3aVar.a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
