package defpackage;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class bb3 {
    public final String a;
    public final Map b;

    public bb3(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public static vhb a(String str) {
        return new vhb(str, 11);
    }

    public static bb3 c(String str) {
        return new bb3(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb3)) {
            return false;
        }
        bb3 bb3Var = (bb3) obj;
        return this.a.equals(bb3Var.a) && this.b.equals(bb3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.b.values() + "}";
    }
}
