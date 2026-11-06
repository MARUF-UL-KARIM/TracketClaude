package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class fz2 implements dv5 {
    public static final fz2 c = new fz2();

    @Override // defpackage.xh8
    public final Set a() {
        return iz2.y;
    }

    @Override // defpackage.xh8
    public final boolean c() {
        return true;
    }

    @Override // defpackage.xh8
    public final List d(String str) {
        str.getClass();
        return null;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dv5) && ((dv5) obj).isEmpty();
    }

    @Override // defpackage.xh8
    public final boolean isEmpty() {
        return true;
    }

    public final String toString() {
        return "Parameters " + iz2.y;
    }
}
