package defpackage;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ks1 {
    public final HashSet a = new HashSet();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ks1.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((ks1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
