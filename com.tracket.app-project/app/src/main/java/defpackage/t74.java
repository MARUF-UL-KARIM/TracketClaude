package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class t74 extends y1 implements Serializable {
    public final Object A;
    public final Object z;

    public t74(Object obj, Object obj2) {
        super(0, false);
        this.z = obj;
        this.A = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.z;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.A;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
