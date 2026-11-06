package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class f07 {
    public final String a;
    public final Map b;

    public f07(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f07)) {
            return false;
        }
        f07 f07Var = (f07) obj;
        return this.a.equals(f07Var.a) && this.b.equals(f07Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Event(name=" + this.a + ", params=" + this.b + ")";
    }
}
