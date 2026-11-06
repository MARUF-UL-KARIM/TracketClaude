package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class y9d extends aad {
    public static final aad f(int i) {
        if (i < 0) {
            return aad.b;
        }
        return i > 0 ? aad.c : aad.a;
    }

    @Override // defpackage.aad
    public final aad a(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // defpackage.aad
    public final aad b(int i, int i2) {
        return f(Integer.compare(i, i2));
    }

    @Override // defpackage.aad
    public final aad c(boolean z, boolean z2) {
        return f(Boolean.compare(z2, z));
    }

    @Override // defpackage.aad
    public final aad d(boolean z, boolean z2) {
        return f(Boolean.compare(z, z2));
    }

    @Override // defpackage.aad
    public final int e() {
        return 0;
    }
}
