package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class kv4 {
    public final long a;
    public final float b;
    public final long c;

    public kv4(jv4 jv4Var) {
        this.a = jv4Var.a;
        this.b = jv4Var.b;
        this.c = jv4Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kv4)) {
            return false;
        }
        kv4 kv4Var = (kv4) obj;
        return this.a == kv4Var.a && this.b == kv4Var.b && this.c == kv4Var.c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Float.valueOf(this.b), Long.valueOf(this.c));
    }
}
