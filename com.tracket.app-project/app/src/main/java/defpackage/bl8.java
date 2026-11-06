package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class bl8 implements yk8, Serializable {
    public final Object y;

    public bl8(Object obj) {
        this.y = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bl8) {
            return fwb.a(this.y, ((bl8) obj).y);
        }
        return false;
    }

    @Override // defpackage.yk8
    public final Object get() {
        return this.y;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.y});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.y + ")";
    }
}
