package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class it7 {
    public final String a;
    public final Map b;

    public it7(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it7)) {
            return false;
        }
        it7 it7Var = (it7) obj;
        return this.a.equals(it7Var.a) && this.b.equals(it7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AnalyticsEvent(name=" + this.a + ", params=" + this.b + ")";
    }
}
